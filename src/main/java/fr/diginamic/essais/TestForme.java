package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

/**Classe exécutive
 * @author formation
 *
 */
public class TestForme {

	public static void main(String[] args) {
		//Création d'objet de type Forme
		Cercle cercle1 = new Cercle(1);
		Rectangle rectangle1 = new Rectangle(4, 5);
		Carre carre1 = new Carre(6.5);
		
		//test de la méthode afficher
		AffichageForme.afficher(cercle1);
		AffichageForme.afficher(rectangle1);
		AffichageForme.afficher(carre1);

	}

}
