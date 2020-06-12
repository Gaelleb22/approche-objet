package fr.diginamic.chaines;

public class Client {
	private String nom;
	private String prenom;
	
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nvNom) {
		this.nom = nvNom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String nvPrenom) {
		this.prenom = nvPrenom;
	}

}
