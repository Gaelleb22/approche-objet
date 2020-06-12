package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	
	//cf CDD CDI
	private double salaireMensuel;

	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}

	public double getSalaireMensuel() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(double nvSalaireMensuel) {
		this.salaireMensuel = nvSalaireMensuel;
	}

	@Override
	public double getSalaire() {
		return salaireMensuel;
	}
	
	public String toString() {
		return "Salarie";
	}

}
