class RecArray {

    public static void rec(int x) {

        if (x == 0) return;
        else {
            rec(x - 1);
        }
        
        System.out.println(x);
    }
}



public class main {
    public static void main(String[] args) {

    }
}
