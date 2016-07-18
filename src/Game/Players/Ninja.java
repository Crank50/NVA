package Game.Players;

import Game.Util.RandInt;

/**
 * Created by Justin on 7/11/16.
 */
public class Ninja extends Player {


    private int bladeMaxDamage = 9;

    private int bladeRangeProtection = 6;

    private int starMaxDamage = 7;

    private int starRangeProtection = 7;

    private int maxHitsPerRole = 4;

    private int accuracy = 5;

    private int forestProtection = 2;

    public int ninjaDamageGivenCalculator() {
        int damage = 0;
        int protection = 0;
        if (getPlayerWeapon().equalsIgnoreCase("blade")) {
            damage = getRandomBladeDamage() * getRandomMaxHitsPerRole() * getRandomAccuracyDamage();

        } else {
            damage = getRandomStarDamage() * getRandomMaxHitsPerRole() * getRandomAccuracyDamage();
        }
        return getSpecialAttack(damage);
    }

    public int ninjaDamageReceivedCalculator(int rawDamageDealt) {
        int damage = 0;
        int protection = 0;
        if (getPlayerWeapon().equalsIgnoreCase("blade")) {
            damage = rawDamageDealt - (getRandomBladeRangeProtection() * getRandomAccuracyDamage());
        } else {
            damage = rawDamageDealt - (getRandomStarRangeProtection() * getRandomAccuracyDamage());
        }
        if (rawDamageDealt > protection + getForestProtection()) {
            damage = rawDamageDealt - (protection + getForestProtection());
        }
        if (getBattleLocation().equalsIgnoreCase("ocean") && getEasterAttack() == rawDamageDealt) {
            damage = rawDamageDealt + getEasterAttack();
            System.out.println("You have been bit!");
        }
        this.removeHealth(damage);
        return damage;
    }


    private int getRandomBladeDamage() {
        int damage = RandInt.randomInt(1, bladeMaxDamage);
        return damage;
    }

    private int getRandomStarDamage() {
        int damage = RandInt.randomInt(1, starMaxDamage);
        return damage;
    }

    private int getRandomAccuracyDamage() {
        int damage = RandInt.randomInt(1, accuracy);
        return damage;
    }

    private int getRandomMaxHitsPerRole() {
        int damage = RandInt.randomInt(1, maxHitsPerRole);
        return damage;
    }


    private int getRandomBladeRangeProtection() {
        int damage = RandInt.randomInt(1, bladeRangeProtection);
        return damage;
    }

    private int getRandomStarRangeProtection() {
        int damage = RandInt.randomInt(1, starRangeProtection);
        return damage;

    }

    private int getForestProtection() {
        int protection = 0;

        if (getBattleLocation().equalsIgnoreCase("forest")) {
            protection = RandInt.randomInt(0, forestProtection);
        }
        return protection;
    }

        }




    /*private int getSpecialDamage(int Damage) {
        double extDamage = 1;
        int randnum = RandInt.randomInt(0, 100);

        if (getSpecialGift().equalsIgnoreCase("speed") && (randnum < 75)) {
            extDamage = 1.2;
        } else if
            (getSpecialGift().equalsIgnoreCase("power") && (randnum < 50)) {
                extDamage = 1.5;
            } else if(getisPain() || getSpecialGift().equalsIgnoreCase("pain") && (randnum < 10)) {
            setisPain(true);
                Damage -= 3;
            if (Damage < 1) {
                Damage = 1;
            }
        }
        extDamage = extDamage * extDamage;
            Double d = new Double(extDamage);
            return d.intValue();*/















