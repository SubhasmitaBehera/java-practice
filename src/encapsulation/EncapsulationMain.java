package encapsulation;



class EnhancedPlayer {
    private String name;  //Tim
    private int hitPoints = 100; // 100
    private String weapon;  // Sword

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }

        this.weapon = weapon;
    }

    public int loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("score.encaptulation.Player knocked out");
            // Reduce number of lives remaining for the player
        }
        return hitPoints;
    }

    public int getHealth() {
        return hitPoints;
    }
}

class Player {

    public String fullName;
    public int health; //10
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("score.encaptulation.Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}

public class EncapsulationMain {
    public static void main(String[] args) {
//	    score.encaptulation.Player player = new score.encaptulation.Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
//        player.name = "Tim";
        System.out.println("Initial health is " + player.getHealth());  // 100
        System.out.println("Final  health is " + player.loseHealth(20));
    }
}

