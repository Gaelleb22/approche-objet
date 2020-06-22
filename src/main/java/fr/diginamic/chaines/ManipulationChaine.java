package fr.diginamic.chaines;

import fr.diginamic.banque.entites.Client;
import fr.diginamic.banque.entites.Compte;

/**Classe exécutable
 * @author formation
 *
 */
public class ManipulationChaine {

	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;012543;1 523.5";
		
		//Affichage du 1er caractère de la chaine
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère : "+premierCaractere);
		
		//Affichage de la taille de la chaine
		int longueur = chaine.length();
		System.out.println("Longeur : "+longueur);
		
		//Affichage de l'index du premier";"
		int index1 = chaine.indexOf(";");
		System.out.println("Index du premier \";\" :"+index1);
		
		//Affichage du nom en majuscule et minuscule
		String nom = chaine.substring(0, index1);
		System.out.println("Nom : "+nom.toUpperCase());
		System.out.println("Nom : "+nom.toLowerCase());
		
		//Découpage de la chaine et affichage du tableau résultant
		String[] chaineSplit = new String[4];
		chaineSplit = chaine.split(";");
		for(int i=0; i<chaineSplit.length; i++) {
			System.out.println(chaineSplit[i]);
		}
		
		//Création d'une instance Client et Compte à partir des informations
		chaineSplit[3] = chaineSplit[3].replace(" ", "");
		Client client1 = new Client(chaineSplit[0], chaineSplit[1]);
		Compte compteClient1 = new Compte(chaineSplit[2], Double.parseDouble(chaineSplit[3]));
		System.out.println(client1.getNom());
		System.out.println(client1.getPrenom());
		System.out.println(compteClient1.getNumeroCompte());
		System.out.println(compteClient1.getSolde());

	}

}
