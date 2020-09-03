import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Isomorf first = new Isomorf(32);
        Isomorf second = new Isomorf(12, true);

        ArrayList<ClassesTest> list_f = new ArrayList<ClassesTest>();
        list_f.add(first);
        list_f.add(second);
        list_f.add(new Polymorf());
        list_f.add(new Polymorf(12,true));

        for(ClassesTest item : list_f){

            if(item instanceof Polymorf){
                item.information();
                System.out.println(((Polymorf) item).agree);
            }
            if(item instanceof Isomorf){
                ((Isomorf) item).isomorf_hash((int) (Math.random() * 10));
                System.out.println(((Isomorf) item).agree);
            }
        }
    }
}
