
package personnages;

public class Gaulois {
	
	private String nom;
	private int force;
	private int effetPotion;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.effetPotion = 1;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de "
		+ romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion += forcePotion;
	}
	@Override
	public String toString() {
	    return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

}

