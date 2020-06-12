package fr.diginamic.banque.entites;

public class Debit extends Operation {
	
	public Debit(String dateOp, double montant) {
		super(dateOp, montant);
	}
	
	public String afficherType() {
		return "Débit";
	}
	
	public double imputersolde(double solde) {
		return solde-getMontant();
	}

}
