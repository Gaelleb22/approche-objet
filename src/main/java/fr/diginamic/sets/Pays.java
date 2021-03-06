package fr.diginamic.sets;

import java.util.Collections;

import fr.diginamic.enumeration.Continent;

/**Classe objet représentant des pays
 * @author formation
 *
 */
public class Pays {
	
	/** nom */
	private String nom;
	/** nombre d'habitant */
	private int nbHabitant;
	/** pib par habitant */
	private int pibParHabitant;
	/** continent */
	private Continent continent;
	
	
	/** Constructeur
	 * @param nom
	 * @param nbHabitant
	 * @param pibParHabitant
	 */
	public Pays(String nom, int nbHabitant, int pibParHabitant, Continent continent) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pibParHabitant = pibParHabitant;
		this.continent = continent;
	}

	/** Constructeur
	 * @param nom
	 * @param nbHabitant
	 * @param pibParHabitant
	 */
	public Pays(String nom, int nbHabitant, int pibParHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pibParHabitant = pibParHabitant;
	}
	
	/**calcul du PIB total
	 * @return
	 */
	public long getPibTotal() {
		long calcul = (long)nbHabitant * (long)pibParHabitant;
		return calcul; 
	}
	
	@Override
	public String toString() {
		return nom +" - Poo : "+ nbHabitant +" - PIB/hab : "+ pibParHabitant +" PIB total : "+ getPibTotal();
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
	 * @return the nbHabitant
	 */
	public int getNbHabitant() {
		return nbHabitant;
	}
	/** Setter
	 * @param nbHabitant the nbHabitant to set
	 */
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
	/** Getter
	 * @return the pibParHabitant
	 */
	public int getPibParHabitant() {
		return pibParHabitant;
	}
	/** Setter
	 * @param pibParHabitant the pibParHabitant to set
	 */
	public void setPibParHabitant(int pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}

	/** Getter
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}

	/** Setter
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
