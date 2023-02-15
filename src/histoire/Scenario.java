package histoire;

import personnages.Gaulois;
import personnages.Romain;
//import personnages.Druide;
//import personnages.Chef;
//import personnages.Village;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus",6);
		asterix.parler("Bonjorno a tuti !");
		minus.parler("UN GAU...UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);		
		asterix.frapper(minus);
		minus.parler("Je FF");
	}	

}
