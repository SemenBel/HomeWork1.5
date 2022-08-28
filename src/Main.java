public class Main {
    public static void main(String[] args) {
        task4();
    }

    public static void task1() {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] doub = {1.57, 7.654, 9.986};

        long[] big = new long[2];
        big[0] = 3452335345246L;
        big[1] = 995464644245432662L;
    }

    public static void task2() {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        ;
        System.out.print(numbers[numbers.length - 1]);
        System.out.println();

        double[] doub = {1.57, 7.654, 9.986};
        for (int i = 0; i < doub.length; i++) {
            System.out.print(doub[i]);
            if (i != doub.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        long[] big = new long[2];
        big[0] = 3452335345246L;
        big[1] = 995464644245432662L;
        for (int i = 0; i < big.length; i++) {
            System.out.print(big[i]);
            if (i != big.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = numbers.length - 1; i > 0; i--) {
            System.out.print(numbers[i] + ", ");
        }
        ;
        System.out.print(numbers[0]);
        System.out.println();

        double[] doub = {1.57, 7.654, 9.986};
        for (int i = doub.length - 1; i > 0; i--) {
            System.out.print(doub[i] + ", ");
        }
        System.out.print(doub[0]);
        System.out.println();

        long[] big = new long[2];
        big[0] = 3452335345246L;
        big[1] = 995464644245432662L;
        for (int i = big.length - 1; i > 0; i--) {
            System.out.print(big[i] + ", ");
        }
        System.out.print(big[0]);
        System.out.println();
    }

    public static void task4() {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] % 2 != 0) {
            numbers[i]++;
        }
            System.out.print(numbers[i] + ", ");
        }
    }

}