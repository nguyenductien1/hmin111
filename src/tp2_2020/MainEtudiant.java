package tp2_2020;

import java.io.IOException;
import java.util.Scanner;

public class MainEtudiant {
	
	

	public static void main(String[] args) throws IOException {
		
		 
		 /***********************Constructeurs *******************************************/
			
			//Création d'un nouvel étudiant dont le nom est paul
			Etudiant etud1 = new Etudiant("Paul",22, 1, 2, 5, 12, 0);
			Etudiant etud2 = new Etudiant("Jean",23, 1, 3, 12, 12,14);
			Etudiant etud3 = new Etudiant("Abdoulkhader",24,2, 3, 13, 15, 16);
			Etudiant etud4 = new Etudiant("Astrid", 25, 2, 1, 11, 9, 8);
			Etudiant etud5 = new Etudiant("Paolo",26, 1, 2, 12, 14, 15);
			Etudiant etud6 = new Etudiant("Zo�",27, 2, 3, 15, 16, 13);
			Etudiant etud8 = new Etudiant("Pierre",28, 1, 2, 15, 16, 13);
			
			
			//En vous inspirant de l'exemple, écrire ci-dessous le code pour créer les autres étudiants  
			
			
		/***********************************Accesseurs*****************************************/
		
		/* Affichage des informations grâce à l'accesseur get */
		
			//Affichage du nom de etud1
			System.out.println("Le nom de l'Etudiant1 est: " +etud1.getNom() + ", " + "ag� de " + etud1.getAge() + " ans, " + etud1.getInscription());
			
			
			//Ecrire ci-dessous les informations des autres Etudiants (toutes les informations connues par Etudiant)
			System.out.println("Le nom de l'Etudiant2 est " + etud2.getNom() + ", " + "ag� de " + etud2.getAge() + " ans, "  + etud2.getInscription());
			System.out.println("Le nom de l'Etudiant2 est " + etud3.getNom() + ", " + "ag� de " + etud3.getAge() + " ans, "  + etud3.getInscription());
			System.out.println("Le nom de l'Etudiant2 est " + etud4.getNom() + ", " + "ag� de " + etud4.getAge() + " ans, "  + etud4.getInscription());
			System.out.println("Le nom de l'Etudiant2 est " + etud5.getNom() + ", " + "ag� de " + etud5.getAge() + " ans, "  + etud5.getInscription());
			System.out.println("Le nom de l'Etudiant2 est " + etud6.getNom() + ", " + "ag� de " + etud6.getAge() + " ans, "  + etud6.getInscription());
			System.out.println("Le nom de l'Etudiant2 est " + etud8.getNom() + ", " + "ag� de " + etud8.getAge() + " ans, "  + etud8.getInscription());
		
		
			System.out.println("------------------------------FIN DE INFORMATION------------------------------ ");
		/* Modification d'information grâce à l'accesseur set */
		
			// Modification du nom de etud1 
			etud1.setNom("Paul-Henri");
			
			
			// Ecrire ci-dessous le code pour modifier l'Age de Jean
			etud2.setAge(22);
			
			
			//Ecrire ci-dessous le code pour modifier la note de programmation de Zoe
			etud6.setNoteProg(19);
			System.out.println("Note programme de Zo�: "+ etud6.getNoteProg(0));
			
			//Test du set age
			etud2.setAge(142);
			
			System.out.println("------------------------------FIN DE SET ATTRIBUTES------------------------------ ");
			
			// Ecrire ci-dessous le code pour ajouter les notes des autres Etudiants
			
			

		/* Verification que les modifications ont bien été prises en compte */
		
			//Pour chaque étudiant modifié, écrire ci-dessous le code permettant d'afficher les nouvelles informations, grâce à l'accesseur get
		
		
			
		
		
		/*************************** Les méthodes ************************************/
		
		
		/* Utilisation de la m�thode toString  */
			
			//Utilisation de la m�thode toString pour afficher l'étudiant etud1
		
			System.out.println("Informations concernant l'Etudiant 1: " + etud1);
			

			
			//Faire la m�me chose pour tous les �tudiants et v�rifier que les donn�es sont correctes
			System.out.println("Informations concernant l'Etudiant 2: " + etud2);
			System.out.println("Informations concernant l'Etudiant 3: " + etud3);
			System.out.println("Informations concernant l'Etudiant 4: " + etud4);
			System.out.println("Informations concernant l'Etudiant 5: " + etud5);
			System.out.println("Informations concernant l'Etudiant 6: " + etud6);	
			
			System.out.println("------------------------------FIN D'AFFICHAGE DE TOUS LES INFORMATION------------------------------ ");
		
		
		/* Utilisation de la méthode saisie */
		/*
			// Créer un nouvel étudiant etud7 grace au constructeur vide
			Etudiant etud9 = new Etudiant(); 
		
			// Ouvrir le scanner
			Scanner clavier = new Scanner(System.in);
		
			//Utiliser la méthode saisie définie dans la classe Etudiant sur l'étudiant etud7 (vous choisissez les valeurs)
			etud9.saisie(clavier);
		
			//V�rifier grace � la m�thode toString que les informations concernant etud7 ont bien été initialisées
			System.out.println("Informations concernant l'Etudiant 9: " + etud9);
			
		*/
		
		/* Utilisation de la méthode moyenne */
			
			// Calcul et affichage de la moyenne de Paul-Henri. A décommenter pour exemple
			
				System.out.println("la moyenne de Paul-Henri est: " + etud1.moyenne());
				
			
			
			//Ecrire ci dessous le code pour calculer et afficher la moyenne des autres étudiants
			
				System.out.println("la moyenne de Jean est: " + etud2.moyenne());
				System.out.println("la moyenne de Abdoulkhader est: " + etud3.moyenne());
				System.out.println("la moyenne de Astrid est: " + etud4.moyenne());
				System.out.println("la moyenne de Paolo est: " + etud5.moyenne());
				System.out.println("la moyenne de Zo�Age est: " + etud6.moyenne());
				//System.out.println("la moyenne de Tien est: " + etud7.moyenne());
				
				System.out.println("------------------------------FIN DE MOYENNE------------------------------ ");
	
			
		/* Utilisation de la méthode mention pour chaque étudiant. Code à écrire ci-dessous */	
				
				System.out.println("la mention de Paul-Henri est: " + etud1.mention());
				System.out.println("la mention de Jean est: " + etud2.mention());
				System.out.println("la mention de Abdoulkhader est: " + etud3.mention());
				System.out.println("la mention de Astrid est: " + etud4.mention());
				System.out.println("la mention de Paolo est: " + etud5.mention());
				System.out.println("la mention de Zo�Age est: " + etud6.mention());
				//System.out.println("la mention de Tien est: " + etud7.mention());
				System.out.println("------------------------------FIN DE MENTION------------------------------ ");
		
		
		/* Utilisation de la méthode ligneResultat pour chaque étudiant. Code à écrire ci-dessous */
			
				System.out.println("le resultat de Paul-Henri est: " + etud1.ligneResultat());
				System.out.println("le resultat de Jean est: " + etud2.ligneResultat());
				System.out.println("le resultat de Abdoulkhader est: " + etud3.ligneResultat());
				System.out.println("le resultat de Astrid est: " + etud4.ligneResultat());
				System.out.println("le resultat de Paolo est: " + etud5.ligneResultat());
				System.out.println("le resultat de Zo�Age est: " + etud6.ligneResultat());
				//System.out.println("le resultat de Tien est: " + etud7.ligneResultat());
				System.out.println("------------------------------FIN DE RESULTAT------------------------------ ");
				
		/*
		 * 1. Cr�er la promotion 2020
		 * 2. Ajouter nouveaux �tudiants � la liste de cette promotion
		 * 3. Afficher la liste d'�tudiants
		 * 4. Nombre d'�tudiants de cette promotion
		 * 5. Afficher le troisi�me �tudiant inscrit dans la promotion
		 */
		//1
				Promotion P2020 = new Promotion(2020);
		//2		
				P2020.inscrit(etud1);
				P2020.inscrit(etud2);
				P2020.inscrit(etud3);
				P2020.inscrit(etud4);
				
				
				Promotion P2019 = new Promotion(2019);
				P2019.inscrit(etud5);
				P2019.inscrit(etud6);
				P2019.inscrit(etud8);
		//3		
				P2020.afficheEtudiants();
		//4		
				System.out.println("Nombre d'�tudiants: " + P2020.nbEtudiants());
		//5
				System.out.println("Le troisi�me �tudiant est: " + P2020.getEtudiant(2).getNom());
		
		//FIN DE TEST CLASS		
				System.out.println("------------------------------FIN DE TEST CLASSES------------------------------ ");
		/*
		 * 1. Moyenne G�n�rale
		 * 2. Ajouter une condition � la m�thode moyenneG�n�rale() pour v�rifier
		 * vide ou non
		 * 3. Afficher les lignes de r�sultats
		 * 4. Rrechercher �tudiant
		 * 5. Afficher les admis
		 * 6. Major de la promotion
		 * 7. Les marjors de la promotion
		 * 8. Liste non francophone
		 */
		//1		
				System.out.println("Moyenne g�n�ral: " + P2020.moyenneGenerale());
	
		//2
		//3
				P2020.afficheResultats();
		//4
				System.out.println("Trouv�e " + P2020.recherche("concho") );
				
		//5
				System.out.println("Liste admis: " + P2020.admis());
		
		//6
				System.out.println("Major de la promotion: " + P2020.major());
				
		//7
				System.out.println("Les majors de la promotion: " + P2020.majors());
		
		//8
				System.out.println("List non francophone: " + P2020.nouveauxInscritsNonFrancophones());
				P2020.listeNonFrancophone();
				
		/*
		 * histogram des moyennes de la promotion
		 */
				
			P2020.hisogrammeNew();
			P2020.histogrammeNewHo();
			
			
			
			/*
			 * Universit� 
			 */
			System.out.println("Partie Universit�");
			
			Universite Uni1 = new Universite();
			Uni1.ajouterPromotion(P2019);
			Uni1.ajouterPromotion(P2020);
			System.out.println(Uni1);
			
			Uni1.afficheUniversite();
			
			//Scanner clavier = new Scanner(System.in);
			//Uni1.inputNbrEtudiant(clavier);
			Uni1.maxEtudiant();

			
	}

}
