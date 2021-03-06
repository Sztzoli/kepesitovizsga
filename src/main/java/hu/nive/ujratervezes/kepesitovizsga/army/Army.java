package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> militaryUnits = new ArrayList<>();


    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnits.add(militaryUnit);
    }


    public int getArmySize() {
        return militaryUnits.size();
    }


    public int getArmyDamage() {
        return militaryUnits.stream()
                .mapToInt(MilitaryUnit::doDamage)
                .sum();

    }

    public void damageAll(int damage) {
        militaryUnits.forEach(x -> x.sufferDamage(damage));
        militaryUnits.removeIf(x -> x.getHitPoints() < 25);
    }
}
