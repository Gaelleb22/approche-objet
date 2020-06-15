package fr.diginamic.jdr;

import java.util.Random;

public class Personnage extends Combattant {
	
	Random random = new Random();
	
	private int score;

	public Personnage() {
		super.setForce(random.nextInt(6)+12);
		super.setPointDeVie(random.nextInt(30)+20);
		this.score = 0;
	}

	public int getScore() {
		return score;
	}
	
	public void setScore(int nvScore) {
		score = nvScore;
	}
	
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

}
