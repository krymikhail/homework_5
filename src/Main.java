public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(150);
        boss.setDefenseType("Physic");

        System.out.println("Boss Info:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());

        Hero[] heroes = createHeroes();
        System.out.println(" ");
        System.out.println("Heroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() + ", Damage: "
                    + hero.getDamage() + ", Super Ability: " + hero.getSuperAbility());
        }
    }

    public static Hero[] createHeroes() {

        Hero hero1 = new Hero(300, 50, "Fireball");
        Hero hero2 = new Hero(250, 40);
        Hero hero3 = new Hero(200, 60, "Invisibility");

        Hero[] heroes = {hero1, hero2, hero3};

        return heroes;
    }
}