
abstract class GameCharacter {
    abstract void attack();
    abstract void displayStatus();
}

class Warrior extends GameCharacter {
    int power = 50;
    double damage;

    void attack() {
        damage = power * 2;
        System.out.println("Warrior attacks with brute strength!");
    }

    void displayStatus() {
        System.out.println("Warrior Damage: " + damage);
    }
}

class Mage extends GameCharacter {
    int power = 40;
    double damage;

    void attack() {
        damage = power * 3;
        System.out.println("Mage casts powerful magic!");
    }

    void displayStatus() {
        System.out.println("Mage Damage: " + damage);
    }
}

class Archer extends GameCharacter {
    int power = 35;
    double damage;

    void attack() {
        damage = power * 1.5;
        System.out.println("Archer shoots precise arrows!");
    }

    void displayStatus() {
        System.out.println("Archer Damage: " + damage);
    }
}

public class GameBattleSystem {
    public static void main(String[] args) {

        GameCharacter warrior = new Warrior();
        GameCharacter mage = new Mage();
        GameCharacter archer = new Archer();

        System.out.println("---- Battle Start ----\n");

        warrior.attack();
        warrior.displayStatus();

        System.out.println();

        mage.attack();
        mage.displayStatus();

        System.out.println();

        archer.attack();
        archer.displayStatus();
    }
}