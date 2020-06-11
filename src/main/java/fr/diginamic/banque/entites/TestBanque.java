package fr.diginamic.banque.entites;


public class TestBanque {

	public static void main(String[] args) {
		Compte[] comptes = new Compte[2];
		
		comptes[0] = new Compte("cpt56487", 15.60);
		comptes[1] = new CompteTaux("cpt56489", 121.75, 1.2);
		
		for (int i=0; i<comptes.length; i++) {
			System.out.println(comptes[i]);
		}

	}

}
