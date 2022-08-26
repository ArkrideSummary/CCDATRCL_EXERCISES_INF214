public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        Weapon bastardSword = new Weapon("Bastard Sword", 10, 4, "Common", "A very common sword that can be use by anyone.");

        bastardSword.displayName();
        bastardSword.displayDamage();
        bastardSword.displayWeight();
        bastardSword.displayRarity();
        bastardSword.displayWeaponDescription();

        Weapon sawBlade = new Weapon("Saw Blade", 50, 7, "Uncommon", "A blade combined with the sharpness of a blade and cutting power of a saw.");

        sawBlade.displayName();
        sawBlade.displayDamage();
        sawBlade.displayWeight();
        sawBlade.displayRarity();
        sawBlade.displayWeaponDescription();

        Weapon zanbato = new Weapon("Zanbato", 100, 5, "Rare", "A rare weapon that can only be obtained from doing the Zanbato Gacha.");

        zanbato.displayName();
        zanbato.displayDamage();
        zanbato.displayWeight();
        zanbato.displayRarity();
        zanbato.displayWeaponDescription();

    }
}
