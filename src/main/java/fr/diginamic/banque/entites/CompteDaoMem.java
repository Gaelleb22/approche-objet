package fr.diginamic.banque.entites;

public class CompteDaoMem implements CompteDao{
	
	private Compte[] cpts;

	@Override
	public Compte[] lister() {
		return cpts;
	}

	@Override
	public void sauvegarder(Compte nvCompte) {
		Compte[] temp = new Compte[cpts.length+1];
		for(int i=0; i<cpts.length; i++) {
			temp[i] = cpts[i];
		}
		temp[cpts.length+1] = nvCompte;
		cpts = temp;
	}

	@Override
	public boolean supprimer(String numero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existe(String numero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Compte getCompte(String numero) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
