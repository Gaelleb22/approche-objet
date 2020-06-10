package essais;

import entities.Personne;
import entities.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		Personne a = new Personne("Dupuis", "Sylvain");
		
		AdressePostale adresse = new AdressePostale(5, "rue de la forge", 22000, "Dinan");
		
		a.ModifierAdresse(adresse);
		System.out.println(a.adresse.ville);
	}

}
