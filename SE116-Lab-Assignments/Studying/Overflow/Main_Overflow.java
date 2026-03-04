public class Main_Overflow {
    public static void main(String[] args) {

        long bigNum = 2147457799987125776L;
        double smallDouble = 0.00000000000000000001;

        System.out.println((bigNum + smallDouble) == (smallDouble + bigNum));
    }
}
