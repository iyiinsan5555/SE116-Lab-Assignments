
public class Main {
    public static void main(String[] args) {

        // child class --> subclass, parent class --> superclass
        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", "Potter", 3.25);

        System.out.println(student.gpa);

    }
}