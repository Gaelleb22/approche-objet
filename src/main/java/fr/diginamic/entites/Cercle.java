package fr.diginamic.entites;

/**Classe permettant d'instancier un Cercle avec un attribut rayon
 * @author formation
 *
 */
public class Cercle {
	/** rayon */
	private double rayon;

	/** Constructeur
	 * @param rayon
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	/**méthode de calcul du périmètre
	 * @return périmètre
	 */
	public double perimetre() {
		return 2*rayon*Math.PI;
	}
	
	/**méthode de calcul de la surface
	 * @return surface
	 */
	public double surface() {
		return rayon*rayon*Math.PI;
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
