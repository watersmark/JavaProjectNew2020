public class VectorAdd {

    private int x = 0;
    private int y = 0;
    private int z = 0;

    VectorAdd(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String get_param(){
        return this.x + " " + this.y + " " + this.z;
    }
    // Вычисляем длину вектора в ОНБ
    public double length_vector(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    // вычисляем скалярное произведение векторов
    public double scalar_vector(VectorAdd vec){
        return (this.x * vec.x) + (this.y * vec.y) + (this.z * vec.z);
    }

    public double arc_vector(VectorAdd vec){
        return (scalar_vector(vec)) / (this.length_vector() * vec.length_vector());
    }

    public static VectorAdd[] random_vector(int N){


        int step = (int) (Math.random() * 100);
        VectorAdd[] mass_vec = new VectorAdd[N];

        for(int i = 0; i < N; i++){

            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            int z = (int) (Math.random() * 10);

            mass_vec[i]  = new VectorAdd(x, y, z);
        }

        return mass_vec;
    }
}
