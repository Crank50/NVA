package Game.Players;

import Game.Util.RandInt;

/**
 * Created by Justin on 7/11/16.
 */
public class Alien extends Player {

    private int clawMaxDamage = 10;

    private int clawProtection = 6;

    private int laserMaxDamage = 8;

    private int laserProtection = 4;

    private int maxHitsPerRole = 4;

    private int accuracy = 5;

    private int spaceRoids = 2;

    public int alienDamageGivenCalculator() {
        int damage = 0;
        if (getPlayerWeapon().equalsIgnoreCase("claw")) {
            damage = getRandomClawDamage() * getRandomMaxHitsPerRole() * getRandomAccuracy();
        } else {
            damage = getRandomLaserDamage() * getRandomMaxHitsPerRole() * getRandomAccuracy();

        }
        return getSpecialAttack((damage) + getSpaceRoids());
    }

    public int alienDamageReceivedCalculator(int rawDamageDealt) {
        int damage = 0;
        int protection = 0;
        if (getPlayerWeapon().equalsIgnoreCase("claw")) {
            damage = rawDamageDealt - (getRandomClawProtection() * getRandomAccuracy());
        } else {
            damage = rawDamageDealt - (getRandomLaserProtection() * getRandomAccuracy());
        }
        if (rawDamageDealt > protection) {
            damage = rawDamageDealt - protection;
        }
        if (getBattleLocation().equalsIgnoreCase("ocean") && getEasterAttack() == damage){
            damage = rawDamageDealt + getEasterAttack();
            System.out.println("You have been bit");
        }
        this.removeHealth(damage);
        return damage + getEasterAttack();

    }

    private int getRandomClawDamage() {
        int damage = RandInt.randomInt(1, clawMaxDamage);
        return damage;
    }

    private int getRandomLaserDamage() {
        int damage = RandInt.randomInt(1, laserMaxDamage);
        return damage;
    }

    private int getRandomLaserProtection() {
        int damage = RandInt.randomInt(1, laserProtection);
        return damage;


    }

    private int getRandomClawProtection() {
        int damage = RandInt.randomInt(1, clawProtection);
        return damage;

    }

    private int getRandomMaxHitsPerRole() {
        int damage = RandInt.randomInt(1, maxHitsPerRole);
        return damage;

    }

    private int getRandomAccuracy() {
        int damage = RandInt.randomInt(1, accuracy);
        return damage;

    }

    private int getSpaceRoids() {
        int damage = 0;
        if (getBattleLocation().equalsIgnoreCase("space")) {
            damage = RandInt.randomInt(1, spaceRoids);
        }
        return damage;
    }
}
    /* private int getSpecialAttack( int damage) {
    double extDamage = 1;
    int randnum = RandInt.randomInt(0, 100);

    if (getSpecialGift().equalsIgnoreCase("speed") && (randnum < 75)) {
        extDamage = 1.2;
    } else if
            (getSpecialGift().equalsIgnoreCase("power") && (randnum < 50)) {
        extDamage = 1.5;
    } else if(getisPain() || getSpecialGift().equalsIgnoreCase("pain") && (randnum < 10)) {
        setisPain(true);
        damage -= 3;
        if (damage < 1) {
            damage = 1;
        }
    extDamage = extDamage * extDamage;
    Double d = new Double(extDamage);
    return d.intValue();

}
    }*/



