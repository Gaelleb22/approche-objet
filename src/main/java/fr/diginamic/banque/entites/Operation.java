package fr.diginamic.banque.entites;

/**Classe abstraite représentant une opération effectuée sur un compte
 * @author formation
 *
 */
public abstract class Operation {
	
	/** date de l'opération */
	private String dateOp;
	/** montant */
	private double montant;

	/** Constructeur
	 * @param dateOp
	 * @param montant
	 */
	public Operation(String dateOp, double montant) {
		this.dateOp = dateOp;
		this.montant = montant;
	}

	/** Getter
	 * @return the dateOp
	 */
	public String getDateOp() {
		return dateOp;
	}

	/** Setter
	 * @param dateOp the dateOp to set
	 */
	public void setDateOp(String dateOp) {
		this.dateOp = dateOp;
	}

	/** Getter
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/** Setter
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	@Override
	public String toString() {
		return afficherType() + " " + dateOp + " --> " + montant;
	}
	
	/**Méthode abstraite pour afficher le type de l'opération
	 * @return
	 */
	public abstract String afficherType();
	
	/**Méthode abstraite pour calculer le nouveau solde
	 * @param solde
	 * @return
	 */
	public abstract double imputersolde(double solde);

}
