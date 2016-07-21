package Game.Util;

import java.util.ArrayList;

/**
 * Created by Justin on 7/20/16.
 */
public class Statistics {

        ArrayList<Integer> ninja = new ArrayList<Integer>();
        ArrayList<Integer> alien = new ArrayList<Integer>();
        ArrayList<String> win = new ArrayList<String>();

        public void recordAttack(int ninjaDeals, int alienDeals) {
            ninja.add(ninjaDeals);
            alien.add(alienDeals);
            if(ninjaDeals > alienDeals) {
                win.add("ninja");
            } else if(alienDeals > ninjaDeals) {
                win.add("alien");
            } else {
                win.add("tie");
            }
        }

        public int getTotalAttacks() {
            return win.size();
        }

        public int getNinjaWins() {
            int ninjaWins = 0;
            for(String winner : win) {
                if(winner.equalsIgnoreCase("ninja"))
                    ninjaWins++;
            }
            return ninjaWins;
        }

        public int getAlienWins() {
            int alienWins = 0;
            for(String winner : win) {
                if(winner.equalsIgnoreCase("alien"))
                    alienWins++;
            }
            return alienWins;
        }

        public int getTies() {
            int ties = 0;
            for(String winner : win) {
                if(winner.endsWith("tie"))
                    ties++;
            }
            return ties;
        }

        public int getNinjaAverageDamageDealt() {
            int totalDamage = 0;
            for(int damage : ninja) {
                totalDamage += damage;
            }
            return totalDamage / getTotalAttacks();
        }

        public int getAlienAverageDamageDealt() {
            int totalDamage = 0;
            for(int damage : alien) {
                totalDamage += damage;
            }
            return totalDamage / getTotalAttacks();
         }

    }


