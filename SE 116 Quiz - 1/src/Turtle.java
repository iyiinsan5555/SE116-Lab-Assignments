public class Turtle extends Animal {
    private String waterType;

    public Turtle(int id, String name, int age, double dailyFoodCost, String waterType) {
        super(id, name, age, dailyFoodCost, false);
        this.waterType = waterType;
    }

    //Getters
    public String getWaterType() {
        return waterType;
    }

    //Setters
    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    //Methods
    @Override
    public void makeSound() {
        System.out.println("Turtle "+getName()+" makes a quiet sound.");
    }

    @Override
    public void feed() {
        System.out.println("Turtle "+getName()+" eats vegetables.");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "_" + waterType;
    }
}
