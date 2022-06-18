import java.util.Random;

public class Titan extends Character {
    private double probability;

    public Titan() {
        super(200, 45, 0);
        this.probability = 0.40;
    }

    public boolean dealDamage() {
        Random random = new Random();
        return random.nextDouble() < this.probability;
    }
}
