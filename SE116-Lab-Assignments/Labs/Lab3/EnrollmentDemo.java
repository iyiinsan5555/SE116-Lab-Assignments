import java.util.Collections;

public class EnrollmentDemo {
    public static void main(String[] args) {
        Student student1 = new Student(1263246524, "Melih", 4.00);
        Student student2 = new Student(9932582, "Utkan", 2.75);
        Student student3 = new Student(3623482596688L, "Gökçe", 3.79);

        student1.printInfo();
        student2.printInfo();
        student3.printInfo();

        Course2 course = new Course2("SE116", "Intro to Programming II");
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        Student student4 = new Student(263346, "Ayşen", 1.5);
        course.addStudent(student4);

        System.out.println("---------------------------");
        course.displayEnrolledStudents();

        System.out.println("---------Removing part---------");
        course.removeStudentById(9932582);
        course.displayEnrolledStudents();
        course.removeStudentById(252136346);
        System.out.println(course.size());

        System.out.println("----------Sorting By StudentId-----------");
        Collections.sort(course.getEnrolledStudents());
        course.displayEnrolledStudents();

        System.out.println("--------Sorting By GPA --------");
        Collections.sort(course.getEnrolledStudents(), new GpaComparator());
        course.displayEnrolledStudents();
    }
}
