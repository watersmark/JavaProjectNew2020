import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MusicList {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int elem = Integer.parseInt(reader.readLine());
        if(elem > 0) {
            String rus = reader.readLine();
            String eng = reader.readLine();

            String[] rus_new = rus.split(" ");
            String[] eng_new = eng.split(" ");

            int[] new_mass = new int[elem * 2];

            for (int i = 0; i < rus_new.length; i++) {
                new_mass[2 * i] = Integer.parseInt(rus_new[i]);
                new_mass[2 * i + 1] = Integer.parseInt(eng_new[i]);
            }

            for (int i = 0; i < elem * 2; i++) {
                if (i < (elem * 2) - 1) {
                    System.out.print(new_mass[i] + " ");
                } else {
                    System.out.print(new_mass[i]);
                }
            }
        }
        else {
            System.out.print("");
        }
    }
}
