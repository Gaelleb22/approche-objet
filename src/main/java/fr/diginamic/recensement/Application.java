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

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Démarrage de l'application de recensement \n");
		
		//boucle while pour parcourir le menu
		boolean quitter = false;
		while (!quitter) {
			List<Ville> liste = ListeRecensement.listeRecensement();
			Menu.afficherMenu();

			String option = scanner.next();
		
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
