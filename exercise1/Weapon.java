public class Weapon {
    
    String name;
    int damage;
    int weight;
    String rarity;
    String description;

    Weapon(String name, int damage, int weight, String rarity, String description){
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.rarity = rarity;
        this.description = description;
    }

    public void displayName(){
        System.out.println("Name: " + name);
    }

    public void displayDamage(){
        System.out.println("Damage: " + damage);
    }

    public void displayWeight(){
        System.out.println("Weight: " + weight + " kg");
    }

    public void displayRarity(){
        System.out.println("Rarity: " + rarity);
    }

    public void displayWeaponDescription(){
        System.out.println("Weapon Description: " + description);
    }
}
