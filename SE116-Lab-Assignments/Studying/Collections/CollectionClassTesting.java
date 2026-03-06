import java.util.ArrayList;
import java.util.Collections;

public class CollectionClassTesting {
    public static void main(String[] args){

        ArrayList<Integer> testList = new ArrayList<Integer>();

        testList.add(21);
        testList.add(5);
        testList.add(3);
        testList.add(2);
        testList.add(9);

        System.out.println("Unsorted --> "+testList);

        Collections.sort(testList);
        System.out.println("Sorted --> "+testList);

        Collections.shuffle(testList);
        System.out.println("Shuffled --> "+testList);

        Collections.sort(testList);
        System.out.println(Collections.binarySearch(testList, 3));

        testList.add(21);
        System.out.println("Frequency --> "+Collections.frequency(testList, 21));

        Collections.swap(testList,0,1);
        System.out.println("Before swape --> "+testList);
        System.out.println("Swaped the index 0 with index 1 --> " + testList);

        Collections.fill(testList, 0);
        System.out.println("After fill --> "+testList);

    }
}
