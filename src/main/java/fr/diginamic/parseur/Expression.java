package fr.diginamic.parseur;

public class Expression {
	
	private String membreDroit;
	private String membreGauche;
	private char operateur;
	
	public Expression(String membreDroit, String membreGauche, char operateur) {
		this.membreDroit = membreDroit;
		this.membreGauche = membreGauche;
		this.operateur = operateur;
	}
	
	public String getMembreDroit() {
		return membreDroit;
	}

	public String getMembreGauche() {
		return membreGauche;
	}

	public char getOperateur() {
		return operateur;
	}
	
	public double evaluer(String variable, double valeur) {
		double resultat = 0;
		double constante=0;
		try {
			constante = Double.valueOf(membreDroit);
			if(membreGauche.equalsIgnoreCase(variable)) {
				switch (operateur) {
				case '+': resultat = constante+valeur;
				break;
				case '-': resultat = constante-valeur;
				break;
				case '*': resultat = constante*valeur;
				break;
				case '/': resultat= constante/valeur;
				break;
				default:
				break;
				}
			}
			else {
				System.out.println("La variable "+variable+" n'est pas présente dans l'expression");
			}
			
		}
		catch(Exception e) {
		}
		try {
			constante = Double.valueOf(membreGauche);
			if(membreDroit.equalsIgnoreCase(variable)) {
				switch (operateur) {
				case '+': resultat = valeur+constante;
				break;
				case '-': resultat = valeur-constante;
				break;
				case '*': resultat = valeur*constante;
				break;
				case '/': resultat= valeur/constante;
				break;
				default:
				break;
				}
			}
			else {
				System.out.println("La variable "+variable+" n'est pas présente dans l'expression");
			}
			
		}
		catch(Exception e) {
		}
		return resultat;

	}

}
