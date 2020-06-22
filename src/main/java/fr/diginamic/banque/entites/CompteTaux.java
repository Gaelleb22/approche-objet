package fr.diginamic.banque.entites;

/**Classe objet représentant un Compte bancaire avec un paramètre taux
 * Hérite de la classe Compte
 * @author formation
 *
 */
public class CompteTaux extends Compte {
	
	/** taux de rémunération */
	private double taux;

	/** Constructeur
	 * @param numeroCompte
	 * @param solde
	 * @param taux
	 */
	public CompteTaux(String numeroCompte, double solde, double taux) {
		super(numeroCompte, solde);
		this.taux = taux;
	}

	/** Getter
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/** Setter
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/**Redéfinition de la méthode toString() pour afficher les informations de la classe mère et le taux
	 *
	 */
	public String toString() {
		return super.toString() + " taux : "+ taux + "%";
	}
	

}
