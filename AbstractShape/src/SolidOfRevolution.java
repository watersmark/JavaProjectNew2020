abstract public class SolidOfRevolution extends Shape {

    public double height;
    public String information;

    SolidOfRevolution(String design, int height) {
        super(design);
        this.height = height;
    }

    abstract public String information();

}

class Cylinder extends SolidOfRevolution{

    private String inform;

    Cylinder(String design, double height, String inform, double vol){
        super(design, (int) height);
        this.inform = inform;
        this.volume = vol;
    }

    public String information(){
        return this.inform;
    }

    @Override
    public double get_volume() {
        return this.volume;
    }

    @Override
    public void inform(String obj_inform) {
        System.out.println(obj_inform);
    }
}