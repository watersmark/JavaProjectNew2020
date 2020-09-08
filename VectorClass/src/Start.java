public class Start {
    public static void main(String[] args) {
        VectorAdd first = new VectorAdd(1, 2, 3);
        VectorAdd second = new VectorAdd(2, 4, 6);

        double digit = first.scalar_vector(second);
        System.out.println(digit);

        System.out.println(first.length_vector());

        System.out.println(first.arc_vector(second));

        VectorAdd[] mass = VectorAdd.random_vector(50);
        System.out.println(mass.length);
        for(VectorAdd elem : mass){
            System.out.println(elem.get_param());
        }
    }
}
