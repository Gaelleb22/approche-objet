package fr.diginamic.essais;

import fr.diginamic.jdr.Jeu;
import fr.diginamic.jdr.Personnage;

public class TestJdr {

	public static void main(String[] args) {
		Personnage marcus = null;
		
		boolean quitMenu = false;
		
		while(!quitMenu) {
			boolean quit = false;
			String choix = Jeu.choixOption();
			while(!quit) {
			
				switch(choix) {
				case"1" : marcus = new Personnage();
				System.out.println("Vous avez crée un nouveau personnage :");
				System.out.println("Force = "+marcus.getForce());
				System.out.println("Points de vie = "+marcus.getPointDeVie()+"\n");
				quit = true;
				break;
				case "2" : 
					if (marcus == null || marcus.getPointDeVie()<=0) {
						System.out.println("Vous n'avez plus de point de vie , créer un nouveau personnage \n");
					}
					else {
						Jeu.combattre(marcus);
					}
				quit = true;
				break;
				case "3" : 
					if (marcus == null) {
						System.out.println("Créer un nouveau personnage \n");
					}
					else {
						System.out.println("Votre score est de : "+marcus.getScore()+"\n");
					}
				quit = true;
				break;
				case "4" : System.out.println("Vous avez quitter le jeu !");
					quitMenu = true;
					quit = true;
				break;
				default : System.out.println("Cette option n'existe pas \n");
				quit = true;
				break;
				}
			}
		}
		
	}

}
