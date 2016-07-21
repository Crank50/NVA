package Game;

import Game.Players.Alien;
import Game.Players.Ninja;
import Game.Players.Player;
import Game.Util.Statistics;

/**
 * Created by Justin on 7/11/16.
 */
public class NVA extends Player {


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
                System.out.println("Noble choice, the Ninja is the spirit animal of a Jaguar");
            } else if (playerType.equalsIgnoreCase("alien")) {
                System.out.println("Powerful choice, the Alien is like Derek");
            } else {
                System.out.println("Choose again Dipshit");
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
                System.out.println("As Ninja uses blade you become like avocado");
            } else if (playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("star")) {
                System.out.println("The ninja star does less damage, but you can snipe from the treetops or asteroids");
            } else if (playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("claw")) {
                System.out.println("The alien claw is close range but tears enemies to shred");
            } else if (playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("laser")) {
                System.out.println("The alien laser is GG (alien walks away) ");
            } else {
                System.out.println("Choose again dipshit.");
            }
        }
    }

    public void setLocationType() {
        while (!((location.equalsIgnoreCase("forest") || location.equalsIgnoreCase("space") || location.equalsIgnoreCase("ocean")))) {
            System.out.println("Choose your location? [forest/space]");

            location = PlayNVA.scanner.nextLine();
            if (location.equalsIgnoreCase("space")) {
                System.out.println("Aliens are the alpha masters of Space beware their raw strength!!!");
            } else if (location.equalsIgnoreCase("forest")) {
                System.out.println("In the forest ninja can be anywhere....");
            } else if (location.equalsIgnoreCase("ocean")) {
                System.out.println("dunu...dunnununah...nahhhhhhhhhh");
            } else {
                System.out.println("Choose again dipshit");
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
                System.out.println("Choose again dipshit");
            }

        }
    }

    public void startBattle() {
        int a = 0;
        int n = 0;
        int x = 0;

        Statistics stats = new Statistics();


        if (playerType.equalsIgnoreCase("ninja")) {
            ninja.setPlayerName(name);
            ninja.setPlayerWeapon(weapon);
            ninja.setBattleLocation(location);
            ninja.setSpecialGift(special);
            alien.setPlayerName("Twinkle Toes");
            alien.setPlayerWeapon("laser");
            alien.setBattleLocation(location);
            alien.setSpecialGift(special);
        } else {
            alien.setPlayerName(name);
            alien.setPlayerWeapon(weapon);
            alien.setBattleLocation(location);
            alien.setSpecialGift(special);
            ninja.setPlayerName("Mr Fuzzy Jingles");
            ninja.setPlayerWeapon("star");
            ninja.setBattleLocation(location);
            ninja.setSpecialGift(special);

        }
        System.out.println(" ");
        System.out.println("****************");
        System.out.println("Time to play!");
        System.out.println(" ");
        while (alien.getHealth() > 0 && ninja.getHealth() > 0) {
            int alienDamageReceived = alien.alienDamageReceivedCalculator(ninja.ninjaDamageGivenCalculator());
            System.out.println(ninja.getPlayerName() + " attacks with the " + ninja.getPlayerWeapon() + " and deals " + alienDamageReceived + " points of damage.");
            int ninjaDamageReceived = ninja.ninjaDamageReceivedCalculator(alien.alienDamageGivenCalculator());
            System.out.println(alien.getPlayerName() + " attacks with the " + alien.getPlayerWeapon() + " and deals " + ninjaDamageReceived + " points of damage.");
            System.out.println(ninja.getPlayerName() + " Health: " + ninja.getHealth() + " vs " + alien.getPlayerName() + " Health: " + alien.getHealth());
            stats.recordAttack(alienDamageReceived,ninjaDamageReceived);


            System.out.println(" ");
            System.out.println("Press [enter] to take another turn.");

           // String turn = PlayNVA.scanner.nextLine();
            x++;
            if (alienDamageReceived > ninjaDamageReceived) {
                n++;
            } else {
                a++;
            }
            //Code that applies averages per hit throughout the game
          // int xx = alienDamageReceived / x;
           // System.out.println("the ninja attack average is: " + xx);
          //  int yy = ninjaDamageReceived / x;
            //System.out.println("the alien attack average is: " + yy);
        }

                System.out.println("**********************************************");

                if (ninja.getHealth() > 0) {
                    System.out.println(ninja.getPlayerName() + " Wins!!!");
                    System.out.println(alien.getPlayerName() + " Loses :(");
                    System.out.println("Health Remaining: " + ninja.getPlayerName());
                } else if (alien.getHealth() > 0) {
                    System.out.println(alien.getPlayerName() + " Wins!!!");
                    System.out.println(ninja.getPlayerName() + " Loses :(");
                    System.out.println("Health Remaining: " + alien.getPlayerName());
                } else {
                    System.out.println("Everyone Died!!!");
                    System.out.println(ninja.getPlayerName() + " and " + alien.getPlayerName() + " both lose.");

                }

                System.out.println("-----------*************--------------");
                System.out.println("Total attacks: " + stats.getTotalAttacks());
                System.out.println("Total ties: " + stats.getTies());
                System.out.println("Wins by ninja: " + stats.getNinjaWins());
                System.out.println("Ninjas attack average :" + stats.getNinjaAverageDamageDealt());
                System.out.println("Wins by alien: " + stats.getAlienWins());
                System.out.println("Aliens attack average: " + stats.getAlienAverageDamageDealt());
                System.out.println("-----------*************--------------");







             //   System.out.println("the game ended in " + x + " hits.");
               // System.out.println("ninja won: " + n + " hits");
               // System.out.println("alien won: " + a + " hits");
                //System.out.println("**********************************************");


        }
}




/*blic void startBattle() {
        if(playerType.equalsIgnoreCase("ninja")) {
            ninja.setPlayerName(name);
            ninja.setPlayerWeapon(weapon);
            alien.setPlayerName("Twinkle Toes");
            alien.setPlayerWeapon("laser");
        } else {
            alien.setPlayerName(name);
            alien.setPlayerWeapon(weapon);
            ninja.setPlayerName("Mr Fuzzy Jingles");
            ninja.setPlayerWeapon("star");
        }
        System.out.println(" ");
        System.out.println("**********************************************");
        System.out.println("Time to play!");
        System.out.println(" ");
        while(alien.getHealth() > 0 && ninja.getHealth() > 0) {
            int alienDamageReceived = alien.alienDamageReceivedCalculator(ninja.ninjaDamageGivenCalculator());
            System.out.println(ninja.getPlayerName()+" attacks with the "+ninja.getPlayerWeapon()+" and deals "+alienDamageReceived+" points of damage.");
            int ninjaDamageReceived = ninja.ninjaDamageReceivedCalculator(alien.alienDamageGivenCalculator());
            System.out.println(alien.getPlayerName()+" attacks with the "+alien.getPlayerWeapon()+" and deals "+ninjaDamageReceived+" points of damage.");
            System.out.println(ninja.getPlayerName()+" Heath: "+ninja.getHealth()+"  vs  "+alien.getPlayerName()+" Health: "+alien.getHealth());

            System.out.println(" ");
            System.out.println("Press [enter] to take another turn.");
            String turn = PlayNVA.scanner.nextLine();
            System.out.println(" ");
        }

        System.out.println("**********************************************");
        if(ninja.getHealth() > 0) {
            System.out.println(ninja.getPlayerName()+" Wins!!!");
            System.out.println("Health Remaining: "+ninja.getPlayerName());
        } else if(alien.getHealth() > 0) {
            System.out.println(alien.getPlayerName()+" Wins!!!");
            System.out.println("Health Remaining: "+alien.getPlayerName());
        } else {
            System.out.println("Everyone Died!!!");
            System.out.println(ninja.getPlayerName()+" and "+alien.getPlayerName()+" both lose.");
        }
        System.out.println("**********************************************");
    }
*/



