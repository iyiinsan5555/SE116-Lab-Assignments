import java.util.ArrayList;
import java.util.LinkedList;

public class Testing2_Collections {
    public static void main(String[] args){
        ArrayList<String> testArrayList = new ArrayList<String>();
        LinkedList<String> testLinkedList = new LinkedList<String>();

        long startTime = System.currentTimeMillis();

        int count = 300000000;
        boolean useArrayList = false;

        //Testing if LinkedList can handle out of memory.
        //Unfortunately I did not reach my goal, both of them gave error. :/
        if (useArrayList) {
            for (int i=0;i<count;i++){
                testArrayList.add("count");
            }
        } else {
            for (int i=0;i<count;i++){
                testLinkedList.add("count");
            }
        }

        System.out.println("Execution time: "+(System.currentTimeMillis()-startTime));

    }
}
