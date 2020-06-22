package fr.diginamic.operations;

/**Classe permettant de calculer une moyenne
 * @author formation
 *
 */
public class CalculMoyenne {
	/** tableau de double */
	private double[] array= new double[0];

	/** Constructeur
	 * 
	 */
	public CalculMoyenne() {
	}

	/**Ajouter un double au tableau
	 * @param a
	 * @return array
	 */
	public double[] ajout(double a) {
		double[] temp = new double[array.length+1];
		for (int i=0; i<array.length; i++) {
			temp[i] =array[i];
		}
		temp[temp.length-1] = a;
		array = temp;
		return array;
	}
	
	/**Calcul la moyenne des éléments du tableau
	 * @return moyenne
	 */
	public double calcul() {
		double somme = 0;
		for(int i=0; i<array.length; i++) {
			somme += array[i];
		}
		return somme/array.length;
	}

	/** Getter
	 * @return the array
	 */
	public double[] getArray() {
		return array;
	}

	/** Setter
	 * @param array the array to set
	 */
	public void setArray(double[] array) {
		this.array = array;
	}

}
