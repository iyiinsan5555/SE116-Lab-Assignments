public class Animal implements Comparable<Animal> {
    public int age;
    public static void main(String[] args) {
        System.out.println(new Animal().getClass().getName());
    }

    @Override
    public int compareTo(Animal otherAnimal) {
        return Integer.compare(this.age, otherAnimal.age);
    }
}
