public class Lion extends Animal {
    private String maneColor;

    public Lion(int id, String name, int age, double dailyFoodCost, String maneColor) {
        super(id, name, age, dailyFoodCost, false);
        this.maneColor = maneColor;
    }

    //Getters
    public String getManeColor() {
        return maneColor;
    }

    //Setters
    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }

    //Methods
    @Override
    public void makeSound() {
        System.out.println("Lion "+ getName()+ " roars!");
    }

    @Override
    public void feed() {
        System.out.println("Lion "+getName()+" eats meat.");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "_" + maneColor;
    }
}
