public class Student implements Comparable<Student> {
    private long studentId;
    private String name;
    private double gpa;

    public Student(long studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printInfo() {
        System.out.printf("Student Id: %s  Name: %s  GPA: %s %n", studentId, name, gpa);
    }

    @Override
    public int compareTo(Student o) {
      return Long.compare(studentId, o.studentId);
    }
}
