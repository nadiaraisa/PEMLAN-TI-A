import java.util.Random;

public class Warrior extends Character {
    private double probability;

    public Warrior() {
        super(80, 25, 30);
        this.probability = 0.60;
    }

    @Override
    public boolean dealDamage() {
        Random random = new Random();
        return random.nextDouble() < this.probability;
    }
}

