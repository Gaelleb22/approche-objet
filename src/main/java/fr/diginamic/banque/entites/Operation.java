package fr.diginamic.banque.entites;

public abstract class Operation {
	
	private String dateOp;
	private double montant;

	/**
	 * @param dateOp : date de l'opération
	 * @param montant : montant de l'opération
	 */
	public Operation(String dateOp, double montant) {
		this.dateOp = dateOp;
		this.montant = montant;
	}

	public String getDateOp() {
		return dateOp;
	}

	private void setDateOp(String nvDateOp) {
		this.dateOp = nvDateOp;
	}

	public double getMontant() {
		return montant;
	}

	private void setMontant(double nvMontant) {
		this.montant = nvMontant;
	}

	@Override
	public String toString() {
		return dateOp + " --> " + montant;
	}
	
	public abstract String afficherType();

}
