package essais;

import entities.Personne;
import entities.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		Personne perso1 = new Personne("Dupuis", "Sylvain");
		
		AdressePostale adresse = new AdressePostale(5, "rue de la forge", 22000, "Dinan");
		
		perso1.setAdresse(adresse);
		perso1.afficherIdentite();
		System.out.println(perso1.adresse.ville);
	}

}
