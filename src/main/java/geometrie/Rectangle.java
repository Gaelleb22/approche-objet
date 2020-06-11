package geometrie;

public class Rectangle implements ObjetGeometrique{
	private double longueur;
	private double largeur;
	
	public Rectangle(double longeur, double largeur) {
		this.longueur = longeur;
		this.largeur = largeur;
	}

	public double getLongueur() {
		return longueur;
	}
	
	public void setLongueur(double nvLongueur) {
		longueur = nvLongueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double nvLargeur) {
		largeur = nvLargeur;
	}

	@Override
	public double perimetre() {
		return 2*longueur+2*largeur;
	}
	@Override
	public double surface() {
		return longueur*largeur;
	}
}
