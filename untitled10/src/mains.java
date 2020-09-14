import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class mains {
    public static void main(String[] args) throws IOException {



        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());

            int a1 = 32;
            int b = a1 / a;

            try{
                int c = 2;
                int l = c / 0;
            }
            catch (NumberFormatException w){
                System.out.println("Bad");
            }

        }
        catch (ArithmeticException e){
            System.out.println("Goodjob");
            //System.out.println(e);
        }
        catch (NumberFormatException e){
            System.out.println("Number Exception");
        }





    }
}
