package Game;

import Game.Players.Alien;
import Game.Players.Ninja;

/**
 * Created by Justin on 7/11/16.
 */
public class NVA {


    private String name = "";
    private String playerType = "";
    private String weapon = "";
    private String location = "";
    private String special = "";
    private Ninja ninja = new Ninja();
    private Alien alien = new Alien();


    public void setName() {
        System.out.println("What is your name?");
        name = PlayNVA.scanner.nextLine();
        System.out.println("Welcome, " + name);

    }

    public void setPlayerType() {
        while (!(playerType.equalsIgnoreCase("ninja") || playerType.equalsIgnoreCase("alien"))) {
            System.out.println("Are you a Ninja or Alien? [ninja/alien]");
            playerType = PlayNVA.scanner.nextLine();

            if (playerType.equalsIgnoreCase("ninja")) {
                System.out.println("Noble choice, the Ninja is stealthy and fast.");
            } else if (playerType.equalsIgnoreCase("alien")) {
                System.out.println("Powerful choice, the Alien is scary and strong.");
            } else {
                System.out.println("Invalid player type.");
            }
        }
    }

    public void setWeapon() {
        while (!((playerType.equalsIgnoreCase("ninja") && ((weapon.equalsIgnoreCase("blade")) || (weapon.equalsIgnoreCase("star")))) ||
                ((playerType.equalsIgnoreCase("alien") && ((weapon.equalsIgnoreCase("claw")) || (weapon.equalsIgnoreCase("laser"))))))) {
            if (playerType.equalsIgnoreCase("ninja")) {
                System.out.println("Okay ninja, choose your weapon [blade/star]");
            } else {
                System.out.println("Okay alien, choose your weapon [claw/laser]");
            }
            weapon = PlayNVA.scanner.nextLine();
            if (playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("blade")) {
                System.out.println("The ninja blade is close range, but deals more damage");
            } else if (playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("star")) {
                System.out.println("The ninja star does less damage, but you can snipe from way the fuck back there");
            } else if (playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("claw")) {
                System.out.println("The alien claw is close range but really fucks shit up");
            } else if (playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("laser")) {
                System.out.println("The alien laser is GG");
            } else {
                System.out.println("choose again dipshit.");
            }
        }
    }

    public void setLocationType () {
        while (!((location.equalsIgnoreCase("forest") || location.equalsIgnoreCase("space")))) {
            System.out.println("Choose your location? [forest/space]");
            location = PlayNVA.scanner.nextLine();
            if (location.equalsIgnoreCase("space")) {
                System.out.println("Space gives the alien a huge strength advantage.");
            } else if (location.equalsIgnoreCase("forest")) {
                System.out.println("The forest gives the ninja a slight stealth advantage");
            } else {
                System.out.println("choose again dipshit");
            }
        }
    }

    public void setSpecial() {
        while (!((special.equalsIgnoreCase("speed") || special.equalsIgnoreCase("power") || special.equalsIgnoreCase("pain")))) {
            System.out.println("Choose your special attack? [speed/power/pain]");
// Be sure to match the types with its according variable also double check BRACKETS!!!
            special = PlayNVA.scanner.nextLine();
            if (special.equalsIgnoreCase("speed")) {
                System.out.println("Speed gives the player a high chance of making a second hit at 20% damage of the first hit");
            } else if (special.equalsIgnoreCase("power")) {
                System.out.println("Power gives the player a medium chance of doing an additional 50% damage on a hit.");
            } else if (special.equalsIgnoreCase("pain")) {
                System.out.println("Pain has a small change of inflicting a permanent penalty on the opponent, decreasing their overall effectiveness by 10%.");
            } else {
                System.out.println("choose again dipshit");
            }

        }
    }
}



