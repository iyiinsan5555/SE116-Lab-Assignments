public class GameCharacter implements Damageable, Upgradeable {
    private String name;
    private double health;
    private double level;

    public GameCharacter(String name, double health, double level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public void takeDamage(int amount) {
        this.health -= amount;
        //Additional checks will not be done

        System.out.println("Character"+name+" took "+ amount+ " damage. Remaining health: "+ health);
    }

    @Override
    public boolean isDestroyed() {
        return health<=0;
    }

    @Override
    public void upgrade() {
        this.level += 1;
        this.health += 20;

        System.out.println("Character "+name+" leveled up to "+level+". Health: "+health);
    }
}
