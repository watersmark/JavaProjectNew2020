// Make sure your class is public
class Kata {
    public static double findUniq(double arr[]) {

        double sum = 0;
        double elem = 0;


        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        if (arr[0] == arr[1]) {
            elem = arr[0];
        }
        else if(arr[0] != arr[2]){
            elem = arr[2];
        }
        else{
            elem = arr[0];
        }

        Double digit = sum - (elem * (arr.length - 1));
        double temp_digit = Double.parseDouble(String.format("%.13f", digit).replace(',', '.'));

        return temp_digit;
    }
}


public class UniquNumber {
    public static void main(String[] args) {

        System.out.println(Kata.findUniq(new double[]{9.0, 9.0, 2.0, 9.0, 9.0}));

    }
}
