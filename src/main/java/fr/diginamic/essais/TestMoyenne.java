package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

/**Classe exécutable test de la classe CalculMoyenne
 * @author formation
 *
 */
public class TestMoyenne {

	public static void main(String[] args) {
		//test 1 :
		CalculMoyenne moyenne1 = new CalculMoyenne();
		moyenne1.ajout(5.0);
		moyenne1.ajout(6.0);
		
		double moy = moyenne1.calcul();
		System.out.println(moy);
		
		//test 2 :
		CalculMoyenne moyenne2 = new CalculMoyenne();
		moyenne2.ajout(2.0);
		moyenne2.ajout(2.5);
		moyenne2.ajout(3.0);
		
		moy = moyenne2.calcul();
		System.out.println(moy);

	}

}
