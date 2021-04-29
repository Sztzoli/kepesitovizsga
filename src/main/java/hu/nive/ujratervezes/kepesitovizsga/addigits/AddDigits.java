package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {


    public int addDigits(String input){
        if (input==null || input.isBlank()) {
            return -1;
        }
        return input.chars()
                .filter(c -> c>='0' && c<='9' )
                .map(Character::getNumericValue)
                .sum();
    }
}
