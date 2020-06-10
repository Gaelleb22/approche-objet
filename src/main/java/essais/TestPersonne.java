package essais;

import entities.Personne;
import entities.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		Personne a = new Personne("Dupuis", "Sylvain");
		
		Personne b = new Personne("Dupuis", "Sylvianne", new AdressePostale(5, "rue de la forge", 22000, "Dinan"));
		
		
	}

}
