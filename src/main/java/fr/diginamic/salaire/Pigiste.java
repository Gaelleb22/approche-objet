package fr.diginamic.salaire;

/**Classe représentant un pigiste
 * Hérite de la classe Intervenant
 * @author formation
 *
 */
public class Pigiste extends Intervenant {
	
	/** nombre de jour de travail */
	private int nombreJourTravail;
	/** salaire journalier */
	private double salaireJournalier;

	/** Constructeur
	 * @param nom
	 * @param prenom
	 * @param nombreJourTravail
	 * @param salaireJournalier
	 */
	public Pigiste(String nom, String prenom, int nombreJourTravail, double salaireJournalier) {
		super(nom, prenom);
		this.nombreJourTravail = nombreJourTravail;
		this.salaireJournalier = salaireJournalier;
	}

	@Override
	public double getSalaire() {
		return nombreJourTravail*salaireJournalier;
	}
	
	@Override
	public String toString() {
		return "Pigiste";
	}

	/** Getter
	 * @return the nombreJourTravail
	 */
	public int getNombreJourTravail() {
		return nombreJourTravail;
	}

	/** Setter
	 * @param nombreJourTravail the nombreJourTravail to set
	 */
	public void setNombreJourTravail(int nombreJourTravail) {
		this.nombreJourTravail = nombreJourTravail;
	}

	/** Getter
	 * @return the salaireJournalier
	 */
	public double getSalaireJournalier() {
		return salaireJournalier;
	}

	/** Setter
	 * @param salaireJournalier the salaireJournalier to set
	 */
	public void setSalaireJournalier(double salaireJournalier) {
		this.salaireJournalier = salaireJournalier;
	}

}
