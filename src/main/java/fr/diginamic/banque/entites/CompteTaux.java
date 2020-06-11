package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	private double taux;

	public CompteTaux(String numeroCompte, double solde, double taux) {
		super(numeroCompte, solde);
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	private void setTaux(double nvTaux) {
		this.taux = nvTaux;
	}

	public String toString() {
		return super.toString() + " taux : "+ taux + "%";
	}
	

}
