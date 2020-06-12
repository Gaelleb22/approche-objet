package fr.diginamic.entites;

/**Classe permettant d'instancier un Cercle ave un attribut rayon
 * @author formation
 *
 */
public class Cercle {
	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double nvRayon) {
		rayon = nvRayon;
	}
	
	public double perimetre() {
		return 2*rayon*Math.PI;
	}
	
	public double surface() {
		return rayon*rayon*Math.PI;
	}

}
