import java.util.Arrays;

class CountingDuplicates {
    public static int duplicateCount(String text) {
        String[] text_mass = text.toLowerCase().split("");
        int count = 0;
        boolean add = false;

        Arrays.sort(text_mass);

        for(int i = 0; i < text_mass.length; i++){
            try {
                if (!text_mass[i].equals(text_mass[i + 1]) && add) {
                    add = false;
                    count++;
                }

                if (text_mass[i].equals(text_mass[i + 1])) {
                    add = true;
                }
            }
            catch (Exception e){
                if(add){
                    count++;
                }
            }
        }

        return count;
    }
}


public class CountingDuplicatesMain {
    public static void main(String[] args) {
       int first = CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix");
       System.out.println(first);
    }
}
