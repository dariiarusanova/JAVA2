package Les5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // 1. Реализовать сохранение данных в csv файл;
        try {
            FileOutputStream SaveFileLess5 = new FileOutputStream("Счастье внутри берегущего.csv", true);
            byte[] Databytes = "Счастье внутри берегущего".getBytes(StandardCharsets.UTF_8);
            SaveFileLess5.write(Databytes);
            SaveFileLess5.close();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

//2. Реализовать загрузку данных из csv файла. Файл читается целиком.
        // ДЛЯ ФАЙЛА СЧАСТЬЕ ВНУТРИ:
        try {
            FileInputStream LookFileLess5 = new FileInputStream("Счастье внутри берегущего.csv");
            byte[] bytes = new byte[LookFileLess5.available()];
            LookFileLess5.read(bytes);
            System.out.println(new String(bytes));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        //ДЛЯ ФАЙЛА APPDATA:

        try {
            FileOutputStream SaveFile = new FileOutputStream("Файл из AppData.csv", true);
            byte[] Databytess = "AppData".getBytes(StandardCharsets.UTF_8);
            SaveFile.write(Databytess);
            SaveFile.close();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        try {
            FileInputStream READAPDATA = new FileInputStream("Файл из AppData.csv");
            ArrayList<Byte> read = new ArrayList<>();
            final int EOF = -1;
            int temp = 0;
            while ((temp = READAPDATA.read()) != EOF) {
                read.add((byte) temp);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(newData());
    }
    public static AppData newData () {
        AppData appData = new AppData();
        String[] headers = new String[]{"title 1", "title 2", "title 3"};
        appData.init(headers);

        return appData;
    }

}
