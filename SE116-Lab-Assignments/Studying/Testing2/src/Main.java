import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Student std1 = new Student("Melih", 4.00);
        Student std2 = new Student("Ayşe" ,2.5);
        Student std3 = new Student("Şapşal", 1.1);
        Student std4 = new Student("Batu", 3.1);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(std1);
        studentArrayList.add(std2);
        studentArrayList.add(std3);
        studentArrayList.add(std4);

        System.out.println(studentArrayList);

        Collections.sort(studentArrayList); //uses comparable (ascending)
        System.out.println(studentArrayList);

        Comparator<Student> studentComparator = (Student s1, Student s2) -> Double.compare(s2.getGPA(), s1.getGPA()); //descending
        Collections.sort(studentArrayList, studentComparator);

        System.out.println(studentArrayList);

        //Same thing with the lambda
        Collections.sort(studentArrayList, new StudentComparator());

        System.out.println(studentArrayList);

    }
}
