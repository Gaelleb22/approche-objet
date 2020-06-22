package fr.diginamic.jdr;

/**Classe avec méthodes permettant le déroulement d'un combat
 * @author formation
 *
 */
public class OptionCombat {
	
	/**méthode pour le déroulement d'un combat entre le joueur et une créature
	 * @param personnage
	 */
	public static void combattre(Personnage personnage) {
		Creature creature = new Creature();
		System.out.println("\nUne nouvelle créature entre en jeu :");
		System.out.println("Espèce : " +creature.getNom()+ "\nForce : "+creature.getForce() + "\nPoint de vie : "+creature.getPointDeVie());
		
		System.out.println("\n"+personnage.getNom().toUpperCase()+" VS "+creature.getNom().toUpperCase());
		
		boolean finCombat = false;
		int i =1;
		while(!finCombat) {
			System.out.println("\n  -->    TOUR : "+ i++);
			int attaquePersonnage = personnage.attaque();
			int attaqueCreature = creature.attaque();
			System.out.println("L'attaque de "+ personnage.getNom() +" est de : "+attaquePersonnage+"\nLe "+creature.getNom()+" riposte avec une attaque de : "+attaqueCreature);
			
			int degat = attaquePersonnage-attaqueCreature;

			determinerVainqueurDuTour(degat, personnage, creature);
			finCombat = determinerVainqueurCombat(personnage, creature, finCombat);
		}
	}
	
	/**Méthode pour déterminer le vainqueur d'un combat
	 * @param personnage
	 * @param creature
	 * @param finCombat
	 * @return score du personnage
	 */
	private static boolean determinerVainqueurCombat(Personnage personnage, Creature creature, boolean finCombat) {
		if (personnage.getPointDeVie()<=0) {
			System.out.println("\n"+ personnage.getNom()+" a perdu ! \nVotre score est de : "+personnage.getScore());
				appuyerSurEntrerPourContinue();;
				finCombat = true;
			}
			else if(creature.getPointDeVie()<=0) {
			personnage.calculerScore(creature.getNom());
				System.out.println("\n"+ personnage.getNom()+" a gagner cette manche ! \nVotre score est de : "+personnage.getScore()+"\n");
				appuyerSurEntrerPourContinue();;
				finCombat = true;
			}
			else {
				System.out.println("");
				appuyerSurEntrerPourContinue();
				finCombat = false;
			}
		return finCombat;
	}
	
	/**méthode pour déterminer un vainqueur après une attaque
	 * @param degat
	 * @param personnage
	 * @param creature
	 */
	private static void determinerVainqueurDuTour(int degat, Personnage personnage, Creature creature) {
		if(degat==0) {
			System.out.println("Pas vaiqueur pour ce tour");
		}
		else if(degat<0) {
			personnage.setPointDeVie(personnage.getPointDeVie()-(-degat));
			if(personnage.getPointDeVie() < 0) {
				personnage.setPointDeVie(0);
			}
			System.out.println("\nLe "+ creature.getNom() +" remporte le tour et vous inflige "+(-degat)+" points de dégat");
			System.out.println(personnage.getNom()+" a encore " + personnage.getPointDeVie()+" points de vie");
		}
		else {
			creature.setPointDeVie(creature.getPointDeVie()-degat);
			if(creature.getPointDeVie() < 0) {
				creature.setPointDeVie(0);
			}
			System.out.println("\n"+ personnage.getNom() +" remporte le tour et inflige "+degat+" point de dégat");
			System.out.println("Il reste "+creature.getPointDeVie()+" point de vie au "+ creature.getNom());
		}
	}
	
	/**méthode permettant de continuer le combat à la fin d'un tour 
	 * 
	 */
	private static void appuyerSurEntrerPourContinue() { 
	        System.out.println("Appuyer sur ENTRER pour continuer...");
	        try {
	            System.in.read();
	        } catch(Exception e) {}  
	 }

}
