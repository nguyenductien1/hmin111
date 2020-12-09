package control;

import java.util.ArrayList;

public class CommandeRepro {
	private String nomService = "non renseigné";
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
	
	//Méthode ajoute
	public void ajoute(DemandeReprographie dr) {
		if (this.listeDemandes.contains(dr)) {
			System.out.println("la demande est déjà dans la commande");
		}
		else if(this.listeDemandes.size()==10) {
			System.out.println("la commande contient déjà 10 demandes");
		}
		else {
			this.listeDemandes.add(dr);
		}
	}
	
	//Méthode calculer prix un commande
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
	
	//Méthode spécial
	public boolean formatSpecial() {
		for (DemandeReprographie dr:this.listeDemandes) {
			if(dr.getFormat().getDim()!=DimensionDoc.A4) {
				return true;
			}
		}
		return false;
	}
	
	//Méthode demandeDe(String nomDemandeur)
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
