package essais;

import entities.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne a = new Personne();
		a.nom = "Dupuis";
		a.prenom = "Sylvain";
		a.adresse.numeroRue = 5;
		a.adresse.libelleRue = "rue de la forge";
		a.adresse.codePostal = 22000;
		a.adresse.ville = "Plében";
		
		Personne b = new Personne();
		b.nom = "Dupuis";
		b.prenom = "Sylvianne";
		b.adresse.numeroRue = 5;
		b.adresse.libelleRue = "rue de la forge";
		b.adresse.codePostal = 22000;
		b.adresse.ville = "Plében";
	}

}
