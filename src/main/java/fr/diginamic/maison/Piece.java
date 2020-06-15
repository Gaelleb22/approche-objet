package fr.diginamic.maison;

public abstract class Piece {
	
	private double superficie;
	private int etage;
	
	public Piece(double superficie, int etage) {
		this.superficie = superficie;
		this.etage = etage;
	}

	public double getSuperficie() {
		return superficie;
	}

	private void setSuperficie(double nvSuperficie) {
		this.superficie = nvSuperficie;
	}

	public int getEtage() {
		return etage;
	}

	private void setEtage(int nvEtage) {
		this.etage = nvEtage;
	}
	public abstract String toString();

}
