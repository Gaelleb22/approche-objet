package fr.diginamic.jdr;

import java.util.Random;

/**Classe permettant de créer un personnage
 * Hérite de la classe Combattant
 * @author formation
 *
 */
public class Personnage extends Combattant {
	
	Random random = new Random();
	
	/** score */
	private int score;

	/** Constructeur
	 * 
	 */
	public Personnage() {
		super.setForce(random.nextInt(6)+12);
		super.setPointDeVie(random.nextInt(30)+20);
		this.score = 0;
	}
	
	/** méthode permettant de calculer le score en fonction du type de créature
	 * @param creature
	 * @return score
	 */
	public int calculerScore(String creature) {
		if(creature.equals("loup")) {
			score += 1;
		}
		else if(creature.equals("gobelin")) {
			score += 2;
		}
		else {
			score +=5;
		}
		return score;
	}

	/** Getter
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/** Setter
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

}
