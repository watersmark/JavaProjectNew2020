public class Solution {

    public  static int rec_3(int digit, int number){
        int sum = 0;

        if(digit + 3 > number) {
            if(digit < number){
                return digit;
            }
            else{
                return 0;
            }
        }

        sum += digit + rec_3(digit + 3, number);
        return sum;
    }

    public static  int rec_5(int digit, int number){

        int sum = 0;

        if(digit + 5 > number){
            if(digit < number){
                return digit;
            }
            else{
                return 0;
            }
        }
        int step = rec_5(digit + 5, number);
        sum = digit + step ;
        if((digit + 5) % 3 == 0 && step != 0) return (sum - (digit + 5));



        return sum;
    }

    public int solution(int number) {

        return Solution.rec_3(0, number) + Solution.rec_5(0, number);
    }
}
