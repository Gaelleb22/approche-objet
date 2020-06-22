package geometrie;

/** Classe permettant de créer un rectangle
 *
 */
public class Rectangle implements ObjetGeometrique{
	
	/** longueur */
	private double longueur;
	/** largeur */
	private double largeur;
	
	/** Constructeur
	 * @param longeur
	 * @param largeur
	 */
	public Rectangle(double longeur, double largeur) {
		this.longueur = longeur;
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		return 2*longueur+2*largeur;
	}
	@Override
	public double surface() {
		return longueur*largeur;
	}
	
	/** Getter
	 * @return longueur
	 */
	public double getLongueur() {
		return longueur;
	}
	
	/** Setter
	 * @param nouvelle longueur
	 */
	public void setLongueur(double nvLongueur) {
		longueur = nvLongueur;
	}

	/** Getter
	 * @return largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/** Setter
	 * @param nouvelle largeur
	 */
	public void setLargeur(double nvLargeur) {
		largeur = nvLargeur;
	}
}
