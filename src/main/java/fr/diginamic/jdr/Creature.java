package fr.diginamic.jdr;

import java.util.Random;

/**Classe permettant de créer une créature
 * @author formation
 *
 */
public class Creature extends Combattant {
	
	Random random = new Random();
	
	/** Constructeur
	 * 
	 */
	public Creature() {
		super.setNom(creatureAleatoire());
		super.setForce(forceAleatoire(getNom()));
		super.setPointDeVie(pdvAleatoire(getNom()));
	}


	/**méthode permettant de générer un nom de créature aléatoire
	 * @return nom
	 */
	private String creatureAleatoire() {
		setNom(null);
		int nombreAleatoire = random.nextInt(3);
		switch(nombreAleatoire) {
		case(0) : setNom("loup");
		break;
		case(1) : setNom("gobelin");
		break;
		case(2) : setNom("troll");
		break;
		}
		return getNom();
	}
	
	/**méthode permettant de générer une force aléatoire en fonction du nom
	 * @param nom
	 * @return force
	 */
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
	
	/**méthode permettant de générer des points de vie aléatoires en fonction du nom
	 * @param nom
	 * @return point de vie
	 */
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
