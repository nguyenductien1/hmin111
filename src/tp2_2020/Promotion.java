package tp2_2020;

import java.util.*;



public class Promotion
{
  /*-------------- attributs ------------------*/

  private ArrayList<Etudiant> listeEtudiants;
  private int annee;  
  /*-------------- constructeurs ------------------*/

  public Promotion()
  {
    listeEtudiants = new ArrayList<Etudiant>();
    annee = 0;
  }

  public Promotion(int a)
  {
    listeEtudiants = new ArrayList<Etudiant>();
    annee = a;
  }

  
  /*-------------- accesseurs ------------------*/

	public int getAnnee()
	{return annee;}
	
	public void setAnnee(int a)
	{annee=a;}
	
	public Etudiant getEtudiant(int i)
	{	
		if (i >=0 && i < listeEtudiants.size())
			return listeEtudiants.get(i);
		else 
			return null;
	}
	
  /*-------------- méthodes ------------------*/

	public int nbEtudiants()
	{
		return listeEtudiants.size();
	}



  public void inscrit(Etudiant e)
  {
	if (! listeEtudiants.contains(e))
    listeEtudiants.add(e);
  }

  public double moyenneGenerale()
  {
	  if (nbEtudiants()==0)
		  return 0;
	  else
	  {
		  int i; 
		  double sommeGenerale=0;
		  for (i=0; i<nbEtudiants(); i++)
			  sommeGenerale = sommeGenerale + this.getEtudiant(i).moyenne();
		  return (sommeGenerale / nbEtudiants());
	  }
  }

  public void afficheResultats()
  {
    int i; 
    for (i=0; i<listeEtudiants.size(); i++)
      {
    	System.out.println(listeEtudiants.get(i).ligneResultat());
      }
  }
  
  public void afficheResultats2()
  {
   
    for (Etudiant e : this.listeEtudiants)
      {
    	System.out.println(e.ligneResultat());
      }
  }

  public Etudiant recherche(String nom)
  {
    int i=0; boolean trouve = false;
    while ((i<nbEtudiants()) && (trouve != true))
	   {
    	   if (this.getEtudiant(i).getNom().equals(nom)) 
	       trouve = true;
	     else i = i+1;
	   }
    if (trouve == true) return this.getEtudiant(i);
    else return null;
  }
  
  public boolean rechercheBool(String nom)
  {
    int i=0; boolean trouve = false;
    while ((i<nbEtudiants()) && (trouve != true))
	   {
    	   if (this.getEtudiant(i).getNom().equals(nom)) 
	       trouve = true;
    	   else i = i+1;
	   }
  return trouve;
  }

 public Etudiant recherche2(String nom)
  {
    int i; 
    for (i=0; i<nbEtudiants(); i++)
	     if (this.getEtudiant(i).getNom().equals(nom)) 
	    	 return this.getEtudiant(i);
    return null;
  }

  public ArrayList<Etudiant> admis()
  {
    int i; 
    ArrayList<Etudiant> lesAdmis = new ArrayList<Etudiant>();   
    for (i=0; i<nbEtudiants(); i++)
      {
		  if (this.getEtudiant(i).moyenne() >= 10 )
			  lesAdmis.add(this.getEtudiant(i));
      }
    return lesAdmis;
  }
  
  public ArrayList<Etudiant> nouveauxInscritsNonFrancophones()
  {
    int i; 
    ArrayList<Etudiant> lesNINF = new ArrayList<Etudiant>();   
    for (i=0; i<nbEtudiants(); i++)
      {
		  Etudiant etudiantCourant = getEtudiant(i);
		  if (  (etudiantCourant.getInscription().getCodeInscription() == 1 )
				&& (etudiantCourant.getInscription().getCodePays() == 2 ) )
			  lesNINF.add(etudiantCourant);
      }
    return lesNINF;
  }
  
  public void listeNonFrancophone() {
	  ArrayList<Etudiant> NFCP = this.nouveauxInscritsNonFrancophones();
	  int i;
	  for (i=0; i<NFCP.size(); i++) {
		  System.out.println("List etudiant non francophone, primier incription: ");
		  System.out.println(NFCP.get(i).getNom() + " " + NFCP.get(i).getInscription());
		  
	  }
	  
  }

  public  ArrayList<Etudiant> majors()
  // Une methode tres simple avec deux parcours ..........
  {
    int i; 
    ArrayList<Etudiant> listemajors = new ArrayList<Etudiant>();
    double moyenneCourante, meilleureMoyenne = 0;
    
	// On cherche la meilleure moyenne
    for (i=0; i<nbEtudiants(); i++)
	   {
	     moyenneCourante = this.getEtudiant(i).moyenne();
	     if (moyenneCourante > meilleureMoyenne) 
			 meilleureMoyenne = moyenneCourante;
	   }

	// On recupere les etudiants qui ont cette meilleure moyenne 

	for (i=0; i<nbEtudiants(); i++)
	   {
	     if (this.getEtudiant(i).moyenne() == meilleureMoyenne)
			 listemajors.add(this.getEtudiant(i));
	   } 

    return listemajors;
  }
  
  public  ArrayList<Etudiant> majorsVersion2()
  // Une methode en un seul parcours ..........
  {
    int i; 
    ArrayList<Etudiant> listemajors = new ArrayList<Etudiant>();
    double moyenneCourante, meilleureMoyenne = 0;
    
    // A la fin de l'etape i, 
    // -- meilleureMoyenne contient la meilleure moyenne 
    // pour les etudiants examinÃ©s dans les Ã©tapes 0 a i
    // -- listemajors contient les etudiants examinÃ©s dans les Ã©tapes 0 a i
    // qui ont comme moyenne meilleureMoyenne
    for (i=0; i<nbEtudiants(); i++)
	   {
	     moyenneCourante = this.getEtudiant(i).moyenne();
	     if (moyenneCourante > meilleureMoyenne) 
	       {
			   meilleureMoyenne = moyenneCourante;
			   listemajors.removeAll(listemajors);
			   listemajors.add(this.getEtudiant(i));
	       }
		 else if (moyenneCourante == meilleureMoyenne) 
			  listemajors.add(this.getEtudiant(i));
	   }
    return listemajors;
  }	
  
  public  String major()
  // Une methode en un seul parcours .......... moyennes uniques
  {
    int i; 
   Etudiant major = new Etudiant();
    double moyenneCourante, meilleureMoyenne = 0;
    
    // A la fin de l'etape i, 
    // -- meilleureMoyenne contient la meilleure moyenne 
    // pour les etudiants examinï¿½ dans les ï¿½apes 0 a i
    // -- listemajors contient les etudiants examinï¿½ dans les ï¿½apes 0 a i
    // qui ont comme moyenne meilleureMoyenne
    for (i=0; i<nbEtudiants(); i++)
	   {
	     moyenneCourante = this.getEtudiant(i).moyenne();
	     if (moyenneCourante > meilleureMoyenne) 
	       {
			  meilleureMoyenne = moyenneCourante;
			  major = this.getEtudiant(i);
	       }
		
	   }
    return "Le major de la promotion est " + major.getNom();
  }	


    public int[] repartitionMoyenne()
    {
	int[] tab = new int[21];
	for (int i=0; i<nbEtudiants(); i++)
	    tab[(int) Math.round(this.getEtudiant(i).moyenne())]++;
	return tab;	
    }
    
    
    //Liste de Moyenne
    public double[] listeDeMoyenne(){
    	
    	int i = 0;
    	double[] listeDeMoyenne = new double[nbEtudiants()];
    	for (i=0; i<nbEtudiants(); i++) {
    		double moyenneCourant = this.getEtudiant(i).moyenne();
    		listeDeMoyenne[i] = moyenneCourant;	
    	}
    	return listeDeMoyenne;
    	
    }
    
    

    public void hisogrammeNew() {
    	System.out.println("Histogramme verticale");
    	String r1011 = "[10-11[";
    	String r1112 = "[11-12[";
    	String r1213 = "[12-13[";
    	String r1314 = "[13-14[";
    	String r1415 = "[14-15[";
    	String r1516 = "[15-16[";
    	String r1617 = "[16-17[";
    	String r1718 = "[17-18[";
    	String r1819 = "[18-19[";
    	String r1920 = "[19-20[";
    	double[] listeDeMoyenne = listeDeMoyenne();
    	for (int i=0; i<listeDeMoyenne.length; i++) {
    		if (listeDeMoyenne[i] >= 10 && listeDeMoyenne[i] < 11 ) {
    			r1011 = r1011 + " *" ;
    		}
    		
    		else if (listeDeMoyenne[i] >= 11 && listeDeMoyenne[i] < 12){
    			r1112 = r1112 + " *";
    		}
    		
    		else if (listeDeMoyenne[i] >= 12 && listeDeMoyenne[i] < 13){
    			r1213 = r1213 + " *";
    		}
    		
    		else if (listeDeMoyenne[i] >= 13 && listeDeMoyenne[i] < 14){
    			r1314 = r1314 + " *";
    		}
    		
    		else if (listeDeMoyenne[i] >= 14 && listeDeMoyenne[i] < 15){
    			r1415 = r1415 + " *";
    		}
    		
    		else if (listeDeMoyenne[i] >= 15 && listeDeMoyenne[i] < 16){
    			r1516 = r1516 + " *";
    		}
    		
    		else if (listeDeMoyenne[i] >= 16 && listeDeMoyenne[i] < 17){
    			r1617 = r1617 + " *";
    		}
    		
    		else if (listeDeMoyenne[i] >= 17 && listeDeMoyenne[i] < 18){
    			r1718 = r1718 + " *";
    		}
    		
    		else if (listeDeMoyenne[i] >= 18 && listeDeMoyenne[i] < 19){
    			r1819 = r1819 + " *";
    		}
    		
    		else if (listeDeMoyenne[i] >= 19 && listeDeMoyenne[i] < 20){
    			r1920 = r1920 + " *";
    		}
    		
    	}
    	System.out.print(r1011+'\n'+r1112+'\n'+r1213+'\n'+r1314+'\n'+r1415+'\n'+r1516+'\n'+r1617+'\n'+r1718+'\n'+r1819+'\n'+r1920+'\n');
    		
    	
    }
    
    public static String formatAsTable(List<List<String>> rows)
    {
        int[] maxLengths = new int[rows.get(0).size()];
        for (List<String> row : rows)
        {
            for (int i = 0; i < row.size(); i++)
            {
                maxLengths[i] = Math.max(maxLengths[i], row.get(i).length());
            }
        }

        StringBuilder formatBuilder = new StringBuilder();
        for (int maxLength : maxLengths)
        {
            formatBuilder.append("%-").append(maxLength + 2).append("s");
        }
        String format = formatBuilder.toString();

        StringBuilder result = new StringBuilder();
        for (List<String> row : rows)
        {
            result.append(String.format(format, row.toArray(new String[0]))).append("\n");
        }
        return result.toString();
    }
    
    public void histogrammeNewHo() {
    	System.out.println("Histogramme horizontale");
    	double[] listeDeMoyenne = listeDeMoyenne();
    	int[] countNote = {0,0,0,0,0,0,0,0,0,0};
    	for (int i=0;i<listeDeMoyenne.length;i++) {
    		
    		if ((int)listeDeMoyenne[i]==10) {
    			countNote[0]=countNote[0]+1;
    		}
    		else if ((int)listeDeMoyenne[i]==11) {
    			countNote[1]=countNote[1]+1;
    		}
    		else if ((int)listeDeMoyenne[i]==12) {
    			countNote[2]=countNote[2]+1;
    		}
    		else if ((int)listeDeMoyenne[i]==13) {
    			countNote[3]=countNote[3]+1;
    		}
    		else if ((int)listeDeMoyenne[i]==14) {
    			countNote[4]=countNote[4]+1;
    		}
    		else if ((int)listeDeMoyenne[i]==15) {
    			countNote[5]=countNote[5]+1;
    		}
    		else if ((int)listeDeMoyenne[i]==16) {
    			countNote[6]=countNote[6]+1;
    		}
    		else if ((int)listeDeMoyenne[i]==17) {
    			countNote[7]=countNote[7]+1;
    		}
    		else if ((int)listeDeMoyenne[i]==18) {
    			countNote[8]=countNote[8]+1;
    		}
    		else if ((int)listeDeMoyenne[i]==19) {
    			countNote[9]=countNote[9]+1;
    		}
    	}
    	int maxCount = 0;
    	for (int i=0; i<countNote.length; i++) {
    		if (countNote[i]>maxCount) {
    			maxCount=countNote[i];
    		}
    	}
    	
    	
    	List<List<String>> rows = new ArrayList<>();
    	List<String> headers = Arrays.asList("[10-11[", "[11-12[", "[12-13[", "[13-14[", "[14-15[", "[15-16[", "[16-17[", "[17-18[", "[18-19[", "[19-20[");
    	rows.add(headers);
    	
    		
    	int countLine = 0;
    	for (int i = 1; i <= maxCount; i++ ) {
    		countLine = i;
    		if (countLine<=2) {
    			String[] array= new String[10];
	    		for (int j = 0; j < countNote.length;j++) {
	    			if (countNote[j]>0) {
	    				array[j]="*";
	    				countNote[j]=countNote[j]-1;	
	    			}
	    			else if (countNote[j]<=0) {
	    				array[j]="";
	    			}	
	    			
	    		}
	    		
	    		rows.add(Arrays.asList(array));
	    	}
    	}  	
    	
    	System.out.println(formatAsTable(rows));
    }
    

    public ArrayList<Integer> moyennesPlusFrequentes()
    {
    	ArrayList<Integer> mpf=new ArrayList<Integer>();
    	int[] repartitionMoy=repartitionMoyenne();
    	int freqMax=0;
    	for (int i=0; i<repartitionMoy.length; i++)
	    if (freqMax<repartitionMoy[i])
		{mpf.removeAll(mpf);
                freqMax=repartitionMoy[i];
                mpf.add(i);}
	    else if (freqMax==repartitionMoy[i])
			{mpf.add(i);}
	return mpf;
    }

    public int nbMoyenne(int m)
    {return repartitionMoyenne()[m];}


    public void afficheEtudiants() {
    	if(listeEtudiants.isEmpty()) 
    		//return "La promotion ne contient pas d'étudiants";
    		System.out.println("La promotion ne contient pas d'étudiants");
    	
    	else { 
    			System.out.println("List d'étudiants de la promotion " + this.annee + " : ");
    			int i; 
    			for (i=0; i<listeEtudiants.size(); i++)
    			{
    				System.out.println(listeEtudiants.get(i).ligneResultat());
    			}
    		//return ""+listeEtudiants;
    			}
   }
    
    
    
}
