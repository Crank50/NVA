package Game.Players;

import Game.Util.RandInt;


/**
 * Created by Justin on 7/11/16.
 */
public abstract class Player {
    private int health = 1000;
    private String playerName;
    private String playerWeapon;
    private String battleLocation;//part 3
    private String specialGift;// part 4
    private boolean isPain = false;

    public int getHealth() {
        return health;
    }

    public void removeHealth(int hit) {
        health -= hit;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerWeapon() {
        return playerWeapon;
    }

    public void setPlayerWeapon(String playerWeapon) {
        this.playerWeapon = playerWeapon;
    }

    public String getBattleLocation() {
        return battleLocation;
    }

    public void setBattleLocation(String battleLocation) {
        this.battleLocation = battleLocation;
    }

    public String getSpecialGift() {
        return specialGift;
    }

    public void setSpecialGift(String specialGift) {
        this.specialGift = specialGift;
    }

    public boolean getisPain() {
        return isPain;
    }

    public void setisPain(boolean isPain) {
        this.isPain = isPain;
    }

    public int getSpecialAttack(int damage) {
        double extDamage = 5;
        int randnum = RandInt.randomInt(0, 100);

        if (getSpecialGift().equalsIgnoreCase("speed") && (randnum < 75)) {
            extDamage = 1.2;
        } else if
                (getSpecialGift().equalsIgnoreCase("power") && (randnum < 50)) {
            extDamage = 1.5;
        } else if (getisPain() || getSpecialGift().equalsIgnoreCase("pain") && (randnum < 10)) {
            setisPain(true);
            damage -= 3;
            if (damage < 1) {
                damage = 1;
            }
        }
        extDamage = extDamage * damage;
        Double d = new Double(extDamage);
        return d.intValue();

    }

}




   /* private int bladeMaxDamage = 5;
    private int bladeRangeProtection = 2;
    private int starMaxDamage = 3;
    private int starRangeProtection = 4;
    private int maxHitsPerRole = 4;
    private int accuracy = 4;*/

