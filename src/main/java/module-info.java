module lk.ijse.edu.chatapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens lk.ijse.edu.chatapplication to javafx.fxml;
    opens lk.ijse.edu.chatapplication.Controller to javafx.fxml;
    exports lk.ijse.edu.chatapplication;
}