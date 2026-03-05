import java.util.ArrayList;

public class Course2 {
    private String courseCode;
    private String courseName;
    private Student2[] arrayEnrolledStudents;
    //private int studentCount;
    private ArrayList<Student2> enrolledStudents;
    private ArrayList<Student2> probationList;

    public Course2(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<Student2>();
        this.probationList = new ArrayList<Student2>();
        //this.studentCount = 0;
        //this.arrayEnrolledStudents = new Student2[3];
    }

    public void addStudent(Student2 student) {
        this.enrolledStudents.add(student);
    }

    public void displayEnrolledStudents() {
        System.out.println("----Enrolled Students----");
        for (Student2 std : enrolledStudents) {
            std.printInfo();
        }
    }

    public void displayProbationStudents() {
        System.out.println("----Probation Students----");
        for (Student2 std : probationList) {
            std.printInfo();
        }
    }

    public void removeStudentById(long id) {
        for (Student2 std : enrolledStudents) {
            if (std.getStudentId() == id) {
                enrolledStudents.remove(std);
                System.out.println("Student2 "+std.getStudentId()+ " has been removed.");
                return;
            }
        }
        System.out.println("Error: Student2 not found in this course.");
    }

    public int size() {
        return this.enrolledStudents.size();
    }

    public ArrayList<Student2> getEnrolledStudents() {
        return enrolledStudents;
    }


    public void filterProbation() {
        System.out.println(enrolledStudents.toString());
        System.out.println(probationList.toString());
        for (int i=0; i<enrolledStudents.size(); i++) {
            if (enrolledStudents.get(i).getGpa() < 2.0) {
                Student2 probationStudent = enrolledStudents.get(i);
                //Remove and add to probation list
                probationList.add(probationStudent);
                enrolledStudents.remove(probationStudent);
            }
        }
    }

    public ArrayList<Student2> searchByName(String keyword) {
        ArrayList<Student2> result = new ArrayList<Student2>();

        for (Student2 std : enrolledStudents) {
            if (std.getName().toLowerCase().contains(keyword)) {
                result.add(std);
            }
        }
        for (Student2 std : probationList) {
            if (std.getName().toLowerCase().contains(keyword)) {
                result.add(std);
            }
        }

        return result;
    }
}
