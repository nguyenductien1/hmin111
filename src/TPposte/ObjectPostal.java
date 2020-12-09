package TPposte;


public abstract class ObjectPostal{
	/*Nous commen¸cons par les attributs, qui sont les suivants :
		- une origine,
		- une destination,
		- un code postal,
		- un poids (en grammes),
		- un volume (en m3),
		- un taux de recommandation (égal à 0, 1 ou 2). */
	String origine, destination;
	int codePostal;
	int poids, tauxRecom;
	double volume;
	
	public ObjectPostal(){};
		
	// Constructeur
	
	public ObjectPostal(String origine, String destination, int codePostal, int poids, double volume, int tauxRecom) {
		this.setCodePostal(codePostal);
		this.setDestination(destination);
		this.setOrigine(origine);
		this.setPoids(poids);
		this.setTauxRecom(tauxRecom);
		this.setVolume(volume);	}
	//Accesseurs
	//Get Object Attribute
	//Set Object Attribut
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public void setTauxRecom(int tauxRecom) {
		this.tauxRecom = tauxRecom;
	}
	
	//Méthodes
	
	//Méthode toString()
	public String toString() {
		return "Origine: " + this.origine + " Destination: " + this.destination + " Code Postal: " + this.codePostal + " Poids: " + this.poids + " Volume: " + this.volume + 
				" Taux Recommandation: " + this.tauxRecom;
	}
	//Méthode tarifBase();
	abstract public double tarifBase();
	
	// Méthode tarifAffranchissement()
	
	abstract public double tarifAffranchissement();
	
	//Méthode tarifTotal()
	public double tarifTotal() {
		return this.tarifBase()+this.tarifAffranchissement();
	}
	
	// Méthode tarifRemboursement()
	abstract public double tarifRemboursement();

}
//Créez une sous-classe Lettre de la classe ObjetPostal.
// Introduisez dans la classe Lettre un attribut pour représenter le fait qu’une lettre peut
//être urgente ou ordinaire.
//Munissez la classe Lettre de tous les accesseurs et constructeurs qui vous semblent pertinents.
//Ecrivez une méthode String toString() qui retourne une chaîne comprenant tous les
//attributs de manièrèa connaître l’état d’un objet.

	class Lettre extends ObjectPostal{
		private boolean urgence;
		//constructeur
		
		public Lettre(String origine, String destination, int codePostal, int poids, double volume, int tauxRecom, boolean urgence) {
			super(origine, destination, codePostal, poids, volume, tauxRecom);
			this.setUrgence(urgence);
		}		
		//Accesseurs
		//Get Object Attribute
		//Set Object Attribut
		public void setUrgence(boolean urgence) {
			this.urgence = urgence;
		}
		
		public String toString() {
			
			if (this.urgence) {
			
			return super.toString() + " Lettre Urgence"; 
			}
			else {
				return super.toString() + " Lettre Ordinaire "; 
			}
				
			
		}
		
		//Méthode tarifBase()
				public double tarifBase() {
					return 0.5;
				}
		
		//Méthode tarif
		public double tarifAffranchissement() {
			double tarif = 0;
			double tarifUrgence = 0.3;
			if (this.tauxRecom == 1) {
				tarif = tarif + 0.5;
			}
			else if (this.tauxRecom==2) {
				tarif = tarif + 1.5;
			}
			
			if (this.urgence) {
				tarif = tarif + tarifUrgence;
			}
		
			return tarif;
		}
		
		//Méthode remboursement
		public double tarifRemboursement() {
			double tarifRemboursement = 0;
			if (this.tauxRecom==0) {
				tarifRemboursement = 0;
			}
			else if (this.tauxRecom==1) {
				tarifRemboursement = 1.5;
			}
			else if (this.tauxRecom==2) {
				tarifRemboursement = 15;
			}
			
			return tarifRemboursement;
		}
	
	}
	
	/*
	Créez une sous-classe Colis de la classe ObjetPostal.
	| Les colis possèdent les caractéristiques complémentaires suivantes que vous représenterez par des attributs : une déclaration de contenu (texte), une valeur déclarée (en euros).
	| Munissez la classe Colis de tous les accesseurs et constructeurs qui vous semblent pertinents en les générant automatiquement avec Eclipse.
	| Ecrivez une méthode String toString() qui retourne une chaîne comprenant tous les attributs de manière `a connaître l’état d’un objet.
	*/
	class Colis extends ObjectPostal{
		private String description;
		private double valeur;
		public Colis(String origine, String destination, int codePostal, int poids, double volume, int tauxRecom, String description, double valeur) {
			
			super(origine, destination, codePostal, poids, volume, tauxRecom);
			this.setDescription(description);
			this.setValeur(valeur);
			
		}
		
		//Accesseurs
		//Get Object Attribute
		//Set Object Attribut
		public void setDescription(String description) {
			this.description = description;
		}
		public void setValeur(double valeur) {
			this.valeur = valeur;
		}
		
		//Méthode toString()
		public String toString() {
			return super.toString()+ this.description + " Valeur: " + this.valeur;
		}
		
		
		//Méthode tarifBase()
		public double tarifBase() {
			return 2;
		}
		//Méthode tarifAffranchissement()
		public double tarifAffranchissement() {
			double tarif=0;
			
			if (this.tauxRecom == 1) {
				tarif = tarif + 0.5;
			}
			else if (this.tauxRecom==2) {
				tarif = tarif + 1.5;
			}
			
			if (this.volume>1/8) {
				tarif = tarif + 3;
			}
			
			return tarif;
		}
		
		//Méthode tarifRemboursement()
		
		public double tarifRemboursement() {
			double tarifRemboursement = 0;
			double valeurColis = this.valeur;
			if (this.tauxRecom==0) {
				tarifRemboursement = valeurColis*0.0;
			}
			else if (this.tauxRecom==1) {
				tarifRemboursement =  valeurColis*10/100;
			}
			else if (this.tauxRecom == 2) {
				tarifRemboursement =  valeurColis*50/100;
			}
			return tarifRemboursement;
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	

