package fr.diginamic.formes;

public class Rectangle extends Forme {
	
	private double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double nvLongueur) {
		this.longueur = nvLongueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double nvLargeur) {
		this.largeur = nvLargeur;
	}

	@Override
	public double calculerSurface() {
		return longueur*largeur;
	}

	@Override
	public double calculerPerimetre() {
		return 2*longueur+2*largeur;
	}

}