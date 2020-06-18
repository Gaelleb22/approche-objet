package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;

/**Classe permetant de crée une liste avec le tableau de recensement
 * @author formation
 *
 */
public class ListeRecensement {

	/**Méthode pour créer la liste
	 * @return listeVille
	 */
	public static List<Ville> listeRecensement() {
		List<Ville> listeVille = new ArrayList<>();
		try {
			File file = new File("C:/temp/recensement 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");

			String[][] tableau = splitList(lignes);
			
			//Déverser tableau dans liste de Ville
			for(int i=1; i<tableau.length; i++) {
				listeVille.add(new Ville(tableau[i][0], tableau[i][1], tableau[i][2], tableau[i][5], tableau[i][6], tableau[i][9].replace(" ", "").trim()));
			}			
				
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return listeVille;
	}
	
	/**Méthode split pour remplir le tableau
	 * @param liste
	 * @return un tableau de recensement
	 */
	private static String [][] splitList(List<String> liste) {
		String[][] tableauRencensement = new String[35349][10];
		for(int i=0; i<tableauRencensement.length; i++) {
			tableauRencensement[i] = liste.get(i).split(";");
		}
		
		return tableauRencensement;
	}
}