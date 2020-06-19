package fr.diginamic.testexceptions;

import fr.diginamic.sets.Pays;

public class TestReflectionUtils {

	public static void main(String[] args) {
		try {
			Pays pays = new Pays("USA", 332_639_000, 59_495);
			pays = null;
			ReflectionUtils.afficherAttributs(pays);
		}
		catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		}
		catch(ReflexionException e) {
			System.out.println(e.getMessage());
		}

	}

}
