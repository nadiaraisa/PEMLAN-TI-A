public abstract class Character {
    private int HP;
    private int attack;
    private int defense;

    public Character(int HP, int attack, int defense) {
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
    }

    public abstract boolean dealDamage();

    public void recieveDamage(int damage) {
        damage = damage - this.defense;

        if (this.HP - damage > 0) {
            this.HP -= damage;
        } else {
            this.HP = 0;
        }
    }

    public void infoCharacter() {
        System.out.println("--------------- STATUS ---------------");
        System.out.println("Role\t\t: " + this.getClass().getSimpleName());
        System.out.println("HP\t\t\t: " + this.HP);
        System.out.println("Attack\t\t: " + this.attack);
        System.out.println("Defense\t\t: " + this.defense);
    }

    public int getDefense() {
        return defense;
    }

    public int getAttack() {
        return attack;
    }

    public int getHP() {
        return HP;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
