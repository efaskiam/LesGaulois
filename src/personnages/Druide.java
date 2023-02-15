package personnages;

import java.util.Random;

public class Druide {

	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion;

	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		this.forcePotion = 1;
		parler("Bonjour, je suis le druide " + nom 
				+ " et ma potion peut aller d'une force " 
				+ effetPotionMin + " à "+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void preparerPotion() {
		Random r = new Random();
		forcePotion = r.nextInt(effetPotionMin,effetPotionMax);
		if (forcePotion > 7 ) {
			this.parler("J'ai préparé une super potion de force"+forcePotion);
		}else {
			this.parler("Je n'ai pas trouvé tous les ingrédients, ma potion est "
					+ "seulement de force "+forcePotion);
		}	
	}
	
}
