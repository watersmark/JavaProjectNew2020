class Solution {
    public static String camelCase(String input) {
        String res_str = "";

        for(String elem : input.split("")){
            try {
                int digit = (int) elem.charAt(0);


                if (digit >= 65 && digit <= 90) {
                    res_str += " ";
                }
                res_str += elem;
            }
            catch (IndexOutOfBoundsException e){
                break;
            }
        }
        return res_str;
    }
}

public class mains {
    public static void main(String[] args) {


        String res  = Solution.camelCase("camelCasingBasing");
        System.out.println(res);
    }
}
