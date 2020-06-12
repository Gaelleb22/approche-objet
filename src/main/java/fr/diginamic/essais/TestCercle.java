package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = CercleFactory.creationCercle(6.1);
		Cercle cercle2 = CercleFactory.creationCercle(4.0);
		
		System.out.println("Cercle1 : perimètre = "+cercle1.perimetre()+" surface = "+cercle1.surface());
		System.out.println("Cercle2 : perimètre = "+cercle2.perimetre()+" surface = "+cercle2.surface());

	}

}
