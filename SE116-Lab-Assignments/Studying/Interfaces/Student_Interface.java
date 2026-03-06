public class Student_Interface implements StudentInterface {

    //Implemented (overrided) methods must be public and non-static

    @Override
    public boolean stillStudent(){
        return true;
    }

    @Override
    public double getGPA() {
        return 4.00;
    }

    @Override
    public String getFaculty(){
        return "Computer Engineering";
    }

    public static void main(String[] args) {
        Student_Interface std = new Student_Interface();
        System.out.println(std.getFaculty());
    }

}
