// Make sure your class is public
class Kata {
    public static double findUniq(double arr[]) {

        double sum = 0;
        double elem = 0;


        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        if (arr[0] != arr[1]) {
            if (arr[1] != arr[2]) {
                elem = arr[0];
            }
        } else {
            elem = arr[0];
        }

        Double digit = sum - (elem * (arr.length - 1));
        double temp_digit = Double.parseDouble(String.format("%.2f", digit).replace(',', '.'));

        return temp_digit;
    }
}


public class UniquNumber {
    public static void main(String[] args) {

        System.out.println(Kata.findUniq(new double[]{0.561, 0.54, 0.561, 0.561, 0.561, 0.561}));

    }
}
