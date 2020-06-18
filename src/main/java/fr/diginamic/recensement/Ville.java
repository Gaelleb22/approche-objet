package fr.diginamic.recensement;

/**Classe objet pour initialiser une ville
 * @author formation
 *
 */
public class Ville {
	
	/** code de la région */
	private String codeRegion;
	/** nom de la région */
	private String nomRegion;
	/** code du département */
	private String codeDepartement;
	/** code de la commune */
	private int codeCommune;
	/** nom de la commune */
	private String nomCommune;
	/** population */
	private int population;


	/** Constructeur
	 * @param codeRegion
	 * @param nomRegion
	 * @param codeDepartement
	 * @param codeCommune
	 * @param nomCommune
	 * @param population
	 */
	public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune,
			String population) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = Integer.parseInt(codeCommune);
		this.nomCommune = nomCommune;
		this.population = Integer.parseInt(population);
	}
	
	
	@Override
	public String toString() {
		return codeRegion +" "+ nomRegion  +" - "+ codeDepartement +", "+ codeCommune +" - "+ nomCommune +"-->"+ population;
	}
	
	
	/** Getter
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}
	/** Setter
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
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
	 * @return the codeCommune
	 */
	public int getCodeCommune() {
		return codeCommune;
	}
	/** Setter
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}
	/** Getter
	 * @return the nomCommune
	 */
	public String getNomCommune() {
		return nomCommune;
	}
	/** Setter
	 * @param nomCommune the nomCommune to set
	 */
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}
	/** Getter
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}
	/** Setter
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}

}
