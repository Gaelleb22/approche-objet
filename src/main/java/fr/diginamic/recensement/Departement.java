/**
 * 
 */
package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

/**Classe objet pour initialiser un département
 * @author formation
 *
 */
public class Departement {
	
	/** villeDuDepartement */
	List<Ville> villeDuDepartement;
	/** populationTotale */
	private int populationTotale;
	/** nom */
	private String codeDepartement;
	
	/** Constructeur
	 * @param liste
	 * @param codeDepartement
	 */
	public Departement(List<Ville> liste, String codeDepartement){
		List<Ville> departement = new ArrayList<>();
		for(Ville ville : liste) {
			if(codeDepartement.equals(ville.getCodeDepartement())) {
				departement.add(ville);
			}
		}
		this.villeDuDepartement = departement;
		this.codeDepartement = codeDepartement;
		this.populationTotale = calculPopulation(villeDuDepartement);
	}
	
	private int calculPopulation(List<Ville> liste) {
		int population=0;
		for(Ville ville : liste) {
			population += ville.getPopulation();
		}
		return population;
	}


	@Override
	public String toString() {
		return codeDepartement;
	}

	/** Getter
	 * @return the populationTotale
	 */
	public int getPopulationTotale() {
		return populationTotale;
	}

	/** Setter
	 * @param populationTotale the populationTotale to set
	 */
	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}

	/** Getter
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/** Setter
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	/** Getter
	 * @return the villeDuDepartement
	 */
	public List<Ville> getVilleDuDepartement() {
		return villeDuDepartement;
	}

	/** Setter
	 * @param villeDuDepartement the villeDuDepartement to set
	 */
	public void setVilleDuDepartement(List<Ville> villeDuDepartement) {
		this.villeDuDepartement = villeDuDepartement;
	}
	
}
