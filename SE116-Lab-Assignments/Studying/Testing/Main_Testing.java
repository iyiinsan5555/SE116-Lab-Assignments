import java.util.Arrays;

public class Main_Testing {

    public static void main(String[] args) {

        /*
        int loopCount = 50;
        int num = 2;
        for (int i=0;i<loopCount;i++) {
            num = num * 2;
            System.out.println(num);
        }
         */

        float num1 = 10000000000000000f;
        float num2 = 1f;

        float total = num1 + num2;
        System.out.println(total); // 10,000,000,000,000,000 not 10,000,000,000,000,001
    }

}
