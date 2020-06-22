package fr.diginamic.banque.entites;

/**Classe objet représentant un Compte bancaire
 * @author formation
 *
 */
public class Compte {
	
	/** numéro de compte */
	private String numeroCompte;
	/** solde du compte */
	private double solde;
	
	
	/** Constructeur
	 * @param numeroCompte
	 * @param solde
	 */
	public Compte(String numeroCompte, double solde) {
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}

	/** Getter
	 * @return the numeroCompte
	 */
	public String getNumeroCompte() {
		return numeroCompte;
	}

	/** Setter
	 * @param numeroCompte the numeroCompte to set
	 */
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	/** Getter
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**Redéfinition de la méthode toString() pour afficher les informations du compte
	 *
	 */
	public String toString() {
		return "Numéro de compte : " + numeroCompte + " solde : " + solde + "€";
	}
	
}
