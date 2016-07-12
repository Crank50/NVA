package Game;

import java.util.Scanner;

/**
 * Created by Justin on 7/11/16.
 */
public class PlayNVA {
    private static NVA nva;

    public static void main(String[] args) {

        nva = new NVA();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lets play a game.");

        System.out.println("What is your name?");
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
        String weapon = "";
        while (!((playerType.equalsIgnoreCase("ninja") && ((weapon.equalsIgnoreCase("blade")) || (weapon.equalsIgnoreCase("star")))) ||
                ((playerType.equalsIgnoreCase("alien") && ((weapon.equalsIgnoreCase("claw")) || (weapon.equalsIgnoreCase("laser"))))))) {
            if (playerType.equalsIgnoreCase("ninja")) {
                System.out.println("Okay ninja, choose your weapon [blade/star]");
            } else {
                System.out.println("Okay alien, choose your weapon [claw/laser]");
            }
            weapon = scanner.nextLine();
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
            System.out.println("Choose your location? [forest/space]");
            String location = scanner.nextLine();

            System.out.println("Choose your special attack? [speed/power/pain");
            String special = scanner.nextLine();


        }
    }
}




