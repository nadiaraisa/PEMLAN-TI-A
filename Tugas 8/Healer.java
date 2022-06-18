import java.util.Random;

public class Healer extends Character {
    private double probability;

    public Healer() {
        super(70, 10, 10);
        this.probability = 0.85;
    }

    @Override
    public boolean dealDamage() {
        Random random = new Random();
        return random.nextDouble() < this.probability;
    }

    public void healCharacter() {
        this.setHP(this.getHP() + 25);
    }
}
