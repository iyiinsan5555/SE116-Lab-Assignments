import java.util.ArrayList;
import java.util.Arrays;

public class Course {
    private String courseCode;
    private String courseName;
    private Student[] arrayEnrolledStudents;
    //private int studentCount;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<Student>();
        //this.studentCount = 0;
        //this.arrayEnrolledStudents = new Student[3];
    }

    public void addStudent(Student student) {
        this.enrolledStudents.add(student);
    }

    public void displayEnrolledStudents() {
        for (Student std : enrolledStudents) {
            std.printInfo();
        }
    }

    public void removeStudentById(long id) {
        for (Student std : enrolledStudents) {
            if (std.getStudentId() == id) {
                enrolledStudents.remove(std);
                System.out.println("Student "+std.getStudentId()+ " has been removed.");
                return;
            }
        }
        System.out.println("Error: Student not found in this course.");
    }

    public int size() {
        return this.enrolledStudents.size();
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
