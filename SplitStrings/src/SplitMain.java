import  java.lang.Math;

class StringSplit {
    public static String[] solution(String s) {

        String[] mass_string = new String[(int) Math.ceil(s.length() / 2.0)];
        String[] temp_mass =  s.split("");

        //System.out.println(mass_string.length);

        //Остаток от деления ноль
        if(s.length() % 2 == 0){
            for(int i = 0, k = 0; i < s.length(); i += 2, k++){
                mass_string[k] = temp_mass[i] + temp_mass[i + 1];
            }
        }
        else{
            int k = 0;
            for(int i = 0; i < temp_mass.length - 1 ; i += 2, k++){
                mass_string[k] = temp_mass[i] + temp_mass[i + 1];
            }
                mass_string[k] = temp_mass[temp_mass.length - 1] + "_";
        }

        return mass_string;
    }
}
public class SplitMain {
    public static void main(String[] args) {
      String[] first =   StringSplit.solution("abcdefght");

      for(String elem : first){
            System.out.println(elem);
        }

    }
}
