class Test_Static{

    public static final int x = 5;
    public  double y = (double) (Math.random() * 3);

}

class Test_Static_UnStatic{

    public static int xor1 = 32;

    public static void set_xor1(int x){
        xor1 = x;
    }

    public void get_xor1(){
        System.out.println(xor1);
        set_xor1(12);
        System.out.println(xor1);
    }
}


public class main {

    public static void main(String[] args) {
        /*
        for(int x = 0; x < 5; x++){
            System.out.println(new Test_Static().y);
        }
         */

        Test_Static_UnStatic  first1 = new Test_Static_UnStatic();
        first1.get_xor1();
    }
}
