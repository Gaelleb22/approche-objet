package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

/**Classe exécutable test de la classe Intervenant et de ses classes filles
 * @author formation
 *
 */
public class TestIntervenant {

	public static void main(String[] args) {
		
		//Création d'un nouveau salarié
		Salarie nouveauSalarie = new Salarie("Morvan", "Yves", 1650.0);
		nouveauSalarie.afficherDonnees();
		
		//Création d'un nouveau pigiste
		Pigiste nouveauPigiste = new Pigiste("Hugo", "Victor", 10, 110.0);
		nouveauPigiste.afficherDonnees();

	}

}
