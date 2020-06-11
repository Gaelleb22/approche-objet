package fr.diginamic.banque.entites;

public abstract class Operation {
	
	private String dateOp;
	private double montant;

	public Operation(String dateOp, double montant) {
		this.dateOp = dateOp;
		this.montant = montant;
	}

	public String getDateOp() {
		return dateOp;
	}

	private void setDateOp(String dateOp) {
		this.dateOp = dateOp;
	}

	public double getMontant() {
		return montant;
	}

	private void setMontant(double montant) {
		this.montant = montant;
	}

	@Override
	public String toString() {
		return dateOp + " --> " + montant;
	}
	
	public abstract String afficherType();

}
