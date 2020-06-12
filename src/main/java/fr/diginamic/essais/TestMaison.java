package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		Maison maison = new Maison();
		maison.ajouterPiece(new WC(2.0, 0));
		maison.ajouterPiece(new WC(2.0, 1));
		maison.ajouterPiece(new SalleDeBain(5.0, 1));
		maison.ajouterPiece(new Salon(25.0, 0));
		maison.ajouterPiece(new Cuisine(5.0, 0));
		maison.ajouterPiece(new Chambre(10.0, 1));
		maison.ajouterPiece(new Chambre(10.0, 1));
		maison.ajouterPiece(null);
		maison.ajouterPiece(new Chambre(10.0, -1));
		maison.ajouterPiece(new Chambre(-10.0, 1));
		
		System.out.println(maison.superficieTotale());
		System.out.println(maison.superficieEtage(0));
		System.out.println(maison.superficieEtage(1));

	}

}
