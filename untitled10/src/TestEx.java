import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class TestException {

    public int min(int a, int b) throws RuntimeException, IllegalAccessException, ArithmeticException {

        try {
            throw new IllegalAccessException();
        } finally {
            System.out.println("BB");
            throw new ArithmeticException();
        }

    }

    public int ages(int b) throws ErrorExcept {

        throw new ErrorExcept(b);
    }


    public void temp12(){

        NullPointerException first = new NullPointerException("Very very bad exception");
        first.initCause(new ArithmeticException("DD"));

        throw first;

    }
}

class ErrorExcept extends Exception {
    private int detail = 0;

    ErrorExcept(int a) {
        this.detail = a;
    }

    @Override
    public String toString() {
        return "This is new Error " + this.detail;
    }
}





public class TestEx {
    public static void main(String[] args) {

        try {
            TestException second = new TestException();
            second.temp12();
        }
        catch (NullPointerException | ArithmeticException e){
            System.out.println(e);
            System.out.println(e.getCause());
        }
        finally {
            System.out.println("This end");
        }

    }
}