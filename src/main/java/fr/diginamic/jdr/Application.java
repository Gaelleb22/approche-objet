package fr.diginamic.jdr;

/**Classe exécutive permettant de jouer au jeu de rôle
 * @author formation
 *
 */
public class Application {

	public static void main(String[] args) {
		
		Personnage personnage = null;	
		boolean quitMenu = false;
		
		while (!quitMenu) {

			String choix = Menu.choixOption();

			switch (choix) {
			case "1": 
				personnage = OptionNouveauPersonnage.CréerNouveauPersonnage(personnage);
			break;
			case "2":
				if (personnage == null) {
					System.out.println("Créer un nouveau personnage \n");
				}
				else if(personnage.getPointDeVie() <= 0) {
					System.out.println(personnage.getNom() + " n'a plus de point de vie , créer un nouveau personnage \n");
				} 
				else {
					OptionCombat.combattre(personnage);
				}
			break;
			case "3":
				if (personnage == null) {
					System.out.println("Créer un nouveau personnage \n");
				} 
				else {
					System.out.println("Le score de " + personnage.getNom() + " est de : " + personnage.getScore() + "\n");
				}
			break;
			case "4":
				System.out.println("Vous avez quitter le jeu !");
				quitMenu = true;
			break;
			default:
				System.out.println("Cette option n'existe pas \n");
			break;
			}

		}
		
	}

}
