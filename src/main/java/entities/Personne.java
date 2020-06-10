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
	
	public void AfficherNomPrenom() {
		this.nom = nom.toUpperCase();
		
		System.out.println(nom + " " + prenom);
	}
	
	public void ModifierNom (String nom) {
		this.nom = nom;
	}
	
	public void ModifierPrenom (String prenom) {
		this.prenom = prenom;
	}
	
	public void ModifierAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	
	public String GetNom() {
		return nom;
	}
	
	public String GetPrenom() {
		return prenom;
	}
	public AdressePostale GetAdressePostale() {
		return adresse;
	}

}
