import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;

class PantsException extends  Exception{

    PantsException(){
        System.out.println("Its pants");
    }

    public PantsException(String message, Throwable cause) {
        super(message, cause);
    }
}

class Wear_exception extends  Exception{

}

class test1{

    public static void risks(int x) throws RuntimeException, PantsException, Wear_exception{
        if(x == 0) throw  new Wear_exception();
        else{
            System.out.println("GG");
        }
    }
}

public class main {

    public static void main(String[] args) {

        RuntimeException first = new RuntimeException();
        int x = 0;

        try{
            if(x == 0){
                throw first;
            }
        }

        catch(Exception e){
           String a = e.getMessage();
            //System.out.println(a);
            System.out.println("its message");
        }

        finally{
            System.out.println("New message");
        }
    }
}
