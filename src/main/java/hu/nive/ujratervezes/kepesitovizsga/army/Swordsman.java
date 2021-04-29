package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private boolean shield = true;

    public Swordsman(boolean armor) {
        super(100, 10, armor);
    }

    @Override
    public void sufferDamage(int damage) {
        if (this.shield) {
            decreaseHitPoint(0);
            shield = false;
        } else {
            if (isArmor()) {
                decreaseHitPoint(damage / 2);
            } else {
                decreaseHitPoint(damage);
            }
        }
    }
}
