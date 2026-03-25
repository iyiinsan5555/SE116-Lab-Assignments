public class Building implements Damageable, Repairable, Upgradeable {
    private String type;
    private double health;
    private double level;

    public Building(String type, double health, double level) {
        this.type = type;
        this.health = health;
        this.level = level;
    }

    @Override
    public void takeDamage(int amount) {
        this.health -= amount;

        System.out.println(type+" building took "+amount+" damage. Remaining health: "+ health);
    }

    @Override
    public boolean isDestroyed() {
        return health<=0;
    }

    @Override
    public void repair(int amount) {
        this.health += amount;

        System.out.println(type+" building repaired. Health: "+health);
    }

    @Override
    public void upgrade() {
        this.level += 1;

        System.out.println(type+" building upgraded to level "+ level);
    }
}
