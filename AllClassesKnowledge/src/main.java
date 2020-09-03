import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        /*
       Morfizm morfizm = new Morfizm(55);
       morfizm.agee(12);
       morfizm.test_class();
       System.out.println(add_area.time_one);
         */

       try{
           StaticClass.ages(12);
       }

       catch (ArithmeticException p){
           System.out.println(p.getMessage());
       }

       catch (RuntimeException e){
           System.out.println(e.getMessage());
           System.out.println("Drop error");
       }

       finally {
           System.out.println("It is end");
       }
    }
}
