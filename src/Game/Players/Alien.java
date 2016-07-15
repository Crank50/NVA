package Game.Players;

import sun.tools.jconsole.MaximizableInternalFrame;

/**
 * Created by Justin on 7/11/16.
 */
public class Alien extends Player {

    private int clawMaxDamage = 5;

    private int clawRangeProtection = 2;

    private int laserMaxDamage = 3;

    private int laserRangeProtection = 4;

    private int maxHitsPerRole = 4;

    private int accuracy = 4;

    public int alienDamageGivenCalculator() {
        int damage = 0;
        if (getPlayerWeapon().equalsIgnoreCase("claw")) {
            damage = clawMaxDamage * maxHitsPerRole * accuracy;
        } else {
            damage = laserMaxDamage * maxHitsPerRole * accuracy;

        }
        return damage;
    }

    public int alienDamageRecievedCalculator(int rawDamageDealt) {
        int damage = 0;
        if (getPlayerWeapon().equalsIgnoreCase("claw")) {
            damage = rawDamageDealt - (clawRangeProtection * accuracy);
        } else {
            damage = rawDamageDealt - (laserRangeProtection * accuracy);
        }
        this.removeHealth(damage);
        return damage;

    }
}


