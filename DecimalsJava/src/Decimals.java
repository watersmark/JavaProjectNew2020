import java.text.DecimalFormat;

public class Decimals {

    public static String seriesSum(int n) {
        double sum = 0;
        int step = 4;

        for(int i = 0; i< n; i++){
            if(i == 0){
                sum += 1;
                continue;
            }
            sum += (double) 1 / (step);

            step += 3;
        }

        return new DecimalFormat("#0.00").format(sum);
    }

    public static void main(String[] args) {
        System.out.println(Decimals.seriesSum(5));
    }
}
