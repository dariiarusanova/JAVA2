package Les5;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Random;
public class AppData {
    private String[] headers;
    private int[][] colums;

    public void init(String[] headers) {
        this.headers = headers;
        Random random = new Random();
        colums = new int[headers.length][headers.length];

        for (int row = 0; row < headers.length; row++) {
            for (int column = 0; column < headers.length; column++) {
                colums[row][column]  = random.nextInt(3);
            }
        }
    }

    public String toString() {
        String result = "";

        for (String word : headers) {
            result += word + ";";
        }

        result += "\n";

        for (int row = 0; row < colums.length; row++) {
            for (int column = 0; column < colums[row].length; column++) {
                result += colums[row][column] + ";";
            }
            result += "\n";
        }
        return result;
    }


}