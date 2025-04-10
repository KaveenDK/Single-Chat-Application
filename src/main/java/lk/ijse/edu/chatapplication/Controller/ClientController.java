package lk.ijse.edu.chatapplication.Controller;

/**
 * --------------------------------------------
 * @Author Dimantha Kaveen
 * @GitHub: https://github.com/KaveenDK
 * --------------------------------------------
 * @Created 4/10/2025
 * @Project Chat Application
 * --------------------------------------------
 **/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;
import java.nio.file.Files;

public class ClientController {

    @FXML
    private TextArea txtArea;

    @FXML
    private ImageView imageView;

    @FXML
    private TextField txtMessage;

    private DataOutputStream dataOutputStream;
    private DataInputStream dataInputStream;
    private Socket socket;

    public void initialize() {
        new Thread(() -> {
            try {
                socket = new Socket("localhost", 4000);
                dataInputStream = new DataInputStream(socket.getInputStream());
                dataOutputStream = new DataOutputStream(socket.getOutputStream());

                while (true) {
                    String message = dataInputStream.readUTF();

                    if (message.equals("IMAGE")) {
                        int length = dataInputStream.readInt();
                        byte[] imageBytes = new byte[length];
                        dataInputStream.readFully(imageBytes);
                        ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                        Image image = new Image(bais);
                        imageView.setImage(image);
                    }

                    txtArea.appendText("Server: " + message + "\n");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    @FXML
    void sendOnAction(ActionEvent event) {
        try {
            String message = txtMessage.getText();
            dataOutputStream.writeUTF(message);
            dataOutputStream.flush();
            txtArea.appendText("Client: " + txtMessage.getText() + "\n");
            txtMessage.clear();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void sendImageOnAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Image");
        File file = fileChooser.showOpenDialog(new Stage());
        if (file != null) {
            try {
                byte[] imageBytes = Files.readAllBytes(file.toPath());
                dataOutputStream.writeUTF("IMAGE");
                dataOutputStream.writeInt(imageBytes.length);
                dataOutputStream.write(imageBytes);
                dataOutputStream.flush();
                txtArea.appendText(file.getName() + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}