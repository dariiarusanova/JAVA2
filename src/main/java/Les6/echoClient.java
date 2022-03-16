package Les6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class echoClient {
    //обучение, тренировка.

    public static void main(String[] args) {
        final String ServerAddress = "Localhost";
        final int ServerPort = 9090;
        try (Socket clientSocket = new Socket(ServerAddress, ServerPort)) {
            DataInputStream dataInputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String read = scanner.nextLine();
                dataOutputStream.writeUTF(read);
                String fromServer = dataInputStream.readUTF();
                System.out.println(fromServer);
            }

        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}


