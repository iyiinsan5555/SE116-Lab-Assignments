public class Main {
    public static void main(String[] args) {

        Dog myDoggie = new Dog("dog", 12);
        myDoggie.eatSomething(); //inheritance
        myDoggie.getAge(); //already defined in the sub-class
        myDoggie.makeSound(); //abstract method

    }
}
