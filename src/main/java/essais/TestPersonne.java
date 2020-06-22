package essais;

import entities.Personne;
import entities.AdressePostale;

/**Classe exécutive
 * @author formation
 *
 */
public class TestPersonne {

	public static void main(String[] args) {
		
		//Création de 2 instance de Personne
		Personne perso1 = new Personne("Dupuis", "Sylvain");	
		AdressePostale adresse = new AdressePostale(5, "rue de la forge", 22000, "Dinan");
		perso1.setAdresse(adresse);
		perso1.afficherIdentite();
		System.out.println(perso1.getAdresse().getVille());
		
		Personne perso2 = new Personne("Dupont", "Arthur", new AdressePostale(54, "impasse VersnulPart", 99999, "Inconnue"));
		perso2.afficherIdentite();
	}

}
