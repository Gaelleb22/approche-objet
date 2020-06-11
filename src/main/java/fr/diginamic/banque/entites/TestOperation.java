package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		
		Operation[] operation = new Operation[4];
		operation[0] = new Credit("05/12/2019", 1250.0);
		operation[1] = new Debit("06/12/2019", 650.0);
		operation[2] = new Debit("21/12/2019", 299.90);
		operation[3] = new Credit("05/01/2020", 1350.0);
		
		for (int i=0; i<operation.length; i++) {
			System.out.println(operation[i]+ " " + operation[i].afficherType());
		}
		
		double resultat = 0.0;
		for (int i=0; i<operation.length; i++) {
			if(operation[i].afficherType()=="Crédit") {
				resultat += operation[i].getMontant();
			}
			else {
				resultat -= operation[i].getMontant();
			}
		}
		System.out.println("Le total des opérations est de : " + resultat);

	}

}
