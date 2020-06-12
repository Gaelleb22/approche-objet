package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie nouveauSalarie = new Salarie("Morvan", "Yves", 1650.0);
		System.out.println(nouveauSalarie.getSalaire());
		
		Pigiste nouveauPigiste = new Pigiste("Hugo", "Victor", 10, 110.0);
		System.out.println(nouveauPigiste.getSalaire());

	}

}
