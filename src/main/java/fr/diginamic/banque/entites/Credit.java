package fr.diginamic.banque.entites;

/**Classe objet représentant une opération de crédit
 * Hérite de la classe Operation
 * @author formation
 *
 */
public class Credit extends Operation {
	
	/** Constructeur
	 * @param dateOp
	 * @param montant
	 */
	public Credit(String dateOp, double montant) {
		super(dateOp, montant);
	}
	
	@Override
	public String afficherType() {
		return "Crédit";
	}
	
	@Override
	public double imputersolde(double solde) {
		return solde+getMontant();
	}
}
