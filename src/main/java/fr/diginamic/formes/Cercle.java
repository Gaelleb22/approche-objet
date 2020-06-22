package fr.diginamic.formes;

/**Classe représentant un cercle
 * Hérite de Forme
 * @author formation
 *
 */
public class Cercle extends Forme {
	
	/** rayon */
	private double rayon;

	/** Constructeur
	 * @param rayon
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		return rayon*rayon*Math.PI;
	}

	@Override
	public double calculerPerimetre() {
		return 2*rayon*Math.PI;
	}

	/** Getter
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/** Setter
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
