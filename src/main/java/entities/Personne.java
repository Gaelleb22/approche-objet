package entities;

/**
 * @author formation
 *
 */
public class Personne {
	
	/** nom */
	private String nom;
	/** prenom */
	private String prenom;
	/** adresse */
	private AdressePostale adresse;

	/** Constructeur
	 * @param nom
	 * @param prenom
	 */
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	/** Constructeur
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	/**Méthode pour afficher le nom et le prénom
	 * 
	 */
	public void afficherIdentite() {	
		System.out.println(nom.toUpperCase() + " " + prenom);
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

	/** Getter
	 * @return the adresse
	 */
	public AdressePostale getAdresse() {
		return adresse;
	}

	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	

}
