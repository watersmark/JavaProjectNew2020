import java.util.ArrayList;

public class PrimaryDigit {
    public static void main(String[] args) {

        ArrayList<Integer> primary_list = new ArrayList<>();

        for(int i = 2; i < 101; i++){
            boolean primary = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    primary = false;
                    break;
                }

            }
            
            if(primary == true){
                primary_list.add(i);
            }

        }

        for(int i: primary_list){
            System.out.print(i + " ");
        }
        System.out.println("Count primary digit is == " + primary_list.size());

    }
}
