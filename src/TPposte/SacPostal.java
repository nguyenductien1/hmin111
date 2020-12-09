package TPposte;

import java.util.ArrayList;

import control.demandeReprographie;


public class SacPostal {
	private int nombreElements;
	private double capaMaximale;
	private ArrayList<ObjectPostal> listeObjectPostal;
	
	public SacPostal(double capaMaximale) {
		this.setCapaMaximale(capaMaximale);
		listeObjectPostal = new ArrayList<ObjectPostal>();	
	}
	
	public void setCapaMaximale(double capaMaximale) {
		this.capaMaximale = capaMaximale;
	}

	public ObjectPostal getObjectPostal(int i) {
		if (i>=0 && i < listeObjectPostal.size()) {
			return listeObjectPostal.get(i);
		}
		else {return null;}
	}
	
	//M�thodes
	//Ajouter un object dans un sac
	public void addObjectPostal(ObjectPostal oj) {
		if (!listeObjectPostal.contains(oj)) {
			listeObjectPostal.add(oj);
			
		}
	}
	
	//M�thode nbObject()
	public int nbObject() {
		return listeObjectPostal.size();
	}
	
	//M�thode volume occup� dans un sac
	public double volumeOccupe() {
		double sommeVolume = 0;
		if (nbObject()==0) {
			return 0;
		}
		else {
			int i;
			for (i=0; i<nbObject();i++) {
				sommeVolume = sommeVolume + this.getObjectPostal(i).volume;
			}
		}
		return sommeVolume;
	}
	//M�thode remboursement en cas de perd
	public double remboursement() {
		double montantRemboursement = 0;
		if (nbObject()==0) {
			return 0;
		}
		else {
			int i;
			for (i=0; i<nbObject();i++) {
				montantRemboursement = montantRemboursement + this.getObjectPostal(i).tarifRemboursement();
			}
		}
		return montantRemboursement;
	}
	//M�thode d�placer d'un sac d'origine les object m�me code postal vers les nouveaux sac.
	
	public void rangerLesSacs() {
		if (nbObject()==0) {
			System.out.println("Pas d'object");
		}
		else {
			
			int codePostalDebut = listeObjectPostal.get(0).codePostal;
			ArrayList<ObjectPostal> result = new ArrayList<>();
			int i = 0;
			for (i = 1; i<= listeObjectPostal.size(); i++)
			
			{
				if (listeObjectPostal.get(i).codePostal==codePostalDebut) {
				 result.add(listeObjectPostal.get(0));
				 result.add(listeObjectPostal.get(i));
				 listeObjectPostal.remove(listeObjectPostal.get(i));
				 listeObjectPostal.remove(listeObjectPostal.get(0));
				 
				}
				codePostalDebut = listeObjectPostal.get(0).codePostal;
				
				for(ObjectPostal oj : result) {
					System.out.println(oj.toString());
				}
			}
			System.out.println(codePostalDebut);

		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
