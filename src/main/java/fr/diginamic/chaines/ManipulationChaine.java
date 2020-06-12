package fr.diginamic.chaines;

import fr.diginamic.banque.entites.Compte;

public class ManipulationChaine {

	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;012543;1 523.5";
		
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère : "+premierCaractere);
		int longueur = chaine.length();
		System.out.println("Longeur : "+longueur);
		int index1 = chaine.indexOf(";");
		System.out.println("Index du premier \";\" :"+index1);
		String nom = chaine.substring(0, index1);
		System.out.println("Nom : "+nom.toUpperCase());
		System.out.println("Nom : "+nom.toLowerCase());
		
		String[] chaineSplit = new String[4];
		chaineSplit = chaine.split(";");
		for(int i=0; i<chaineSplit.length; i++) {
			System.out.println(chaineSplit[i]);
		}
		chaineSplit[3] = chaineSplit[3].replace(" ", "");
		Client client1 = new Client(chaineSplit[0], chaineSplit[1]);
		Compte compteClient1 = new Compte(chaineSplit[2], Double.parseDouble(chaineSplit[3]));
		System.out.println(client1.getNom());
		System.out.println(client1.getPrenom());
		System.out.println(compteClient1.getNumeroCompte());
		System.out.println(compteClient1.getSolde());

	}

}
