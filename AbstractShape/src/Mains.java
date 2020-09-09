import java.util.ArrayList;

public class Mains {
    public static void main(String[] args) {

        Pyramid pyr1 = new Pyramid("Origin", 10, 20);
        double a = pyr1.get_volume();
        //System.out.println(a);

        Cylinder cyl1 = new Cylinder("Palenka", 32.4, "Good Tovar", 43.2);
        //cyl1.inform("Good");
        //System.out.println(cyl1.get_volume());

        ArrayList<Shape> listShape = new ArrayList<Shape>();

        listShape.add(pyr1);
        listShape.add(cyl1);

        for(Shape elem : listShape){
            System.out.println(elem.design);
            System.out.println(elem.get_volume());
            if(elem instanceof Pyramid){
               String nooo =  ((Pyramid) elem).Nothing();
                System.out.println(nooo);
            }
        }
    }
}
