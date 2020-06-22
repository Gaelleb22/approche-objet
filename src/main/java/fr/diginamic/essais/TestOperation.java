package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

/**Classe exécutable test de la classe Opération
 * @author formation
 *
 */
public class TestOperation {

	public static void main(String[] args) {
		System.out.println(Operations.calcul(4, 5, '+'));
		System.out.println(Operations.calcul(4, 5, '-'));
		System.out.println(Operations.calcul(4, 5, '*'));
		System.out.println(Operations.calcul(4, 5, '/'));

	}

}
