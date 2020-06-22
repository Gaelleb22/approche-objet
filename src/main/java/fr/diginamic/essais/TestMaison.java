package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

/**Classe exécutive test création d'une maison
 * @author formation
 *
 */
public class TestMaison {

	public static void main(String[] args) {
		
		//Création d'une maison
		Maison maison = new Maison();
		maison.ajouterPiece(new WC(2.0, 0));
		maison.ajouterPiece(new WC(2.0, 1));
		maison.ajouterPiece(new SalleDeBain(5.0, 1));
		maison.ajouterPiece(new Salon(25.0, 0));
		maison.ajouterPiece(new Cuisine(5.0, 0));
		maison.ajouterPiece(new Chambre(10.0, 1));
		maison.ajouterPiece(new Chambre(10.0, 1));
		
		//test de données incohérentes
		maison.ajouterPiece(null);
		maison.ajouterPiece(new Chambre(10.0, -1));
		maison.ajouterPiece(new Chambre(-10.0, 1));
		
		//test des méthodes de calcul de superficies
		System.out.println(maison.superficieTotale());
		System.out.println(maison.superficieEtage(0));
		System.out.println(maison.superficieEtage(1));
		
		//test avec majuscules et minuscule
		System.out.println("Cuisine = " + maison.superficiePiece("cuisine") + "m², nombre de cuisine = "+maison.nombreDePiece("cuIsIne"));
		System.out.println("Salon = " + maison.superficiePiece("SALON") + "m², nombre de salon = "+maison.nombreDePiece("SALON"));
		System.out.println("Salle de bain = " + maison.superficiePiece("salle de bain") + "m², nombre de salle de bain = "+maison.nombreDePiece("salle de bain"));
		System.out.println("WC = " + maison.superficiePiece("wc") + "m², nombre de WC = "+maison.nombreDePiece("wc"));
		
		//test avec orthographe incorrect
		System.out.println("Chambre = "+maison.superficiePiece("Chame") + "m², nombre de chambre = "+maison.nombreDePiece("cham"));

	}

}
