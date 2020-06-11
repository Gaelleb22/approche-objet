package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	private double taux;

	public CompteTaux(String compte, double solde, double taux) {
		super(compte, solde);
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	private void setTaux(double taux) {
		this.taux = taux;
	}

	public String toString() {
		return super.toString() + " taux : "+ taux + "%";
	}
	

}
