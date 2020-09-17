class AreSame {

    public static boolean comp(int[] a, int[] b) {

        if(a == null || b == null) return false;


        boolean bool = false;
        for(int i : b){
            for(int j : a){
                if(i == (j * j)){
                    bool = true;
                    break;
                }
            }

            if(!bool) return false;

            bool = false;
        }

        return true;

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
