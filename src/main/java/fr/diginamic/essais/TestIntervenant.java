package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie nouveauSalarie = new Salarie("Morvan", "Yves", 1650.0);
		nouveauSalarie.afficherDonnees();
		
		Pigiste nouveauPigiste = new Pigiste("Hugo", "Victor", 10, 110.0);
		nouveauPigiste.afficherDonnees();

	}

}
