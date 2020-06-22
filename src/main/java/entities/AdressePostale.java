package entities;

/**Classe objet représentant une adresse postale
 * @author formation
 *
 */
public class AdressePostale {
	
	/** numéro de rue */
	private int numeroRue;
	/** libellé de la rue */
	private String libelleRue;
	/** code postal */
	private int codePostal;
	/** ville */
	private String ville;
	
	/** Constructeur
	 * @param numeroRue
	 * @param libelleRue
	 * @param codePostal
	 * @param ville
	 */
	public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue =libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	/** Getter
	 * @return the numeroRue
	 */
	public int getNumeroRue() {
		return numeroRue;
	}

	/** Setter
	 * @param numeroRue the numeroRue to set
	 */
	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	/** Getter
	 * @return the libelleRue
	 */
	public String getLibelleRue() {
		return libelleRue;
	}

	/** Setter
	 * @param libelleRue the libelleRue to set
	 */
	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	/** Getter
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/** Setter
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/** Getter
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/** Setter
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

}
