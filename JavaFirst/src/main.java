import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;

class test1{

    public static void risks(int x) throws RuntimeException{
        if(x == 0) throw  new RuntimeException();
        else{
            System.out.println("GG");
        }
    }
}

public class main {

    public static void main(String[] args) {


        try{
            test1.risks(0);
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        finally {
            System.out.println("BB");
        }

    }
}
