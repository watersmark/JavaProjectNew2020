class EnoughIsEnough {
    public static int[] new_mass;

    // Проверяем кол-во вхождений элемента в новый массив
    public static boolean add_element(int maxOccurrences, int elem) {
        int count = 0;

        for (int i = 0; i < new_mass.length; i++) {

            if (new_mass[i] == elem) count++;

            if (count + 1 > maxOccurrences) return false;
        }

        return true;
    }

    // Проверяем есть ли элемент в массиве израсходованных вхождений
    public static boolean check_mass(int elem, int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == elem) return false;
        }
        return true;
    }

    public static int[] return_new_mass(int[] mass){
        int count = 0;
        for(int i = 0; i < mass.length; i++){
            if(mass[i] == 0){
                count++;
            }
        }

        int[] masser = new int[mass.length - count];

        for(int i = 0; i < masser.length; i++){
            masser[i] = mass[i];
        }

        return masser;
    }

    // Основной блок программы
    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        int[] del_mass = new int[elements.length];
        new_mass = new int[elements.length];
        int offset = 0;

        for (int i = 0; i < elements.length; i++) {
            if(check_mass(elements[i], del_mass)){

                // Вносим элемент в один из массивов
                if(add_element(maxOccurrences, elements[i])){
                    new_mass[i - offset] = elements[i];
                }
                else{
                    offset++;
                    del_mass[i - offset] = elements[i];
                }
            }// Увеличили число пропущенных шагов на один
            else {
                offset++;
            }

        }



        return return_new_mass(new_mass);
    }

}