public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //Abstract
    public abstract void makeSound();

    //Normal method
    public void eatSomething() {
        System.out.println("Animal [class] is eating something");
    }
}
