package control;

import java.util.ArrayList;

public class CommandeRepro {
	private String nomService = "non renseign�";
	private ArrayList<DemandeReprographie> listeDemandes = new ArrayList<>();
	
	//Constructeur 
	public CommandeRepro(String ns) {
		this.setNomService(ns);
	}
	public void setNomService(String ns) {
		this.nomService = ns;
	}
	public String getNomService() {
		return this.nomService;
	}
	
	//M�thode ajoute
	public void ajoute(DemandeReprographie dr) {
		if (this.listeDemandes.contains(dr)) {
			System.out.println("la demande est d�j� dans la commande");
		}
		else if(this.listeDemandes.size()==10) {
			System.out.println("la commande contient d�j� 10 demandes");
		}
		else {
			this.listeDemandes.add(dr);
		}
	}
	
	//M�thode calculer prix un commande
	public double prix() {
		double result = 0;
		for (DemandeReprographie dr: this.listeDemandes) {
			result += dr.prix();
		}
		if (result>=100) {
			result = result*0.9;	
		}
		return result;
	}
	
	//M�thode sp�cial
	public boolean formatSpecial() {
		for (DemandeReprographie dr:this.listeDemandes) {
			if(dr.getFormat().getDim()!=DimensionDoc.A4) {
				return true;
			}
		}
		return false;
	}
	
	//M�thode demandeDe(String nomDemandeur)
	public ArrayList<DemandeReprographie> demandeDe(String nomDemandeur){
		ArrayList<DemandeReprographie> result = new ArrayList<>();
		for (DemandeReprographie dr:listeDemandes) {
			if(dr.getNomDemandeur()==nomDemandeur) {
				result.add(dr);
			}
			
		}
		return result;
	}
	
	
	
	
	

}
