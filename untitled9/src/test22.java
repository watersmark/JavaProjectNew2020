public class test22 {

    private int ff(){
        return 44;
    }

    public int gg_ff(){
        return ff();
    }

}

class Orn extends test22{

    @Override
    public int gg_ff() {
        return super.gg_ff();
    }
}