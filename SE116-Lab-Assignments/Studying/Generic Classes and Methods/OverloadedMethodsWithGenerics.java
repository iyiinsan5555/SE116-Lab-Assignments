public class OverloadedMethodsWithGenerics {
    public static void main(String[] args) {
        //For some reason you cannot use primitive types for generics.
        //You must use wrapper classes like: int --> Integer, double --> Double, char --> Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        printArray(integerArray);
        printArray(doubleArray);
        printArray(characterArray);
    }

    public static <T> void printArray(T[] a) {
        for (T e : a) {
            System.out.printf("%s ", e);
        }
        System.out.println();
    }

}
