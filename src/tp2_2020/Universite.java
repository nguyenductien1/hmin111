package tp2_2020;

import java.util.ArrayList;
import java.util.Scanner;

public class Universite {
	
	/* Les attributes */
	private ArrayList<Promotion> listePromotion;
	
	/*Constructeur*/
	
	public Universite() {
		listePromotion = new ArrayList<Promotion>();
	}
	
	/*Accesseurs*/

	
	
	public Promotion getPromotiont(int i)
	{	
		if (i >=0 && i < listePromotion.size())
			return listePromotion.get(i);
		else 
			return null;
	}
	
	/*Les m�thodes*/
	
	//Ajouter une promotion
	
	public void ajouterPromotion(Promotion a) {
		if (!listePromotion.contains(a)) {
			listePromotion.add(a);
			
		}	
	}
	
	//Supprimer toutes les promotions d'une certaine ann�e(passer en param�tre)
	public void supprimerPromotion(int annee) {
		
			for (int j = 0; j < listePromotion.size(); j++) {
				if (annee==listePromotion.get(j).getAnnee()) {
					listePromotion.remove(j);
				}
			}
	}
	
	public void inputAnneForDelete(Scanner clavier) {
		System.out.println("Veuillez entrer ann�e pour supprimer: ");
		int annee = clavier.nextInt();
		supprimerPromotion(annee);
				
	}
	
	//M�thode retourne les informations de toutes les promotions.
	public void afficheUniversite() {
		if (listePromotion.isEmpty()) {
			System.out.println("Il n'y a pas de promotion");
		}
		
		else {
			System.out.println("Liste des promotions de l'universit�: ");
			for (int i=0;i<listePromotion.size(); i++) {
				System.out.println("Promotion "+ listePromotion.get(i).getAnnee() + " " + "Nbr �tudiant: " +  listePromotion.get(i).nbEtudiants()); 
			}
		}
	}
	
	//M�thode retourne les promotions ayant un certain nombre d'�tudiants(param�tre)
	
	public void inputNbrEtudiant(Scanner clavier) {
		System.out.println("Veuillez entrer nombre d'�tudiant: ");
		int nbrEtudiant = clavier.nextInt();
		for (int i = 0; i<listePromotion.size(); i++) {
			if (listePromotion.get(i).nbEtudiants() == nbrEtudiant) {
				System.out.println("Les promotions ayant " + nbrEtudiant + " :");
				System.out.println(listePromotion.get(i).getAnnee());
			}
		}
	}
	
	//M�thode retourne les promotions ayant le plus grand nombre d'�tudiants
	
	public void maxEtudiant() {
		System.out.println("Liste des promotion ayant le plus grande nombre d'�tudiants: ");
		ArrayList<Integer> lesPlusGrand = new ArrayList<Integer>();
		int nbrEtudiantMax = 0;
		int annePromotion = 0;
		
		for (int i = 0; i<listePromotion.size(); i++) {
			if (listePromotion.get(i).nbEtudiants() >= nbrEtudiantMax) {
				nbrEtudiantMax = listePromotion.get(i).nbEtudiants();
				annePromotion   = listePromotion.get(i).getAnnee();
			}
			
		}
		
		for (int i = 0; i<listePromotion.size(); i++) {
			if (listePromotion.get(i).nbEtudiants() == nbrEtudiantMax) {
				lesPlusGrand.add(annePromotion);
			}
			
		} 
		
		for (int i = 0; i < lesPlusGrand.size();i++) {
			System.out.println("Promotion: "+lesPlusGrand.get(i));
		}	
		
	}
	
	

}
