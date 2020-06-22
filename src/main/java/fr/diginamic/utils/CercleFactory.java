package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

/**Classe objet permettant la creation d'un cercle à partir de la classe Cercle du package fr.diginamic.entites.Cercle
 * @author formation
 *
 */
public class CercleFactory {
	
	/**Méthode static pour créer un cercle
	 * @param rayon
	 * @return Cercle
	 */
	public static Cercle creationCercle(double rayon) {
		Cercle cercle = new Cercle(rayon);
		return cercle;
	}

}
