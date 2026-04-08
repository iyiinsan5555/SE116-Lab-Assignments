public class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGPA() {return this.gpa;}

    @Override
    public int compareTo(Student otherStudent) {
        return Double.compare(gpa, otherStudent.getGPA());
    }

    @Override
    public String toString() {
        return name;
    }

}
