package control;
import java.util.Scanner;
public class MainReprographie {

	public static void main(String[] args) {
		/*
		//Ecrire l'instruction qui figurerait dans un main pour créer un format d'impression avec les 
		//caractéristiques A4, en recto-verso, avec une couverture
		FormatImpression fi = new FormatImpression(DimensionDoc.A4,true,true);
		
		//Créer un object scanner repésentant le clavier(flux d'entrée du programme)
		// appeler la méthode saisie sur l’objet créé en question 1,
		//afficher les caractéristiques de l’objet par appel de la méthode toString.
		Scanner clav = new Scanner(System.in);
		fi.saisie(clav);
		System.out.println(fi.toString());
		
		//demande DDSI
		DemandeReprographie DDSI = new DemandeReprographie("Direction des systèmes d’information", 4, DimensionDoc.A4, true, true);*/
		
		CommandeRepro com = new CommandeRepro("service info");
		DemandeReprographie dr1 = new DemandeReprographie("Jean", 4, DimensionDoc.A4, true, true);
		DemandeReprographie dr2 = new DemandeReprographie("Alain", 4, DimensionDoc.A3, true, true);
		com.ajoute(dr1);
		com.ajoute(dr2);
		System.out.println("prix: " + com.prix());
		if (com.formatSpecial()) {
			System.out.println("spéciale");
		}
		else {
			System.out.println("ordinaire");
		}
		
		System.out.println(com.demandeDe("Alain"));
		
		
		
	}

}
