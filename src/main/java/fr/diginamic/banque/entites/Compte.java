package fr.diginamic.banque.entites;

public class Compte {
	
	private String numeroCompte;
	private double solde;
	
	public String getNumeroCompte() {
		return numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	private void setSolde(double nvSolde) {
		solde = nvSolde;
	}

	public Compte(String numeroCompte, double solde) {
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}

	public String toString() {
		return "Numéro de compte : " + numeroCompte + " solde : " + solde + "€";
	}
	
}
