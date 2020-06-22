package fr.diginamic.parseur;

/**Retourne un objet de type expression
 * @author formation
 *
 */
public class Parser {

	/**méthode pour retourner une expression à partir d'une chaine
	 * @param chaine
	 * @return expression
	 */
	public static Expression parse(String chaine) {
		char operateur = chaine.charAt(indexOperateur(chaine));
		String membreDroit = membreDroit(chaine);
		String membreGauche = membreGauche(chaine);
		
		Expression expression = new Expression(membreDroit, membreGauche, operateur);
		return expression;
	
	}
	
	/**méthode pour retourner le membre droit
	 * @param chaine
	 * @return membre droit
	 */
	private static String membreDroit(String chaine) {
		int indexOp = indexOperateur(chaine);
		String droite = chaine.substring(0, indexOp);
		return droite;
	}
	
	/**méthode pour retourner le membre gauche
	 * @param chaine
	 * @return membre gauche
	 */
	private static String membreGauche(String chaine) {
		int indexOp = indexOperateur(chaine);
		String gauche = chaine.substring(indexOp+1, chaine.length());
		return gauche;
	}
	
	/**méthode pour retourner l'index de l'opérateur
	 * @param chaine
	 * @return inde de l'operateur
	 */
	private static int indexOperateur(String chaine) {
		int indexOp = 0;
		if (chaine.indexOf('+')>0) {
			indexOp = chaine.indexOf('+');
		}
		else if(chaine.indexOf('-')>0) {
			indexOp = chaine.indexOf('-');
		}
		else if(chaine.indexOf('*')>0) {
			indexOp = chaine.indexOf('*');
		}
		else if(chaine.indexOf('/')>0) {
			indexOp = chaine.indexOf('/');
		}
		else {
			indexOp = -1;
		}
		
		return indexOp;
	
	}

}
