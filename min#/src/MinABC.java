public class MinABC {

        public static int mins(int a, int b, int c) {

            if (a <= b && a <= c) {
                return a;
            } else if (b <= a && b <= c) {
                return b;
            } else {
                return c;
            }
        }

        public static void main(String[] args) {

        /*
        System.out.println(mins(1, 2, 3));
        System.out.println(mins(-1, -2, -3));
        System.out.println(mins(3, 5, 3));
        System.out.println(mins(5, 5, 10));
        System.out.println(mins(1, 2, 3));
        */

            System.out.println(mins(1, 1, 2));
        }
    }



