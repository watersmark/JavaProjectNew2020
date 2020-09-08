import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DelElem {

    public static int[] elem_del(int[] mass, int elem) {


        int count_del = 0;

        // Подсчитаем кол-во вхождений элемента
        for (int i = 0; i < mass.length; i++) {

            if (mass[i] == elem) {
                count_del++;
            }
        }

        int[] new_mass = new int[mass.length - count_del];

        // Запишем в новый массив все элементы кроме удаляемого
        int offset = 0;
        for (int i = 0; i < mass.length; i++){
            if(mass[i] == elem){
                offset ++;

            }
            else{
                new_mass[i - offset] = mass[i];
            }

        }

        return new_mass;

    }

}

public class mains {
    public static void main(String[] args) throws IOException {


        int[] mass_test = new int[]{1, 3, 5, 6,3, 1, 8, 1, 9, 1, 0, 5};
        int digit = 1;

        int[] masser = DelElem.elem_del(mass_test, digit);
        for(int i: masser){
            System.out.print(i + " ");
        }


    }
}
