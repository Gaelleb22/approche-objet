package fr.diginamic.banque.entites;


/**Classe exécutable
 * @author formation
 *
 */
public class TestBanque {

	public static void main(String[] args) {
		
		//Tableau de compte avec 2 instances
		Compte[] comptes = new Compte[2];
		comptes[0] = new Compte("cpt56487", 15.60);
		comptes[1] = new CompteTaux("cpt56489", 121.75, 1.2);
		
		//Affichage du tableau
		for (int i=0; i<comptes.length; i++) {
			System.out.println(comptes[i]);
		}

	}

}
