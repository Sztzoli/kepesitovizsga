package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    private int hitPoints;
    private int damagePoints;
    private boolean armor;

    public MilitaryUnit(int hitPoints, int damagePoints, boolean armor) {
        this.hitPoints = hitPoints;
        this.damagePoints = damagePoints;
        this.armor = armor;
    }

    public int doDamage() {
        return damagePoints;
    }

    public abstract void sufferDamage(int damage);

    public int getHitPoints() {
        return hitPoints;
    }

    public void decreaseHitPoint(int damage) {
        this.hitPoints -= damage;
    }

    public boolean isArmor() {
        return armor;
    }

}
