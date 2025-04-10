
# Single Chat Application by KaveeN

## Project Overview

The **Single Chat Application** is a JavaFX-based desktop program that enables real-time communication between a client and a server. It supports both text messaging and image sharing, making it a great demonstration of socket programming and modern JavaFX UI design.

## Project Demo

### Client UI
![Client UI](assets/screenshots/client-ui.png)

### Server UI
![Server UI](assets/screenshots/server-ui.png)

> Make sure to place your screenshots in a folder named `screenshots` in the root directory of the project.

## Features

- **Real-time Messaging**: Instantly send and receive text messages.
- **Image Sharing**: Seamlessly share images between client and server.
- **Responsive UI**: Clean and user-friendly interfaces for both client and server.
- **Multi-threaded Communication**: Ensures smooth and non-blocking data transfer.

## Technologies Used

- **Java**: Core application logic  
- **JavaFX**: Graphical User Interface  
- **Maven**: Dependency management and build system  
- **Socket Programming**: Real-time client-server communication

## Clone the Repository

To clone the repository, use the following commands:

```sh
git clone https://github.com/KaveenDK/Single-Chat-Application.git
cd Single-Chat-Application
```

## Project Structure

```
Single-Chat-Application/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── lk/ijse/edu/chatapplication/
│       │       ├── ClientInitializer.java
│       │       ├── ServerInitializer.java
│       │       └── controller/
│       │           ├── ClientController.java
│       │           └── ServerController.java
│       └── resources/
│           └── lk/ijse/edu/chatapplication/
│               │── assets/
│               │   └── screenshots/
│               │       ├── Client.fxml
│               │       └── Server.fxml
│               ├── pages/
│               │   ├── Client.fxml
│               │   └── Server.fxml
│               └── stylesheets/
│                   ├── ClientPage.css
│                   └── ServerPage.css
├── screenshots/
│   ├── client-ui.png
│   └── server-ui.png
├── pom.xml
└── README.md
```

## How to Run the Project

1. Clone the repository using the commands above.
2. Open the project in your favorite IDE (e.g., IntelliJ IDEA or Eclipse).
3. Build the project using Maven.
4. Run the `ServerInitializer.java` to start the server.
5. Run the `ClientInitializer.java` to start the client.
6. Use the UI to send text messages and share images between client and server.

## Future Enhancements

- **Group Chat Support**: Extend the application to support multiple clients in a group.
- **File Sharing**: Add support for sending other file types (e.g., PDFs, audio).
- **Authentication**: Secure login and registration system.
- **UI Enhancements**: Modernize the look and feel with animations and styling.
- **Message History**: Save and display previous conversations.

## ☕ Support Me

If you found this project helpful, consider supporting me:

<a href="https://www.buymeacoffee.com/vpdkkaveenp" target="_blank">Buy me a coffee</a>
