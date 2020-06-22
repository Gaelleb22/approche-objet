package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

/**Classe objet pour initialiser une région
 * @author formation
 *
 */
public class Region {
	
	/** ville de la région */
	List<Ville> villeRegion;
	/** population totale */
	private int populationTotale;
	/** nom */
	private String nomRegion;
	
	/** Constructeur
	 * @param liste
	 * @param codeRegion
	 */
	public Region(List<Ville> liste, String nomRegion){
		List<Ville> region = new ArrayList<>();
		for(Ville ville : liste) {
			if(nomRegion.equals(ville.getNomRegion())) {
				region.add(ville);
			}
		}
		this.villeRegion = region;
		this.nomRegion = nomRegion;
		this.populationTotale = calculPopulation(villeRegion);
	}


	/**calcul de la population d'une région
	 * @param liste
	 * @return population
	 */
	private int calculPopulation(List<Ville> liste) {
		int population=0;
		for(Ville ville : liste) {
			population += ville.getPopulation();
		}
		return population;
	}
	

	/** Getter
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}


	/** Setter
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
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
	 * @return the villeDuDepartement
	 */
	public List<Ville> getVilleRegion() {
		return villeRegion;
	}

	/** Setter
	 * @param villeDuDepartement the villeDuDepartement to set
	 */
	public void setVilleRegion(List<Ville> villeRegion) {
		this.villeRegion = villeRegion;
	}
	

	@Override
	public String toString() {
		return nomRegion;
	}


}
