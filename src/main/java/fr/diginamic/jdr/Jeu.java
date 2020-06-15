package fr.diginamic.jdr;

import java.util.Scanner;

import javax.print.attribute.standard.PresentationDirection;

public class Jeu {
	
	public static String choixOption(){
		Scanner scanner = new Scanner(System.in);
		String choix;
		System.out.println("Choissez une option : \n");

		System.out.println("1. Créer un nouveau personnage");
		System.out.println("2. Combattre une créature");
		System.out.println("3. Afficher votre score");
		System.out.println("4. Quitter");
		
		return choix = scanner.next();
	}
	
	public static void combattre(Personnage personnage) {
		Creature creature = new Creature();
		System.out.println("\nVotre adversaire est un : "+creature.getNom());
		System.out.println("Force : "+creature.getForce() + "\nPoint de vie : "+creature.getPointDeVie());
		
		boolean finCombat = false;
		int i =1;
		int nvScore =0;
		while(!finCombat) {
			System.out.println("\n  -->    TOUR : "+ i++);
			int attaquePersonnage = personnage.attaque();
			int attaqueCreature = creature.attaque();
			System.out.println("Votre attaque est de : "+attaquePersonnage+"\nL'attaque de votre adversaire est de : "+attaqueCreature);
			
			int degat = attaquePersonnage-attaqueCreature;
			if(degat==0) {
				System.out.println("Pas vaiqueur pour ce tour");
				pressAnyKeyToContinue();
				continue;
			}
			else if(degat<0) {
				personnage.setPointDeVie(personnage.getPointDeVie()-(-degat));
				if(personnage.getPointDeVie() < 0) {
					personnage.setPointDeVie(0);
				}
				System.out.println("\nVotre adversaire remporte le tour et vous inflige "+degat+" points de dégat");
				System.out.println("Il vous reste " + personnage.getPointDeVie()+" points de vie");
			}
			else {
				creature.setPointDeVie(creature.getPointDeVie()-degat);
				if(creature.getPointDeVie() < 0) {
					creature.setPointDeVie(0);
				}
				System.out.println("\nVous remportez le tour et infligez "+degat+" point de dégat à votre adversaire");
				System.out.println("Il lui reste "+creature.getPointDeVie()+" point de vie");
			}
			
			if (personnage.getPointDeVie()<=0) {
				System.out.println("\nVous avez perdu ! \nVotre score est de : "+personnage.getScore());
				pressAnyKeyToContinue();
				finCombat = true;
			}
			else if(creature.getPointDeVie()<=0) {
				personnage.calculerScore(creature.getNom());
				System.out.println("\nVous avez gagner cette manche ! \nVotre score est de : "+personnage.getScore()+"\n");
				pressAnyKeyToContinue();
				finCombat = true;
			}
			else {
				System.out.println("");
				pressAnyKeyToContinue();
				continue;
			}
		}
	}
	
	private static void pressAnyKeyToContinue()
	 { 
	        System.out.println("Press Enter key to continue...");
	        try
	        {
	            System.in.read();
	        }  
	        catch(Exception e)
	        {}  
	 }
	
}
