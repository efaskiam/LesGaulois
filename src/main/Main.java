package main;

import personnages.Village;
import personnages.Gaulois;
import personnages.Chef;
import personnages.Romain;

public class Main {
    public static void main(String[] args) {

        Village village = new Village("Village des Irréductibles", 30);

        Chef chefAbraracourcix = new Chef("Abraracourcix", 6,village);
        village.setChef(chefAbraracourcix);
        
        Romain minus = new Romain("Minus",-6);
        minus.recevoirCoup(2);

        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterHabitant(asterix);


        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterHabitant(obelix);

        village.afficherVillageois();
        
    }
}



