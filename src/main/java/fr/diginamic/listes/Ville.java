package fr.diginamic.listes;

/**
 * @author formation
 *
 */
public class Ville {
	/** nom */
	private String nom;
	/** nombreHabitant */
	private int nombreHabitant;
	
	/** Constructeur
	 * @param nom
	 * @param nombreHabitant
	 */
	public Ville(String nom, int nombreHabitant) {
		this.nom = nom;
		this.nombreHabitant = nombreHabitant;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the nombreHabitant
	 */
	public int getNombreHabitant() {
		return nombreHabitant;
	}

	/** Setter
	 * @param nombreHabitant the nombreHabitant to set
	 */
	public void setNombreHabitant(int nombreHabitant) {
		this.nombreHabitant = nombreHabitant;
	}

	@Override
	public String toString() {
		return "\n"+"nom = " + nom + " nombreHabitant = " + nombreHabitant;
	}
	
	

}
