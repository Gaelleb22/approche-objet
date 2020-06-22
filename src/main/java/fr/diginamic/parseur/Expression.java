package fr.diginamic.parseur;

/**Classe objet représentant une Expression mathématique de type "variable""opérateur""constante"
 * exemple : x+1; 5-y; 6.3*x
 * @author formation
 *
 */
public class Expression {
	
	/** membre droit de l'expression */
	private String membreDroit;
	/** membre gauche de l'expression */
	private String membreGauche;
	/** operateur */
	private char operateur;
	
	/** Constructeur
	 * @param membreDroit
	 * @param membreGauche
	 * @param operateur
	 */
	public Expression(String membreDroit, String membreGauche, char operateur) {
		this.membreDroit = membreDroit;
		this.membreGauche = membreGauche;
		this.operateur = operateur;
	}
	
	/**méthode pour évaluer la valeur de l'expression
	 * @param variable
	 * @param valeur
	 * @return
	 */
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
		} catch(Exception e) {}
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
		} catch(Exception e) {}
		return resultat;
	}

	/** Getter
	 * @return the membreDroit
	 */
	public String getMembreDroit() {
		return membreDroit;
	}

	/** Setter
	 * @param membreDroit the membreDroit to set
	 */
	public void setMembreDroit(String membreDroit) {
		this.membreDroit = membreDroit;
	}

	/** Getter
	 * @return the membreGauche
	 */
	public String getMembreGauche() {
		return membreGauche;
	}

	/** Setter
	 * @param membreGauche the membreGauche to set
	 */
	public void setMembreGauche(String membreGauche) {
		this.membreGauche = membreGauche;
	}

	/** Getter
	 * @return the operateur
	 */
	public char getOperateur() {
		return operateur;
	}

	/** Setter
	 * @param operateur the operateur to set
	 */
	public void setOperateur(char operateur) {
		this.operateur = operateur;
	}

}
