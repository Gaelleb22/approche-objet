package fr.diginamic.formes;

/**Classe représentant un Rectangle
 * Hérite de Forme
 * @author formation
 *
 */
public class Rectangle extends Forme {
	
	/** longueur */
	private double longueur;
	/** largeur */
	private double largeur;

	/** Constructeur
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		return longueur*largeur;
	}

	@Override
	public double calculerPerimetre() {
		return 2*longueur+2*largeur;
	}

	/** Getter
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/** Setter
	 * @param longueur the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	/** Getter
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/** Setter
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

}
