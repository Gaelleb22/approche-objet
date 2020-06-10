package entities;

public class Personne {
	
	public String nom;
	public String prenom;
	
	public AdressePostale adresse;

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public void afficherIdentite() {	
		System.out.println(nom.toUpperCase() + " " + prenom);
	}
	
	public void setNom (String nvNom) {
		nom = nvNom;
	}
	
	public void setPrenom (String nvPrenom) {
		prenom = nvPrenom;
	}
	
	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public AdressePostale getAdressePostale() {
		return adresse;
	}

}
