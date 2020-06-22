package fr.diginamic.jdr;

import java.util.Scanner;

/**Classe permettant de créer un nouveau personnage pendant le jeu
 * @author formation
 *
 */
public class OptionNouveauPersonnage {
	
	/**méthode permettant de créer un nouveau personnage
	 * @param personnage
	 * @return personnage
	 */
	public static Personnage CréerNouveauPersonnage(Personnage personnage) {
		Scanner scanner = new Scanner(System.in);
		personnage = new Personnage();
		System.out.println("\nEntrez le nom de votre personnage :\n");
		personnage.setNom(scanner.next());
		
		System.out.println("Vous avez crée un nouveau personnage :");
		System.out.println("Force = "+personnage.getForce());
		System.out.println("Points de vie = "+personnage.getPointDeVie()+"\n");
		
		return personnage;
	}

}
