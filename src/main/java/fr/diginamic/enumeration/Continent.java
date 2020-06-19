package fr.diginamic.enumeration;

public enum Continent {
	
	EUROPE("Europe"),
	ASIE("Asie"),
	AMERIQUE("Amérique"),
	AFRIQUE("Afrique"),
	OCEANIE("Océanie");
	
	private String nom;

	/** Constructeur
	 * @param nom
	 */
	private Continent(String nom) {
		this.nom = nom;
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
	

}
