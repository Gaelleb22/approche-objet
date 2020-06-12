package fr.diginamic.operations;

public class Operations {
	
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
