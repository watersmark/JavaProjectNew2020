class ThreadNew implements Runnable {
    String name;
    public Thread t;

    ThreadNew(String name) {
        this.name = name;
        this.t = new Thread(this, this.name);
        this.t.start();

    }

    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(name + i);
            //Thread.sleep(0);
        }

        System.out.println(this.name + " Thread end");
    }
}


public class Temps {
    public static void main(String[] args) throws InterruptedException {

        ThreadNew one = new ThreadNew("One");
        ThreadNew two = new ThreadNew("Two");
        ThreadNew third = new ThreadNew("Three");

        one.t.setPriority(8);
        two.t.setPriority(7);
        third.t.setPriority(6);

        System.out.println(one.t.isAlive());
        System.out.println(two.t.isAlive());
        System.out.println(third.t.isAlive());


        try {
            one.t.join();
            two.t.join();
            third.t.join();
        } catch (InterruptedException e) {
            System.out.println("Error");
        }

        System.out.println(one.t.isAlive());
        System.out.println(two.t.isAlive());
        System.out.println(third.t.isAlive());

        System.out.println("Main thread is end");

    }
}
