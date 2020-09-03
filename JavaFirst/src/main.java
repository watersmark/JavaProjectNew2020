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

        Integer x = 1;
        Integer y = 2;

        if(x.equals(y)){
            System.out.println("GG");
        }
        else{
            System.out.println("BB");
        }
    }
}
