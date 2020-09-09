abstract public class Shape {

    public double volume;

    public String design;
    // Получаем обьём
    abstract public double get_volume();

    abstract public void inform(String obj_inform);

    Shape(String design){
        this.design = design;
    }

}

class Pyramid extends Shape{

    int pyr_s;
    int pyr_h;

    Pyramid(String design, int S, int h){
        super(design);
        this.pyr_h = h;
        this.pyr_s = S;
    }

    @Override
    public double get_volume(){
        return (3 * this.pyr_h * this.pyr_s);
    }

    @Override
    public void inform(String obj_inform){
        System.out.println(obj_inform);
    }
    public String Nothing(){
        return "It is Nothing";
    }

}