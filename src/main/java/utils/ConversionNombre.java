package utils;

/**Classe exécutable test des méthodes static
 * @author formation
 *
 */
public class ConversionNombre {

	public static void main(String[] args) {
		
		//Convertion d'un String en int
		String chaine = "1000";
		int nombre = Integer.parseInt(chaine);
		System.out.println(nombre);
		
		//Calcul du nombre maximum entre a et b
		int a = -6;
		int b = 5;
		int max = Integer.max(a, b);
		System.out.println(max);

	}

}
