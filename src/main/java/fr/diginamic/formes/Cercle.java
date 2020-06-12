package fr.diginamic.formes;

public class Cercle extends Forme {
	
	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double nvRayon) {
		this.rayon = nvRayon;
	}

	@Override
	public double calculerSurface() {
		return rayon*rayon*Math.PI;
	}

	@Override
	public double calculerPerimetre() {
		return 2*rayon*Math.PI;
	}

}
