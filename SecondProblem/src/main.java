public class main {
    public static void main(String[] args) {

        int[] mass = new int[]{1, 3, 2, 7, 1, 9, 0, 22, 4, 44};


        for(int i = 0; i < mass.length; i++){
            for(int j = 0; j < mass.length - 1; j++){
                if(mass[j] > mass[ j+ 1]){
                    int first = mass[j];
                    int second = mass[j + 1];
                    mass[j + 1] = first;
                    mass[j] = second;
                }
            }
        }

        
        for(int i : mass){
            System.out.print(i + " ");
        }
    }
}
