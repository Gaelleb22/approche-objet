package fr.diginamic.recensement;

/**Classe pour afficher le menu de l'application
 * @author formation
 *
 */
public class Menu {
	
	/**méthode static pour afficher le menu
	 * 
	 */
	public static void afficherMenu() {
		System.out.println("Choisissez une option parmis les suivantes :");
		System.out.println("1. Population d'une ville donnée");
		System.out.println("2. Population d'un département donnée");
		System.out.println("3. Population d'une région donnée");
		System.out.println("4. Afficher les 10 régions les plus peuplée");
		System.out.println("5. Afficher les 10 départements les plus peuplés");
		System.out.println("6. Afficher les 10 villes les plus peuplées d'un département");
		System.out.println("7. Afficher les 10 villes les plus peuplées d'une région");
		System.out.println("8.Afficher les 10 villes les plus peuplées de France");
		System.out.println("9. Sortir de l'application");
	}

}
