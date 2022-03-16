package Les6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class main {

    public static void main(String[] args) {

            try (
                    ServerSocket serverSocket = new ServerSocket(9090)) {
                System.out.println("Сервер запущен");
                Socket client = serverSocket.accept();
                System.out.println("Новое подключение");
                DataInputStream dataInputStream = new DataInputStream(client.getInputStream());
                DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());

                while (true) {
                    String echo = dataInputStream.readUTF();
                    System.out.println(echo);
                    if (echo.equals("/stop")) {
                        dataOutputStream.writeUTF("Cервер закончил работу");
                        break;
                    }
                    dataOutputStream.writeUTF(echo);

                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());








       /* 2. Подобрать источник самостоятельно. Можно использовать api accuweather, порядок следующий:
       зарегистрироваться, зарегистрировать тестовое приложение для получения api ключа, найдите нужный
       endpoint и изучите документацию. Бесплатный тарифный план предполагает получение погоды не более,
       чем на 5 дней вперед (этого достаточно для выполнения д/з).
        */

            }
        }
    }







