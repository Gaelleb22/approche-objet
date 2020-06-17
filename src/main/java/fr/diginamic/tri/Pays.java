package fr.diginamic.tri;

import java.util.Collections;

/**Créer une classe pays
 * @author formation
 *
 */
public class Pays implements Comparable<Pays> {
	/** nom */
	private String nom;
	/** nbHabitant */
	private int nbHabitant;
	/** pibParHabitant */
	private int pibParHabitant;
	
	
	
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
	

	@Override
	public int compareTo(Pays pays2) {
		if(this.pibParHabitant>pays2.pibParHabitant) {
			return 1;
		}
		else if(this.pibParHabitant<pays2.pibParHabitant) {
			return -1;
		}
		return 0;
	}

	
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

}
