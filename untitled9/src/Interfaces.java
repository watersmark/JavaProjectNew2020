interface classeable {

    private int age(int a) {
        return a;
    }

    default int pac1(int b) {
        return age(b);
    }

    default int pac2(int c) {
        return age(c);
    }

}


class TestInt implements classeable {
    public int pac2(int a){
        return 21;
    }

    public void test1() {
        System.out.println(pac2(11));
    }

}


public class Interfaces {
    public static void main(String[] args) {
        TestInt first = new TestInt();
        first.test1();

        int aa = first.pac1(11);
        System.out.println(aa);


        Orn sec = new Orn();
        System.out.println(sec.gg_ff());
    }
}
