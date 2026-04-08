import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(10);
        integerArrayList.add(9);
        integerArrayList.add(88);

        Comparator<Integer> comparatorObject = (a,b) -> {return Integer.compare(a,b);};

        Collections.sort(integerArrayList, comparatorObject);

        System.out.println(integerArrayList);
    }
}
