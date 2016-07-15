package Game.Players;

/**
 * Created by Justin on 7/11/16.
 */
public class Ninja extends Player {
    private int bladeMaxDamage = 5;

    private int bladeRangeProtection = 2;

    private int starMaxDamage = 3;

    private int starRangeProtection = 4;

    private int maxHitsPerRole = 4;

    private int accuracy = 4;

    public int ninjaDamageGivenCalculator() {
        int damage = 0;
        if (getPlayerWeapon().equalsIgnoreCase("blade")) {
            damage = bladeMaxDamage * maxHitsPerRole * accuracy;
        } else {
            damage = starMaxDamage * maxHitsPerRole * accuracy;

        }
        return damage;
    }

    public int ninjaDamageRecievedCalculator(int rawDamageDealt) {
        int damage = 0;
        if (getPlayerWeapon().equalsIgnoreCase("blade")) {
            damage = rawDamageDealt - (bladeRangeProtection * accuracy);
        } else {
            damage = rawDamageDealt - (starRangeProtection * accuracy);
        }
        this.removeHealth(damage);
        return damage;

    }
}

