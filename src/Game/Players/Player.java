package Game.Players;

/**
 * Created by Justin on 7/11/16.
 */
public abstract class Player {
    private int health = 1000;
    private String playerName;
    private String playerWeapon;

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

   /* private int bladeMaxDamage = 5;
    private int bladeRangeProtection = 2;
    private int starMaxDamage = 3;
    private int starRangeProtection = 4;
    private int maxHitsPerRole = 4;
    private int accuracy = 4;*/
}
