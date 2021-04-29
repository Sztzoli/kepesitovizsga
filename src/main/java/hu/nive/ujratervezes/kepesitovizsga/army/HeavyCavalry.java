package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {
    private int counter = 0;

    public HeavyCavalry() {
        super(150, 20, true);
    }

    @Override
    public int doDamage() {
        counter++;
        if (counter == 1) {
            return super.doDamage() * 3;
        }
        return super.doDamage();
    }

    @Override
    public void sufferDamage(int damage) {
        decreaseHitPoint(damage / 2);
    }
}
