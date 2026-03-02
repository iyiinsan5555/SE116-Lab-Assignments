public class Person {

    String first;
    String last;

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public void showName() {
        System.out.println(this.first + " " + this.last);
    }
}
