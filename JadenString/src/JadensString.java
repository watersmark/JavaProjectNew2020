public class JadensString {
    public static void main(String[] args) {


        JadenCase first = new JadenCase();
        String Jaden_toUpper = first.toJadenCase("Most Trees Are Blue");
        System.out.println(Jaden_toUpper);

    }
}

class JadenCase {

    public String toJadenCase(String phrase) {

        if (phrase == null || phrase.equals("")) {
            return null;
        } else {
            String[] elem = phrase.split(" ");

            String Jaden_return = new String();

            for(int i = 0; i < elem.length; i++){
                if(i != elem.length - 1){
                    Jaden_return += elem[i].substring(0, 1).toUpperCase() + elem[i].substring(1);
                    Jaden_return += " ";
                }
                else{
                    Jaden_return += elem[i].substring(0, 1).toUpperCase() + elem[i].substring(1);
                }
            }

            return Jaden_return;
        }
    }
    /*
    Jaden_return += a.substring(0, 1).toUpperCase() + a.substring(1);
                    Jaden_return += " ";
     */

}