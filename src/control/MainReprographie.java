package control;
import java.util.Scanner;
public class MainReprographie {

	public static void main(String[] args) {
		/*
		//Ecrire l'instruction qui figurerait dans un main pour cr�er un format d'impression avec les 
		//caract�ristiques A4, en recto-verso, avec une couverture
		FormatImpression fi = new FormatImpression(DimensionDoc.A4,true,true);
		
		//Cr�er un object scanner rep�sentant le clavier(flux d'entr�e du programme)
		// appeler la m�thode saisie sur l�objet cr�� en question 1,
		//afficher les caract�ristiques de l�objet par appel de la m�thode toString.
		Scanner clav = new Scanner(System.in);
		fi.saisie(clav);
		System.out.println(fi.toString());
		
		//demande DDSI
		DemandeReprographie DDSI = new DemandeReprographie("Direction des syst�mes d�information", 4, DimensionDoc.A4, true, true);*/
		
		CommandeRepro com = new CommandeRepro("service info");
		DemandeReprographie dr1 = new DemandeReprographie("Jean", 4, DimensionDoc.A4, true, true);
		DemandeReprographie dr2 = new DemandeReprographie("Alain", 4, DimensionDoc.A3, true, true);
		com.ajoute(dr1);
		com.ajoute(dr2);
		System.out.println("prix: " + com.prix());
		if (com.formatSpecial()) {
			System.out.println("sp�ciale");
		}
		else {
			System.out.println("ordinaire");
		}
		
		System.out.println(com.demandeDe("Alain"));
		
		
		
	}

}
