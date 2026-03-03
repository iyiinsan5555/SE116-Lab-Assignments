public class OverloadedMethods {
    public static void main(String[] args) {
        int[] integerArray = {1, 2, 3, 4, 5, 6};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6,6};
        char[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        printArray(integerArray);
        printArray(doubleArray);
        printArray(characterArray);
    }

    public static void printArray(int[] a) {
        for (int e : a) {
            System.out.printf("%s ", e);
        }
        System.out.println();
    }

    public static void printArray(double[] a) {
        for (double e : a) {
            System.out.printf("%s ", e);
        }
        System.out.println();
    }

    public static void printArray(char[] a) {
        for (char e : a) {
            System.out.printf("%s ", e);
        }
        System.out.println();
    }

}
