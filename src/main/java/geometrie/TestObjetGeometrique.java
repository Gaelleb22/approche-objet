package geometrie;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		ObjetGeometrique[] forme = new ObjetGeometrique[2];
		forme[0] = new Cercle(5.5);
		forme[1] = new Rectangle(6.0, 2.0);
		
		for (int i=0; i<forme.length; i++) {
			System.out.println("périmètre : " +forme[i].perimetre() +", surface : "+ forme[i].surface());
		}

	}

}
