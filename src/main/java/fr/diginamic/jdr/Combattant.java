package fr.diginamic.jdr;

import java.util.Random;

/**Classe mère représentant les combattants du jeu de rôle
 * @author formation
 *
 */
public abstract class Combattant {
	
	Random random = new Random();
	
	/** nom */
	private String nom;
	/** force */
	private int force;
	/** point de vie */
	private int pointDeVie;
	
	/** Constructeur
	 * 
	 */
	public Combattant() {
		this.force = random.nextInt();
		this.pointDeVie = random.nextInt();
	}
	
	/**méthode pour calculer la puissance de l'attaque d'un combattant
	 * @return attaque
	 */
	public int attaque() {
		int attaque = getForce() + random.nextInt(9) + 1;
		return attaque;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/** Getter
	 * @return the force
	 */
	public int getForce() {
		return force;
	}

	/** Setter
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}

	/** Getter
	 * @return the pointDeVie
	 */
	public int getPointDeVie() {
		return pointDeVie;
	}

	/** Setter
	 * @param pointDeVie the pointDeVie to set
	 */
	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}

}
