package Mains.Cains;

public class main {
    public static void main(String[] args) {

        
        int[][] mass = new int[6][];
        int[] mass_temp = new int[mass.length];

        for(int i = 0; i< 6; i++){
            mass[i] = new int[i + 1];
        }

        for(int i= 0; i < 6; i++){
            System.out.println(mass[i].length);
        }
    }
}
