package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne moyenne = new CalculMoyenne();
		moyenne.ajout(5.0);
		moyenne.ajout(6.0);
		
		double moy = moyenne.calcul();
		System.out.println(moy);

	}

}
