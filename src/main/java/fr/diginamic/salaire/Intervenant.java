package fr.diginamic.salaire;

/**Classe mère représentant un intervenant
 * @author formation
 *
 */
public abstract class Intervenant {
	
	/** nom */
	private String nom;
	/** prenom */
	private String prenom;
	
	/** Constructeur
	 * @param nom
	 * @param prenom
	 */
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/**méthode de calcul du salaire
	 * @return salaire
	 */
	public abstract double getSalaire();
	
	/**méthode d'affichage des données de l'intervenant
	 * 
	 */
	public void afficherDonnees() {
		System.out.println("Nom : "+nom);
		System.out.println("Prénom : "+prenom);
		System.out.println("Salaire : "+getSalaire());
		System.out.println("Statut : "+toString());
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
