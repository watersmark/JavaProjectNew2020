public class Lessons1 {
    public static void main(String[] args) {
        int a = 3;

        if (a > 33) {
            System.out.println(">33");
        } else if (a != 32) {
            System.out.println("== 32");
        } else if (a > 0) {
            System.out.println("a > 0");
        } else {
            System.out.println("end");
        }

        switch (a){
            case 1: {
                System.out.println("1");
                break;
            }

            case 2:
            case 3:
            case 4:
            {
                System.out.println("2 - 4");
                break;
            }

            default: {
                System.out.println("End");
            }
        }


    }
}
