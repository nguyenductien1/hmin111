package control;
import java.util.Scanner;

public class DemandeReprographie {
	private String nomDemandeur = "inconnu";
	private int nbPages;
	private FormatImpression format = new FormatImpression();
	
	//constructeur
	public DemandeReprographie(String nomDemandeur, int nbPages, DimensionDoc dim, boolean rectoVerso, boolean couverture) {
		this.setNomDemandeur(nomDemandeur);
		this.setNbPages(nbPages);
		format = new FormatImpression(dim, rectoVerso, couverture);
	}
	//Acceseur
	public void setNomDemandeur(String nomDemandeur) {
		this.nomDemandeur = nomDemandeur;
	}
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}
	
	public String getNomDemandeur() {
		return this.nomDemandeur;
	}
	public int getNbPages() {
		return this.nbPages;
	}
	public FormatImpression getFormat() {
		return this.format;
	}
	
	//Les Méthodes
	//Méthode toString()
	public String toString() {
		return "Demandeur : " + this.getNomDemandeur() + " nbPages: " + this.getNbPages() + " format d'impression: " + this.format;
	}
	//Méthode Saisie
	public void saisie(Scanner clav) {
		System.out.println("Veuillez entrer le nom du demandeur");
		this.setNomDemandeur(clav.next());
		System.out.println("Veuillez entrer le nombre de pages: ");
		this.setNbPages(clav.nextInt());
		//this.format = new FormatImpression(); //Si on ne suppose pas le format créé
		this.format.saisie(clav);
	}
	
	//Méthode prix
	public double prix() {
		double prix = 0;
		if(this.format.getDim()==DimensionDoc.A5) {
			prix += this.nbPages*0.1;
		}
		else {
			if(this.format.getDim()==DimensionDoc.A4) {
				prix+=this.nbPages*0.2;
			}
			else {
				if (this.format.getDim()==DimensionDoc.A3) {
					prix+=this.nbPages*0.3;
				}
			}
		}
		
		if(this.format.getRectoVerso()) {
			prix = prix/2;
		}
		if(this.format.getCouverture()) {
			prix = prix+2;
		}
		
		return prix;
			
	}
	

}