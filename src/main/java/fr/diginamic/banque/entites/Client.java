package fr.diginamic.banque.entites;

/**Classe objet représentant un client de la banque
 * @author formation
 *
 */
public class Client {
	
	/** nom */
	private String nom;
	/** prenom */
	private String prenom;
	
	/** Constructeur
	 * @param nom
	 * @param prenom
	 */
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
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
