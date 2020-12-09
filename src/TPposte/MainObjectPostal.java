package TPposte;
import java.io.IOException;
import java.util.Scanner;

public class MainObjectPostal{
	
	public static void main(String[] args) throws IOException {

	/***********************Constructeurs *******************************************/
		ObjectPostal l1 = new Lettre("Paris", "Montpellier", 34980, 20, 0.001, 1, true);
		//une lettre ordinaire `a destination de la famille Kouk, igloo 2, banquise nord (inventez les valeurs des autres attributs).
		ObjectPostal l2 = new Lettre("UM", "famille Kouk, igloo 2, banquise nord", 33000, 20, 0.001, 1, false);
		//une lettre urgente `a destination du chaman Sbouk, igloo 8, banquise nord (inventez les valeurs des autres attributs)
		ObjectPostal l3 = new Lettre("UM", "chaman Sbouk, igloo 8, banquise nord", 33000, 20, 0.001, 2, true);
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(l3.toString());
		
		//| un colis à destination de la famille Miko, igloo 2, banquise ouest (inventez les valeurs des autres attributs).
		ObjectPostal c1 = new Colis("UM", "famille Miko, igloo 2, banquise ouest", 34000, 200, 0.02, 1,"Téléphone Iphone 12", 1200);
		//| un colis à destination du sculpteur Frodok, hangar 200, terres ouest (inventez les valeurs des autres attributs)
		ObjectPostal c2 = new Colis("UM", "sculpteur Frodok, hangar 200", 34980, 3000, 0.100, 1,"Laptop Dell", 1900);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println("Tarif: "+l1.tarifTotal());
		System.out.println("Tarif: "+c1.tarifTotal());
		
		System.out.println("Tarif remboursement: "+l1.tarifRemboursement());
		System.out.println("Tarif remboursement: "+c1.tarifRemboursement());
		
		/***********************************Ajouter dans un sac*************************/
		SacPostal sac1 = new SacPostal(0.5);
		sac1.addObjectPostal(l1);
		sac1.addObjectPostal(l2);
		sac1.addObjectPostal(l3);
		sac1.addObjectPostal(c1);
		sac1.addObjectPostal(c2);
		
		System.out.println("Volume occupé de sac 1: "+ sac1.volumeOccupe());
		System.out.println("Montant remboursement de sac 1: "+ sac1.remboursement());
		sac1.rangerLesSacs();
	}

}
	
