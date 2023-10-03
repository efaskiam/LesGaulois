package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageoisMaximum;
	private Gaulois [] villageois;
	private int nbVillageois = 0;
    public Village(String nom, int nbVillageoisMaximum) {
        this.nom = nom;
        this.nbVillageoisMaximum = nbVillageoisMaximum;
        this.villageois = new Gaulois[nbVillageoisMaximum];
    }
	public void setChef(Chef chef) {
		this.chef = chef;
		}
	public String getNom() {
		return nom;
		}
	
    public void ajouterHabitant(Gaulois gaulois) {
        if (nbVillageois >= nbVillageoisMaximum) {
            System.out.println("Le village est plein, impossible d'ajouter plus de villageois.");
        } else {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
            System.out.println(gaulois.getNom() + " a rejoint le village de " + nom);
        }
    }
    public Gaulois trouverHabitant(int numeroVillageois) {
        if (numeroVillageois >= 0 && numeroVillageois < nbVillageois) {
            return villageois[numeroVillageois];
        } else {
            System.out.println("Numéro de villageois invalide.");
            return null;
        	}
    }
    public void afficherVillageois() {
        if (chef != null) {
            System.out.println("Chef du village : " + chef.getNom());
        } else {
            System.out.println("Aucun chef n'est défini pour ce village.");
        }
        System.out.println("Villageois :");
        for (int i = 0; i < nbVillageois; i++) {
            Gaulois villageoisActuel = villageois[i];
            if (villageoisActuel != null) {
                System.out.println("- " + villageoisActuel.getNom());
            }
        }
    } 
}