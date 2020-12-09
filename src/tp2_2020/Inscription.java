package tp2_2020;

public class Inscription {
	//Attributes:
	private int codeInscription;
	private int codePays ;
	//Constructeur:
	public Inscription(int codeInscription, int codePays) {
		this.codeInscription = codeInscription;
		this.codePays = codePays;
	}
	//Accesseurs:
	public int getCodeInscription() {
		return this.codeInscription;
	}

	public void setCodeInscription(int codeInscription) {
		this.codeInscription = codeInscription;
	}
	
	public int getCodePays() {
		return this.codePays;
	}

	public void setCodePays(int codePays) {
		this.codePays = codePays;
	}
	
	//Methodes nationalite()
	public String nationalite() {
		int codePays = this.codePays;
		String nationalite = "";
		if (codePays ==1) {
			nationalite ="français";
		}
		else if (codePays == 2) {
			nationalite = "étranger francophone";
		}
		else if (codePays ==3) {
			nationalite = "étranger non francophone";
		}
		
		return nationalite;
		
	}
	
	//Methodes typeInscription()
	public String typeInscription() {
		int codeInscription = this.codeInscription;
		String typeInscription = "";
		if (codeInscription == 1) {
			typeInscription = "Première inscription";
		}
		else if (codeInscription == 2) {
			typeInscription = "Réinscription";
		}
		
		return typeInscription;
		
	}
	
	//Methodes toString()
	public String toString() {
		return "Nationalité " + nationalite() + " Type d'Inscription: " + typeInscription() ;
	}
}
