class Troll {
    public static String disemvowel(String str) {
        String[] engl_word = new String[]{"a", "A", "e", "E", "U", "u", "O", "o", "I", "i"};
        String good_string = new String();

        for (String elem : str.split("")) {
            boolean step = true;

            for (String elem_2 : engl_word) {
                if (elem.equals(elem_2)) {
                    step = false;
                    break;
                }

            }
            if (step)
                good_string += elem;

        }

        return good_string;
    }
}


public class TrollMain {
    public static void main(String[] args) {
        String first = "ATA am a good troll and you are stupid";

        System.out.println(Troll.disemvowel(first));

    }
}
