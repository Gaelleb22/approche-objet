package geometrie;

/** Classe permettant de créer un cercle
 * 
 */
public class Cercle implements ObjetGeometrique{
	
	/** rayon */
	private double rayon;

	/** Constructeur
	 * @param rayon
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		return 2*rayon*Math.PI;
	}

	@Override
	public double surface() {
		return rayon*rayon*Math.PI;
	}
	
	/** Getter
	 * @return rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/** Setter
	 * @param nouveau rayon
	 */
	public void setRayon(double nvRayon) {
		rayon = nvRayon;
	}

}
