package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	
	private int nombreJourTravail;
	private double salaireJournalier;

	public Pigiste(String nom, String prenom, int nombreJourTravail, double salaireJournalier) {
		super(nom, prenom);
		this.nombreJourTravail = nombreJourTravail;
		this.salaireJournalier = salaireJournalier;
	}

	public int getNombreJourTravail() {
		return nombreJourTravail;
	}

	public void setNombreJourTravail(int nvNombreJourTravail) {
		this.nombreJourTravail = nvNombreJourTravail;
	}

	public double getSalaireJournalier() {
		return salaireJournalier;
	}

	public void setSalaireJournalier(double nvSalaireJournalier) {
		this.salaireJournalier = nvSalaireJournalier;
	}

	@Override
	public double getSalaire() {
		return nombreJourTravail*salaireJournalier;
	}

}
