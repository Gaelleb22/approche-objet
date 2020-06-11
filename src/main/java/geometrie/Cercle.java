package geometrie;

public class Cercle implements ObjetGeometrique{
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

	@Override
	public double perimetre() {
		return 2*rayon*Math.PI;
	}

	@Override
	public double surface() {
		return rayon*rayon*Math.PI;
	}

}
