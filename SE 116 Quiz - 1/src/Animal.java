public class Animal {
    private int id;
    private String name;
    private int age;
    private double dailyFoodCost;
    private boolean isAdoptable;

    public Animal(int id, String name, int age, double dailyFoodCost, boolean isAdoptable) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dailyFoodCost = dailyFoodCost;
        this.isAdoptable = isAdoptable;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getDailyFoodCost() {
        return dailyFoodCost;
    }

    public boolean isAdoptable() {
        return isAdoptable;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDailyFoodCost(double dailyFoodCost) {
        this.dailyFoodCost = dailyFoodCost;
    }

    //Methods
    public void makeSound() {
        System.out.println("Some generic animal sound.");
    }

    public String getInfo() {
        return Integer.toString(id) + "_" + name + Integer.toString(age) + "_" + Double.toString(dailyFoodCost) + "_" + Boolean.toString(isAdoptable);
    }

    public void feed() {
        System.out.println("Animal "+ name +" has been fed.");
    }
}
