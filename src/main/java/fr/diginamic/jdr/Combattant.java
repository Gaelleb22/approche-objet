package fr.diginamic.jdr;

import java.util.Random;

public abstract class Combattant {
	
	Random random = new Random();
	
	private int force;
	private int pointDeVie;
	
	public Combattant() {
		this.force = random.nextInt();
		this.pointDeVie = random.nextInt();
	}

	public int getForce() {
		return force;
	}

	public void setForce(int nvForce) {
		this.force = nvForce;
	}

	public int getPointDeVie() {
		return pointDeVie;
	}

	protected void setPointDeVie(int nvPointDeVie) {
		this.pointDeVie = nvPointDeVie;
	}
	
	public int attaque() {
		int attaque = getForce() + random.nextInt(9) + 1;
		return attaque;
	}

}
