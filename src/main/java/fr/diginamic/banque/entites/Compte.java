package fr.diginamic.banque.entites;

public class Compte {
	
	private int numeroCompte;
	private double solde;
	
	public int getNumeroCompte() {
		return numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	private void setSolde(double nvSolde) {
		solde = nvSolde;
	}

	public Compte(int compte, double solde) {
		this.numeroCompte = compte;
		this.solde = solde;
	}

	public String toString() {
		return "Numéro de compte : " + numeroCompte + ", solde : " + solde + "€.";
	}
	
}
