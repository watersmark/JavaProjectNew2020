class AreSame {

    public static boolean comp(int[] a, int[] b) {

        if (a == null || b == null) {
            return false;
        }

        else if (a.length == 0 && b.length == 0) {
            return true;
        }

        else if (a.length == 0 && b.length != 0) {
            return false;
        }
        else if(a.length != 0 && b.length == 0){
            return false;
        }

        else if(a.length != 0 && b.length != 0){
            int[] new_mass = new int[a.length];

            for (int i = 0; i < a.length; i++) {
                new_mass[i] = a[i] * a[i];
            }
            boolean bool = false;
            for (int i = 0; i < b.length; i++) {

                bool = false;

                for (int j = 0; j < new_mass.length; j++) {

                    if (b[i] == new_mass[j]) {
                        bool = true;
                        break;
                    }

                }

                if (!bool) return false;
            }

            if(!bool) {
                return false;
            }

            return true;
        }
        else {
            return false;
        }
    }
}


public class SameMain {
    public static void main(String[] args) {

        int[] a = new int[]{2};
        int[] b = new int[]{4, 4, 4, 4, 4, 4, 4};

        boolean is_bool = AreSame.comp(a, b);
        System.out.println(is_bool);
    }
}
