package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

/**Classe avec méthode static permettant d'afficher un objet de type Forme
 * @author formation
 *
 */
public class AffichageForme {
	
	/**méthode pour afficher un objet de type Forme
	 * @param forme
	 */
	public static void afficher(Forme forme) {
		System.out.println("Périmètre : "+forme.calculerPerimetre()+" Surface : "+forme.calculerSurface());
	}

}
