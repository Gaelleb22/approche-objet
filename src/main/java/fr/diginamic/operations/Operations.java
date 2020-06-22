package fr.diginamic.operations;

/** Classe avec méthode static de calcul
 * @author formation
 *
 */
public class Operations {
	
	/**Méthode static pour réaliser une opération
	 * @param a
	 * @param b
	 * @param operateur
	 * @return résultat de l'opération
	 */
	public static double calcul(double a, double b, char operateur) {
		double resultat = 0;

		switch(operateur) {
		case '+' : resultat = a+b;
		break;
		case'-' : resultat = a-b;
		break;
		case'*' : resultat = a*b;
		break;
		case'/' : resultat = a/b;
		break;
		default :
			System.out.println("cet opérateur n'est pas valide");
		break;
		}
		return resultat;
	}

}
