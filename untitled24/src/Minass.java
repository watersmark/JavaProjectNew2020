class Temp_name implements Runnable {
    public Thread t;
    public static long sum = 0;

    Temp_name() {
        t = new Thread(this::run, "MyRun");
    }

    @Override
    public void run() {

        for (long i = 0; i < 1233323220; i++) {
            try {
                sum += i;
                Thread.sleep(0);
            } catch (InterruptedException e) {
                System.out.println("Error1");
            }
        }
    }
}

class Test_Thread extends Thread {

    Test_Thread() {
        super();
    }

    @Override
    public void run() {


        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("It is " + i);
                Thread.sleep(5);
            }
            catch (InterruptedException w){

            }

        }
    }

}


public class Minass {
    public static void main(String[] args) {

        //System.out.println(Thread.currentThread().getName());

        Temp_name first = new Temp_name();
        first.t.start();

        Test_Thread firm = new Test_Thread();
        firm.start();


        for (int i = 0; i < 100000; i++) {

            try {
                //System.out.println(i);
                Thread.sleep(11);

                if (i % 10 == 0) {
                    System.out.println(Temp_name.sum);
                }
            } catch (InterruptedException e) {
                System.out.println("Error");
            }

        }


    }
}
