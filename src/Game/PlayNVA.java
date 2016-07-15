package Game;

import java.util.Scanner;

/**
 * Created by Justin on 7/11/16.
 */
public class PlayNVA {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        NVA nva = new NVA();
        System.out.println("Let us play!!!!");
        nva.setName();
        nva.setPlayerType();
        nva.setWeapon();
        nva.setLocationType();
        nva.setSpecial();
        nva.startBattle();
    }
}







        /*System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Welcome, " + name);


        String playerType = "";
        while (!(playerType.equalsIgnoreCase("ninja") || playerType.equalsIgnoreCase("alien"))) {
            System.out.println("Are you a Ninja or Alien? [ninja/alien]");
            playerType = scanner.nextLine();

            if (playerType.equalsIgnoreCase("ninja")) {
                System.out.println("Noble choice, the Ninja is stealthy and fast.");
            } else if (playerType.equalsIgnoreCase("alien")) {
                System.out.println("Powerful choice, the Alien is scary and strong.");
            } else {
                System.out.println("Invalid player type.");
            }
        }
        String weaponType = "";
        while (!((playerType.equalsIgnoreCase("ninja") && ((weaponType.equalsIgnoreCase("blade")) || (weaponType.equalsIgnoreCase("star")))) ||
                ((playerType.equalsIgnoreCase("alien") && ((weaponType.equalsIgnoreCase("claw")) || (weaponType.equalsIgnoreCase("laser"))))))) {
            if (playerType.equalsIgnoreCase("ninja")) {
                System.out.println("Okay ninja, choose your weapon [blade/star]");
            } else {
                System.out.println("Okay alien, choose your weapon [claw/laser]");
            }
            weaponType = scanner.nextLine();
            if (playerType.equalsIgnoreCase("ninja") && weaponType.equalsIgnoreCase("blade")) {
                System.out.println("The ninja blade is close range, but deals more damage");
            } else if (playerType.equalsIgnoreCase("ninja") && weaponType.equalsIgnoreCase("star")) {
                System.out.println("The ninja star does less damage, but you can snipe from way the fuck back there");
            } else if (playerType.equalsIgnoreCase("alien") && weaponType.equalsIgnoreCase("claw")) {
                System.out.println("The alien claw is close range but really fucks shit up");
            } else if (playerType.equalsIgnoreCase("alien") && weaponType.equalsIgnoreCase("laser")) {
                System.out.println("The alien laser is GG");
            } else {
                System.out.println("choose again dipshit.");
            }
        }


        String locationType = "";
        while (!((locationType.equalsIgnoreCase("forest") || locationType.equalsIgnoreCase("space")))) {
            System.out.println("Choose your location? [forest/space]");

            locationType = scanner.nextLine();
            if (locationType.equalsIgnoreCase("space")) {
                System.out.println("Space gives the alien a huge strength advantage.");
            } else if (locationType.equalsIgnoreCase("forest")) {
                System.out.println("The forest gives the ninja a slight stealth advantage");
            } else {
                System.out.println("choose again dipshit");
            }
        }


        String specialType = "";
        while (!((specialType.equalsIgnoreCase("speed") || specialType.equalsIgnoreCase("power") || specialType.equalsIgnoreCase("pain")))) {
            System.out.println("Choose your special attack? [speed/power/pain]");
// Be sure to match the types with its according variable also double check BRACKETS!!!
            specialType = scanner.nextLine();
            if (specialType.equalsIgnoreCase("speed")) {
                System.out.println("Speed gives the player a high chance of making a second hit at 20% damage of the first hit");
            } else if (specialType.equalsIgnoreCase("power")) {
                System.out.println("Power gives the player a medium chance of doing an additional 50% damage on a hit.");
            } else if (specialType.equalsIgnoreCase("pain")) {
                System.out.println("Pain has a small change of inflicting a permanent penalty on the opponent, decreasing their overall effectiveness by 10%.");
            } else {
                System.out.println("choose again dipshit");
            }


        }
    }
}
*/





