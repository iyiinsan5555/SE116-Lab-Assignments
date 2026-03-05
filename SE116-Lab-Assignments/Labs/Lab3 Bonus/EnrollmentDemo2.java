import java.util.ArrayList;

public class EnrollmentDemo2 {
    public static void main(String[] args) {
        Student2 student1 = new Student2(1263246524, "Melih", 1.50);
        Student2 student2 = new Student2(9932582, "Utkan", 2.75);
        Student2 student3 = new Student2(3623482596688L, "Gökçe", 3.79);
        Student2 student4 = new Student2(12523636, "Taylan", 3.05);
        Student2 student5 = new Student2(9993258320L, "Berke", 3.21);

        Course2 course = new Course2("SE116", "Intro to Programming II");
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        course.addStudent(student4);
        course.addStudent(student5);

        course.filterProbation();

        System.out.println(course.size());

        course.displayEnrolledStudents();
        course.displayProbationStudents();

        System.out.println("----- Adding Similar Students -----");
        Student2 std6 = new Student2(23632662, "Alice Smith", 2.5);
        Student2 std7 = new Student2(1532634, "Alice Cooper", 1.75);
        Student2 std8 = new Student2(215236326, "Bob Jones", 0.75);

        course.addStudent(std6);
        course.addStudent(std7);
        course.addStudent(std8);


        ArrayList<Student2> result = course.searchByName("Alice Smith");
        System.out.println(result.toString());
    }
}
