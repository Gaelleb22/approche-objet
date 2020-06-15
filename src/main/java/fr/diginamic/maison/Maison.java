package fr.diginamic.maison;

public class Maison {
	private Piece[] pieces;

	public Maison() {
		this.pieces = new Piece[0];
	}
	
	public Piece[] ajouterPiece(Piece nouvellePiece) {
		if(nouvellePiece == null) {
			System.out.println("Veuillez ajouter une pièce");
		}
		else if(nouvellePiece.getSuperficie()<=0 || nouvellePiece.getEtage()<0) {
			System.out.println("Attention, données incohérentes ! La superficie et les étages ne peuvent pas être négatifs.");
		}
		else {
			Piece[] temp = new Piece[pieces.length+1];
			for (int i=0; i<pieces.length; i++) {
				temp[i] = pieces[i];
			}
			temp[temp.length-1] = nouvellePiece;
			pieces = temp;
		}
		return pieces;
	}
	
	public double superficieTotale() {
		double superficie=0;
		for (int i=0; i<pieces.length; i++) {
			superficie += pieces[i].getSuperficie();
		}
		return superficie;
	}
	
	public double superficieEtage(int etage) {
		double superficie=0;
		for (int i=0; i<pieces.length; i++) {
			if(etage == pieces[i].getEtage()) {
				superficie += pieces[i].getSuperficie();
			}
		}
		return superficie;
	}
	
	public String superficiePiece(String nomPiece) {
		double superficie=0;
		String stSuperficie = null;
		if(nomPiece.equalsIgnoreCase("chambre") || nomPiece.equalsIgnoreCase("cuisine") || nomPiece.equalsIgnoreCase("salle de bain") || nomPiece.equalsIgnoreCase("salon") || nomPiece.equalsIgnoreCase("wc")) {
			for(int i=0; i<pieces.length; i++) {
				if(nomPiece.equalsIgnoreCase(pieces[i].toString())) {
					superficie += pieces[i].getSuperficie();
				}
			}
		stSuperficie = String.valueOf(superficie);
		}
		else {
			stSuperficie = "\"Piece inexistante\" ";
		}
		return stSuperficie;
	}
	
	public String nombreDePiece(String nomPiece) {
		int nombreDePiece = 0;
		String nombre = null;
		if(nomPiece.equalsIgnoreCase("chambre") || nomPiece.equalsIgnoreCase("cuisine") || nomPiece.equalsIgnoreCase("salle de bain") || nomPiece.equalsIgnoreCase("salon") || nomPiece.equalsIgnoreCase("wc")) {
			for(int i=0; i<pieces.length; i++) {
				if(nomPiece.equalsIgnoreCase(pieces[i].toString())) {
					nombreDePiece +=1;
				}
			}
		nombre = String.valueOf(nombreDePiece);
		}
		else {
			nombre = "\"Piece inexistante\" ";
		}
		return nombre;
	}

}
