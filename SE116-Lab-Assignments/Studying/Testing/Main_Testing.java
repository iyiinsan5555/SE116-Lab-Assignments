import java.util.Arrays;

public class Main_Testing {

    public static void main(String[] args) {

        int[] myArray = {1,6,2,68,2,42,876,0};
        System.out.println(Arrays.toString(myArray));
        Arrays.fill(myArray, 5); //in order to use binary search array must be sorted
        System.out.println(Arrays.toString(myArray));

    }

}
