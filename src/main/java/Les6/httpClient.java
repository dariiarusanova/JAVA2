package Les6;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.Scanner;

/* 1. С помощью http запроса получить в виде json строки погоду в Санкт-Петербурге на период времени,
пересекающийся со следующим занятием (например, выборка погода на следующие 5 дней - подойдет)
*/
public class httpClient {
    private final static String WeatherURL = "http://dataservice.accuweather.com/forecasts/v1/daily/5day/294021"; // URL для запроса погоды на 5 дней в СПБ.
    private final static String API_KEY = "?apikey=kGTaPAN229JjTBS6TNd5kGbZeyV28j5v"; // API ключ для запроса.

    public static void main(String[] args) throws MalformedURLException {
        URL weatherUrl = new URL(WeatherURL + API_KEY);
        System.out.println("Протокол " + weatherUrl.getProtocol());
        System.out.println("Порт " + weatherUrl.getPort());
        System.out.println("Адрес хоста " + weatherUrl.getHost());
        System.out.println ("************" );
        System.out.println("Путь к файлу " + weatherUrl.getFile());

        // Сформировали URL для запроса к серверу.
        try {
            HttpURLConnection urlConnection = (HttpURLConnection) weatherUrl.openConnection();
            System.out.println("Код ответа "+ urlConnection.getResponseCode());
            System.out.println("Ответ сервера " + urlConnection.getRequestMethod());
            System.out.println ("************" );
            System.out.println("Формат передачи текста " + urlConnection.getContentType());
            System.out.println ("************" );// К серверу постучались.
            if (urlConnection.getResponseCode() == 200) { // getResponseCode отправляет запрос к серверу по указанному нами URL, который по факту является GET запросом.
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) { // Как было на предыдущих занятиях, чтобы считать данные из
                    StringBuilder responseContent = new StringBuilder();  // сети, необходимо открыть Stream для их чтения.
                    String line = "";
                    System.out.println ("Получили сведения о погоде в Санкт-Петербурге на ближайшие 5 дней в формате JSON: ");// Тут мы используем для работы с сетью BufferedReader.
                    while ((line = reader.readLine()) != null) { // Считываем данные от сервера до конца (тут нет EOF, как в случае с фалами. Если данных нет от сервера, то метод readLine()
                        responseContent.append(line);// вернет null.
                    }
                    System.out.println(responseContent);
                    System.out.println("вот так у нас получилось");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }


    }
}

