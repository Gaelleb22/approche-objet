package fr.diginamic.formes;

/**Classe abstraite représentant une forme géométrique
 * @author formation
 *
 */
public abstract class Forme {
	
	/**Méthode de calcul d'une surface
	 * @return
	 */
	public abstract double calculerSurface();
	
	/**méthode de calcul d'un pértimètre
	 * @return
	 */
	public abstract double calculerPerimetre();

}
