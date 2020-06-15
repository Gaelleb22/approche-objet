package fr.diginamic.jdr;

import java.util.Random;

public class Creature extends Combattant {
	
	Random random = new Random();
	
	private String nom;

	public Creature() {
		this.nom = creatureAleatoire();
		super.setForce(forceAleatoire(nom));
		super.setPointDeVie(pdvAleatoire(nom));
	}

	public String getNom() {
		return nom;
	}

	private String creatureAleatoire() {
		nom = null;
		int nombreAleatoire = random.nextInt(2);
		switch(nombreAleatoire) {
		case(0) : nom = "loup";
		break;
		case(1) : nom = "gobelin";
		break;
		case(3) : nom = "troll";
		break;
		}
		return nom;
	}
	
	private int forceAleatoire(String nom) {
		int force = 0;
		if(nom.equals("loup")) {
			force = random.nextInt(5)+3;
		}
		else if(nom.equals("gobelin")) {
			force = random.nextInt(5)+5;
		}
		else {
			force = random.nextInt(5)+10;
		}
		return force;
	}
	
	private int pdvAleatoire(String nom) {
		int pdv = 0;
		if(nom.equals("loup")) {
			pdv = random.nextInt(5)+5;
		}
		else if(nom.equals("gobelin")) {
			pdv = random.nextInt(5)+10;
		}
		else {
			pdv = random.nextInt(10)+20;
		}
		return pdv;
	}


}
