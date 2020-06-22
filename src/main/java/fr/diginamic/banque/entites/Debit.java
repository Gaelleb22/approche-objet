package fr.diginamic.banque.entites;

/**Classe objet représentant une opération de débit
 * Hérite de la classe Operation
 * @author formation
 *
 */
public class Debit extends Operation {
	
	/** Constructeur
	 * @param dateOp
	 * @param montant
	 */
	public Debit(String dateOp, double montant) {
		super(dateOp, montant);
	}
	
	@Override
	public String afficherType() {
		return "Débit";
	}
	
	@Override
	public double imputersolde(double solde) {
		return solde-getMontant();
	}

}
