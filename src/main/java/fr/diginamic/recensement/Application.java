/**
 * 
 */
package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

/**Classe exécutable de l'application recensement
 * @author formation
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Démarrage de l'application de recensement \n");
		
		//boucle while pour parcourir le menu
		boolean quitter = false;
		String option;
		while (!quitter) {
			List<Ville> liste = ListeRecensement.listeRecensement();

			// Choisir une option
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

				option = scanner.next();
		//switch :
				switch(option){
				case "1" :
					PopulationDUneVille calcul1 = new PopulationDUneVille();
					calcul1.traiter(liste, scanner);
				break;
				case "2" :
					PopulationDUnDepartement calcul2 = new PopulationDUnDepartement();
					calcul2.traiter(liste, scanner);
				break;
				case "3" :
					PopulationDUneRegion clacul3 = new PopulationDUneRegion();
					clacul3.traiter(liste, scanner);
				break;
				case "4" :
					DixRegionsPlusPeuple calcul4 = new DixRegionsPlusPeuple();
					calcul4.traiter(liste, scanner);
				break;
				case "5" :
					DixDepartementPlusPeuple calcul5 = new DixDepartementPlusPeuple();
					calcul5.traiter(liste, scanner);
				break;
				case "6":
					VillePlusPeupleParDep calcul6 = new VillePlusPeupleParDep();
					calcul6.traiter(liste, scanner);
				break;
				case "7":
					VillePlusPeupleParRegion calcul7 = new VillePlusPeupleParRegion();
					calcul7.traiter(liste, scanner);
				break;
				case "8":
					MethodePlusPeupleDe.DixPlusPeuple(liste);;
				break;
				case "9" : System.out.println("Fin de l'application");
					quitter = true;
				break;
				default : System.out.println("Cette option n'existe pas");
				break;
				}
		}

	}

}
