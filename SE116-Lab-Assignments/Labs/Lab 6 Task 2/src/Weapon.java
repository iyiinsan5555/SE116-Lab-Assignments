public class Weapon implements Damageable, Repairable{
    private String name;
    private double durability;

    public Weapon(String name, double durability) {
        this.name = name;
        this.durability = durability;
    }

    @Override
    public void takeDamage(int amount) {
        durability -= amount;
        System.out.println("Weapon "+name+ " durability reduced to "+durability );
    }

    @Override
    public boolean isDestroyed() {
        return durability<=0;
    }

    @Override
    public void repair(int amount) {
        durability += amount;

        System.out.println("Weapon "+name+" repaired. Durability: "+durability);
    }


}
