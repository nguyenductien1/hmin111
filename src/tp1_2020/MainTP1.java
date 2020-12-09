package tp1_2020;

import java.util.Scanner;

public class MainTP1 {


	/********************** Partie méthodes *************************/

		/* méthode réalisant une conversion degrés Celsius vers degrés Farenheit
		 Entrée : un nombre réel tempC passé en paramètre
		 tempC représente une temperature exprimée en degrés Celsius
		 Résultat : un nombre réel résultat de la conversion en degrés Farenheit
		 Méthode : calcul de tempC * 1,8 + 32.  */
	
		public static double celsius2Farenheit(double tempC) {
			return tempC * 1.8 + 32;	
		}
		
		public static double moyenne(double n1, double n2, double n3) {
			return (n1+n2+n3)/3;
		}
		
		public static double moyennePonderee(double n1,double n2,double n3, double c1, double c2, double c3) {
			return (n1*c1 + n2*c2 + n3*c3)/(c1 + c2 + c3);
		}
	
		public static String conjugaisonFutur(String inf) {
			return "Je " + inf+"ai" + "\n" + "Tu " + inf + "as" +"\n" +  "Il/Elle " + inf + "a" + "\n" + "Nous " + inf + "ons" + "\n" + "Vous " + inf + "ez" + "\n" +
					"Ils/Elles " + inf + "ont" + "\n";
			
		}
	
	
			

	/* Ci-dessous écrivez le code des autres méthodes dont la signature vous est donnée */
	
	
		//moyenne(double n1, double n2, double n3) : double
	
	
	
		//moyennePonderee(double n1, double n2, double n3, double c1, double c2, double c3) : double
	
	
	
		//conjugaisonFutur(String inf) : String
	
	
	
	
		
	
	/************************Partie Main ************************/
	
	/* Cette méthode main est la méthode principale
	Le programme commence à s'exécuter à partir de là
	et appelle des sous-programmes */
	
	
	public static void main(String[] args) {

		/* Test de la conversion Celsius vers Farenheit */
		 
		 	System.out.println("**** Test de la conversion Celsius vers Farenheit ****");
		 
		 	// Cas 1 : valeur de température ordinaire en été à Montpellier
		 
		 	System.out.println("En été à Montpellier : 35 degrés celsius valent "+
				 celsius2Farenheit(35)+" en degrés Farenheit");
		
		 	// Cas 2 : sur le même modèle, donner le code permettant de calculer la température d'ébullition de l'eau
		 
			 
		 
		
					 	
		 
		 /* Ci-dessous vous appelerez la méthode moyenne avec les valeurs suivantes :*/
		 	 

		 	 System.out.println("**** Test de la moyenne ****");
				
		 	 // cas 1 : moyenne de 10, 5, 15
		 	 System.out.println("Note moyen cas 1: " + moyenne(10,5,15));
		 	 


		 	// cas 2 : moyenne de 12, 14, 16
		 	System.out.println("Note moyen cas 2: " + moyenne(12,14,16));


		 	 // cas 3 : moyenne de 7, 12, 8
		 	System.out.println("Note moyen cas 3: " + moyenne(7,12,8));

		 	 
		 	 
 
		 /* Ci-dessous vous appelerez la méthode moyennePonderee avec les valeurs suivantes :*/
		 	
		 	 System.out.println("**** Test de la moyenne ponderee ****");
			
		 	 // cas 1 : moyenne de 10, 5, 15 avec 20, 20, 60
		 	 System.out.println("Moyenne cas 1: "+ moyennePonderee(10,5,15,20,20,60));



		 	 // cas 2 : moyenne de 12, 14, 16 avec 20, 20, 60

		 	 System.out.println("Moyenne cas 2: "+ moyennePonderee(12,14,16,20,20,60));

		 	 // cas 3 : moyenne de 12, 14, 16 avec 30, 30, 20

		 	System.out.println("Moyenne cas 3: "+ moyennePonderee(12,14,16,30,30,20));

		 	 // cas 4 : moyenne de 7, 12, 8 avec 20, 20, 60
		 	System.out.println("Moyenne cas 4: "+ moyennePonderee(7,12,8,20,20,60));

		 	 
		/* Ci-dessous vous appelerez la méthode conjugueFuturPremierGroupe avec les valeurs suivantes :*/
		 	System.out.println("**** Test de conjugaisonFutur ****");	
			
			// Cas 1 : chanter
			
		 	System.out.println("Verbe chanter: "+ conjugaisonFutur("chanter"));
		 	
			// Cas 2 : travailler
		 	System.out.println("Verbe travailler: "+ conjugaisonFutur("travailler"));
			

		 	
		
	
	
	
	/************************ Utilisation du scanner pour entrer les valeurs ************************/ 
	 
	 
	/* On crée un Scanner pour tout le programme. Il représente le flux de ce qui est saisi au clavier 
	Instruction à décommenter pour pouvoir l'utiliser */
	
	 Scanner sc = new Scanner(System.in);
	 
	 
	// test de la complétion sémantique à faire ci-dessous
		 	
		 //	sc.nextInt();
		 	
 
	/* Test des précédentes méthodes en demandant à l'utilisateur de saisir une valeur au clavier */
	 
	 // Conversion Celsius2Farenheit (Instructions ci-dessous à décommenter pour exemple)
	 //System.out.println("Veuillez entrer un nombre réel représentant une température en degrés Celsius");
	 
	 //double tempCelsius = sc.nextDouble(); 
	 //System.out.println(tempCelsius+" degr�es celsius valent "+ celsius2Farenheit(tempCelsius)+" en degr�es Farenheit");
	 
	 
	 
	 // Moyenne (Ecrire le code source ci-dessous en vous inspirant de ce qui a été fait pour la conversion de Celsius a Farenheit)
	
	/* 
	System.out.print("entre note 1: ");
	double n1 = sc.nextDouble();
	
	System.out.print("entre note 2: ");
	double n2 = sc.nextDouble();
	
	System.out.print("entre note 3: ");
	double n3 = sc.nextDouble();
	
	System.out.println("Note moyen: " + moyenne(n1,n2,n3)); 
	*/
	
		
	/* Moyenne Ponderee (Ecrire le code source ci-dessous en vous inspirant de ce qui a été fait pour la conversion de Celsius a Farenheit)
	
	 System.out.print("Entre note 1 et coefficient: ");
	 double n1 = sc.nextDouble();
	 double c1 = sc.nextDouble();
	 System.out.print("Entre note 2 et coefficient: ");
	 double n2 = sc.nextDouble();
	 double c2 = sc.nextDouble();
	 System.out.print("Entre note 3 et coefficient: ");
	 double n3 = sc.nextDouble();
	 double c3 = sc.nextDouble();
	 
	 System.out.println("Moyenne Ponderee: "+ moyennePonderee(n1,n2,n3,c1,c2,c3));
	 
	 */
	
	// Conjugaison (Ecrire le code source ci-dessous en vous inspirant de ce qui a été fait pour la conversion de Celsius a Farenheit)
	System.out.print("Entre le verb: ");
	String verb = sc.next();
	System.out.println("Verbe " + verb +": \n"+ conjugaisonFutur(verb));
	
	}
	
	
}	
	
