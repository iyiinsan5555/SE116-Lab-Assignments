import java.util.Comparator;

public class GpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getGpa(), o1.getGpa());
    }

}
