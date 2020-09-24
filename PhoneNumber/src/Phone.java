import java.util.Arrays;

class Kata {
    public static String createPhoneNumber(int[] numbers) {
        String result = "";

        for(int i =0; i < 10; i++){

            if(i == 0){
                result += "(" + numbers[i];
                continue;
            }

            if(i == 2){
                result += numbers[i] +  ") ";
                continue;
            }

            if(i == 5){
                result += numbers[i] + "-";
                continue;
            }

            result += numbers[i];




        }

        return result;
    }
}


public class Phone {
    public static void main(String[] args) {

        int[] mass = new int[]{-8, -2, -5, -4, -7, -1};
        Arrays.sort(mass);
        for(int i : mass){
            System.out.println(i + " ");
        }


    }
}
