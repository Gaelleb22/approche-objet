package fr.diginamic.parseur;

public class Parser {

	public static Expression parse(String chaine) {
		char operateur = chaine.charAt(indexOperateur(chaine));
		String membreDroit = membreDroit(chaine);
		String membreGauche = membreGauche(chaine);
		
		Expression expression = new Expression(membreDroit, membreGauche, operateur);
		return expression;
	
	}
	
	private static String membreDroit(String chaine) {
		int indexOp = indexOperateur(chaine);
		String droite = chaine.substring(0, indexOp);
		return droite;
	}
	
	private static String membreGauche(String chaine) {
		int indexOp = indexOperateur(chaine);
		String gauche = chaine.substring(indexOp+1, chaine.length());
		return gauche;
	}
	
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
