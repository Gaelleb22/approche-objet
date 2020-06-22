package fr.diginamic.jdr;

import java.util.Scanner;

import javax.print.attribute.standard.PresentationDirection;

/**Classe avec méthode static pour afficher le menu du jeu et choisir une option
 * @author formation
 *
 */
public class Menu {
	
	/**Affiche le menu et récupère le choix du joueur
	 * @return
	 */
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
	
	
	
}
