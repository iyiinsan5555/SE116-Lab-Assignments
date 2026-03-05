import java.util.Comparator;

public class GpaComparator2 implements Comparator<Student2> {

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return Double.compare(o2.getGpa(), o1.getGpa());
    }

}
