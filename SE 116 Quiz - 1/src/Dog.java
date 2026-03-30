public class Dog extends Animal {
    private String breed;

    public Dog(int id, String name, int age, double dailyFoodCost, String breed) {
        super(id, name, age, dailyFoodCost, true);
        this.breed = breed;
    }

    //Getters
    public String getBreed() {
        return breed;
    }

    //Setters
    public void setBreed(String breed) {
        this.breed = breed;
    }

    //Methods
    @Override
    public void makeSound() {
        System.out.println("Dog "+getName()+" barks!");
    }

    @Override
    public void feed() {
        System.out.println("Dog "+getName()+" eats dog food.");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "_" + breed;
    }
}
