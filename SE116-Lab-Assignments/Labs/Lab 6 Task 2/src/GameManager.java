public class GameManager {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter("Ölümsüz", 100, 1);
        Weapon weapon = new Weapon("Sword", 100);
        Building building = new Building("Shelter", 100, 1);

        System.out.println(canDamage(gameCharacter));
        System.out.println(canDamage(weapon));
        System.out.println(canDamage(building));

        upgrade(gameCharacter);
        upgrade(building);
        //upgrade(weapon); does not have Upgradeable interface so will give error.

        damage(gameCharacter, 22);
        damage(weapon, 22);
        damage(building, 22);

        // repair(gameCharacter, 10); will give error because does not have Repairable interface!
        repair(weapon, 12);
        repair(building, 12);

        //Let's destroy some
        damage(gameCharacter, 99);

        System.out.println("Is gameCharacter destroyed: "+ gameCharacter.isDestroyed());
        System.out.println("Is building destroyed: "+ building.isDestroyed());
        System.out.println("Is weapon destroyed: "+ weapon.isDestroyed());

    }

    //Some arbitrary methods
    public static boolean canDamage(Damageable object) {
        return true; //If it has Damageable interface it can damage??? :)
    }

    public static boolean canUpgradeable(Upgradeable object) {
        return true; //If it has Damageable interface it can damage??? :)
    }

    public static void upgrade(Upgradeable object) {
        object.upgrade();
    }

    public static void damage(Damageable object, int damageAmount) {
        object.takeDamage(damageAmount);
    }
    public static void repair(Repairable object, int repairAmount) {
        object.repair(repairAmount);
    }
}
