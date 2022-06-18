import java.util.Random;

public class Magician extends Character {
    private double probability;

    public Magician() {
        super(100, 60, 10);
        this.probability = 0.35;
    }

    @Override
    public boolean dealDamage() {
        Random random = new Random();
        return random.nextDouble() < this.probability;
    }
}
