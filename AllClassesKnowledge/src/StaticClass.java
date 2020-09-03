public class StaticClass {
   private  StaticClass(){}

    public static final double pi = 3.14;
    public static final double e = 2.7;

    public  static double cost(){
        return Math.random() * 5;
    }

    static public int ages(int ages) throws RuntimeException{

        if(ages < 0){
            throw new RuntimeException();
        }
        System.out.println(1/ 0);
        return 32;
    }
}
