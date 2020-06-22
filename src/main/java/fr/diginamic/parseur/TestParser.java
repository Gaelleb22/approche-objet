package fr.diginamic.parseur;

/**Classe exécutive test du Parseur
 * @author formation
 *
 */
public class TestParser {

	public static void main(String[] args) {
		String chaine ="x/10";
		Expression expr = Parser.parse(chaine);
		double resultat = expr.evaluer("x", 120.3);
		System.out.println(resultat);
	}
}
