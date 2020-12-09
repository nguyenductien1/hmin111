package tp2_2020;

import java.util.Scanner;

/*********************************TP 2.1***********************************************/

public class Etudiant {

	
	/****************** Partie attributs ****************************************/
	
	//L'attribut nom de l'√©tudiant
	private String nom;
	
	
	
	// Vous devez ins√©rer ci-dessous les autres attributs (l'age et les 3 notes)
	private int age;
	private double noteProg;
	private double noteSyst;
	private double noteStage;
	private Inscription inscription;
	/***************************************************************************/
	
	
	
	/********************Partie Constructeurs ***************************/
	
	//Constructeur par dÈfaut qui ne contient aucun attribut
	public Etudiant(){
		
	}
	
	//Vous devez ci-dessous dÈfinir le constructeur qui initialise tout sauf les notes de l'√©tudiant
	public Etudiant(String nom, int age) {
			this.nom = nom;
			this.age = age;
		}

	
	//Vous devez ci-dessous d√©finir le constructeur qui initialise tout sauf l'age de l'√©tudiant
	public Etudiant(String nom, int age, int codeInsc, int codePays) {
		this.nom = nom;
		this.age = age;
		this.inscription = new Inscription(codeInsc, codePays);
	}
	
	//Vous devez ci-dessous d√©finir le constructeur qui initialise tous les attributs
	public Etudiant(String nom, int age, int codeInsc, int codePays, double noteProg, double noteSyst, double noteStage) {
		this.nom = nom;
		this.inscription = new Inscription(codeInsc, codePays);
		this.age = age;
		this.noteProg = noteProg;
		this.noteSyst = noteSyst;
		this.noteStage = noteStage;
	}
		
	
	/***********************************************************************/
	
	
	/*************************************Partie Accesseurs ***********************/
	
	/* Accesseurs de l'attribut nom : 
		getNom qui retourne la valeur du nom 
		setNom qui initialise la valeur du nom
	 */
	
	public void setInscription(Inscription inscription) {
        this.inscription = inscription;
    }

    public Inscription getInscription() {
        return inscription;
    }
    
    
	public String getNom() {
		return this.nom;
	}
	
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	/* Vous devez ci-dessous cr√©er les accesseurs pour les autres attributs : */
		
	//Accesseurs de l'age
	
	public int getAge() {
		return this.age;
	}
	
	
	public void setAge(int age) {
		
		if (age<0 || age>140) {
			System.out.println("Eurreur de l'age de " + this.nom);
		}
		else {
			this.age = age;
		}
		
	}
	
	//Accesseurs des notes
	public double getNoteProg(double noteProg) {
		return this.noteProg;
	}
	
	
	public void setNoteProg(double noteProg) {
		this.noteProg = noteProg;
	}
	
	public double getNoteSyst(double noteSyst) {
		return this.noteProg;
	}
	
	
	public void setNoteSyst(double noteSyst) {
		this.noteSyst = noteSyst;
	}
	
	public double getNoteStage(double noteStage) {
		return this.noteStage;
	}
	
	
	public void setNoteStage(double noteStage) {
		this.noteStage = noteStage;
	}
	
	
/***********************************************************************************/
	
	
	
/****************************** Partie m√©thodes ***************************************/	
	
	
	/* MÈthode toString() qui permet d'afficher des informations concernant un Ètudiant. 
	MÈthode √† dÈcommenter et √† modifier ci-dessous */
		
	
		public String toString() {
			return "Etudiant " + getNom() + " Age: " + getAge() +"  Note Program " + getNoteProg(noteProg)+" Note System " + getNoteSyst(noteSyst)+ " Note Stage "+getNoteStage(noteStage) ;
		}
	
	
	
	
	/* MÈthode saisie qui permet √† l'utilisateur de saisir les informations des √©tudiants et de les initialiser. 
	 MÈthode ‡† Ècrire intÈgralement en vous inspirant du TP1  */
		

		public void saisie(Scanner clavier) {
			// TODO Auto-generated method stub
			System.out.println("Entrez le nom de l'Ètudiante: ");
			this.nom = clavier.next();
			System.out.println("Entrez l'age de l'etudiante: ");
			this.age = clavier.nextInt();
			System.out.println("Entrez code d'Inscription: ");
			int codeInsc = clavier.nextInt();
			System.out.println("Entrez code de Pays: ");
			int codePays = clavier.nextInt();
			this.inscription = new Inscription(codeInsc, codePays);
			System.out.println("Entrez note programme: ");
			this.noteProg = clavier.nextDouble();
			System.out.println("Entrez note systeme: ");
			this.noteSyst = clavier.nextDouble();
			System.out.println("Entrez note stage: ");
			this.noteStage = clavier.nextDouble();		
			
		}
		
	
	
	/* MÈthode moyenne ‡† dÈcommenter et ‡ remplir */
	
		
		 public double moyenne(){
			double moyenne = (this.noteProg + this.noteSyst +this.noteStage)/3;
		 	return moyenne;
		 }

	
	
	/* M√©thode mention √† √©crire ci-dessous. 
	 Cette m√©thode utilise la m√©thode moyenne d√©finie pr√©c√©demment 
	 et retourne une chaine de caract√®re qui correspond √† la mention de l'√©tudiant dont les valeurs possibles sont :
	 Ajourn√©, passable, AB, Bien, TB */
		 public String mention() {
			 double moyenne = (this.noteProg + this.noteSyst +this.noteStage)/3;
			 String mention = "";
			 if (moyenne <10) {
				 mention="AjournÈ";
			 }
			 else if(moyenne >=10 && moyenne <= 12) {
				 mention = "passable";
			 }
			 else if(moyenne >=10 && moyenne < 12) {
				 mention = "passable";
			 }
			 else if(moyenne >=12 && moyenne < 14) {
				 mention = "Assez-Bien";
			 }
			 else if(moyenne >=14 && moyenne < 18) {
				 mention = "Bien";
			 }
			 else if(moyenne >=18 && moyenne <=20) {
				 mention = "TrËs Bien";
			 }
			return mention;
		 }
	
	
	
	
	/* Methode ligneResultat √† √©crire ci-dessous 
	 * Cette m√©thode utilise le r√©sultat de moyenne et de mention
	 * et retourne une chaine de caract√®re pr√©cisant :
	 * le nom, la moyenne, la mention, et si l'√©tudiant est ajourn√©, la liste des modules obtenus
	 */
		 public boolean modulePasse(double note) {
			 boolean modulePasse= false;
			 
			 if (note >= 10) {
					 modulePasse=true;	 
			 }
					  
			 return modulePasse;
		 }
		 
		 public String ligneResultat() {
			 String resultat="";
			 String mention = mention(); 
			 String modulePasse = "";
			 double[] notes = {this.noteProg,this.noteSyst,this.noteStage};
			 for (int i=0; i<notes.length; i++) {
				 boolean pass = modulePasse(notes[i]);
				 if (pass==true && i ==0) {
					 modulePasse = modulePasse + " Programe ";
				 }
				 if (pass==true && i ==1) {
					 modulePasse = modulePasse + " SystËme ";
				 }
				 if (pass==true && i ==2) {
					 modulePasse = modulePasse + " Stage ";
				 }
				  
			 }
			 
			 if (mention == "AjournÈ") {
				 
				 if (modulePasse =="") {
					 resultat = "Etudiant: " + getNom() + " moyenne: " + " mention: " + mention + " Modules passÈes: NON"; 
				 }
				 else {resultat = "Etudiant: " + getNom() + " moyenne: " + " mention: " + mention + " Modules passÈes"+ modulePasse;
				 }
				 
			 }
			 else {
				 resultat = "Etudiant: " + getNom() + " moyenne: " + " mention: " + mention; 
			 }
			 
			 return resultat;
		 }

		}
	
	


