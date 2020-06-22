package fr.diginamic.salaire;

/**Classe représentant un salarié
 * Hérite de la classe Intervenant
 * @author formation
 *
 */
public class Salarie extends Intervenant {
	
	/** salaire mensuel */
	private double salaireMensuel;

	/** Constructeur
	 * @param nom
	 * @param prenom
	 * @param salaireMensuel
	 */
	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public double getSalaire() {
		return salaireMensuel;
	}
	
	@Override
	public String toString() {
		return "Salarie";
	}

	/** Getter
	 * @return the salaireMensuel
	 */
	public double getSalaireMensuel() {
		return salaireMensuel;
	}

	/** Setter
	 * @param salaireMensuel the salaireMensuel to set
	 */
	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}
}
