import java.util.ArrayList;

public class Testing_Collections {
    public static void main(String[] args){
        ArrayList<String> testList = new ArrayList<String>();
        //String[] testArray = new String[0];

        long startTime = System.currentTimeMillis();

        int count = 100000000;
        boolean useList = true;

        //Basically will create an array or list that has count element
        if (useList) {
            for (int i=0;i<count;i++){
                testList.add("count");
            }
        } else {
            String[] testArray = new String[count];
        }

        System.out.println("Execution time: "+(System.currentTimeMillis()-startTime));

    }
}
