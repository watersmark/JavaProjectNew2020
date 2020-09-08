import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Semaphor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double digit = Double.parseDouble(reader.readLine());

        double iter = digit % 5;
        //System.out.println(iter);

        if (iter >= 0 && iter < 3) {
            System.out.println("зелёный");
        }
        if (iter >= 3 && iter < 4) {
            System.out.println("жёлтый");
        }
        if (iter >= 4 && iter < 5) {
            System.out.println("красный");
        }
    }
}
