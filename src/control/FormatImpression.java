package control;
import java.util.Scanner;

enum DimensionDoc{A3,A4,A5}

public class FormatImpression {
	private DimensionDoc dim = DimensionDoc.A4;
	private boolean rectoVerso;
	private boolean couverture;
	
	public FormatImpression() {}
	
	public FormatImpression(DimensionDoc dim, boolean rectoVerso, boolean couverture) {
		this.setDim(dim);
		this.setRectoVerso(rectoVerso);
		this.setCouverture(couverture);
	}
//Constructeur	
	public void setDim(DimensionDoc dim) {
		this.dim = dim;
	}
	
	public void setRectoVerso(boolean rectoVerso) {
		this.rectoVerso = rectoVerso;
	}
	
	public void setCouverture(boolean couverture) {
		this.couverture = couverture;
	}
//Accesseur
	public DimensionDoc getDim() {
		return this.dim;
	}
	public boolean getRectoVerso() {
		return this.rectoVerso;
	}
	public boolean getCouverture() {
		return this.couverture;
	}
	
//Les méthodes
	//Méthode toString()
	public String toString() {
		return "Dimension: " + this.dim + " R/V: " + this.rectoVerso + " couverture: " + this.couverture;
	}
	//Scanner 
	public void saisie(Scanner clav) {
		System.out.println("Veuillez entrer la dimension");
		this.setDim(DimensionDoc.valueOf(clav.next()));
		System.out.println("la repro doit-elle être faite en recto-verso? (true/false)");
		this.setRectoVerso(clav.nextBoolean());
		System.out.println("y a-t-il une couverture? (true/false)");
		this.setCouverture(clav.nextBoolean());
		
	}
	
	
	
}
