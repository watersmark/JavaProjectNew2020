interface add_area{

    static int time_one = 0;
    abstract public void test_class();

}

abstract  public class ClassesTest {

    ClassesTest(int time_works){
        works = time_works;
    }

    // переопределяемы поля класса
    abstract void information();
    abstract  public int agee(int ages);

    // Приватные поля класса
    private  static int copys;
    private static final int time_work = (int) (Math.random() * 5);

    //Публичные поля
    public static double works;


    // Работаем с полем copys получение и отдача
    public int getCopys(){
        return copys;
    }
    public void set_copys(final int new_copy){
        copys = new_copy;
    }


    // Работаем с полем time_work получение
    public int getTime_work(){
        return time_work;
    }


}

class Polymorf extends  ClassesTest{
    boolean agree;


    // Основной кон структор
    Polymorf(int time_works, boolean agree){
        super(time_works);
        this.agree = agree;
    }

    //Вспомогательный конструктор
    Polymorf(){
        this(10, false);
    }

    @Override
    public void information(){
        System.out.println("This is polymorf classes");
    }

    @Override
    public int agee(int ages){
        return ages + 1;
    }

}

class Isomorf extends ClassesTest{
    boolean agree;

    // Объявляем конструкторы
    Isomorf(int time_works, boolean agree){
        super(time_works);
        this.agree = agree;
    }

    Isomorf(int time_works){
        super(time_works);
    }

    @Override
    void information() {
        System.out.println("This is isomorfism");
    }

    @Override
    public int agee(final int ages) {
        return ages + 5;
    }

    public void isomorf_hash(int hash){
        System.out.println("Is it isomorf hash" + hash);
    }
}

class Morfizm extends ClassesTest implements add_area{

    Morfizm(int time_work){
        super(time_work);
    }

    @Override
    public void test_class() {
        System.out.println("This is interfacr implement");
    }

    @Override
    void information() {
        System.out.println("This is morfizm class");
    }

    @Override
    public int agee(int ages) {
        return ages + 3;
    }
}