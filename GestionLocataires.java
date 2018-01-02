import java.util.Scanner;
import java.util.ArrayList;

public class GestionLocataires {
	Scanner saisie = new Scanner ( System.in ) ;

	int[] creerVLocId() { // création d'un tableau de 500 cases ( identifiants adhérent)
		int vLocId[] = new int [500] ;
		for ( int i = 0; i < 500 ; i++) {
			vLocId[i] = 0 ;
		}
		return vLocId;
	}
	int[] creerVLocNo() { // création d'un tableau de 500 cases ( noms d'adhérents)
		int vLocNo[] = new int [500] ;
		return vLocNo;
	}
	String[] creerVLocAd() { // création d'un tableau de 500 cases (adresses d'adhérents)
		String vLocAd[] = new String [500] ;
		return vLocAd;
	}
/*	int[][] creerVLocBi() { // création de 500 tab de 5 id de biens à louer ou louer
		int tab[][] = new int [500][5] ;
		return tab[];
	}*/

	void afficherVLocId(int[] vLocId) {
		System.out.print("ID");
		System.out.println() ;
		String affichage = " " ;
		for ( int i = 0 ; i < vLocId.length ; i++) {
			affichage = affichage + vLocId[i] ;
			System.out.println(affichage) ;
		}

	}

/*
    // Creation array list
    public ArrayList<Object> var;

	public ArrayListVar(){  var = new ArrayList<Object>(); 

	}
    public ArrayList<Integer> vLocId ;
    public ArrayListVLocId() { 
    	vLocId = new ArrayList<Integer>();
  
    }

 // ArrayList<String> vLocNo = new ArrayList<String>();
 //  ArrayList<String> vLocAd = new ArrayList<String>();
 // ArrayList<Integer> vLocBi = new ArrayList<Integer>();

*/

    
	void ajoutModSupLoc() {
		System.out.println("~ a ~ Ajouter un locataire");
		System.out.println("~ b ~ Modifier un locataire");
		System.out.println("~ c ~ Supprimer un locataire");
		System.out.println("~ d ~ Retour au menu précédent");
		System.out.println("");
		System.out.println("Saisir votre choix entre a et d");
		System.out.println("");
		switch ( saisie.nextInt()){
		/*	case 'a':
				ajoutLoc();
				break;
			case 'b':
				modifierLoc();s
				break;
			case 'c':	
				SupprimerLoc();
				break;
			case 'd':	
				MenuTest.menuPrincipale();
				break;*/
		}
	}

/*	int ajoutLoc() { // ajouter un ID
    	System.out.println("Ajouter un ID");
    	Scanner id = new Scanner ( System.in ) ;
  		vLocId.add(id.nextInt());
  		return ajoutLoc;
	}
	  


/*	void modifierLoc() {


	}*/

/*	void supprimerLoc() {
		System.out.println("Supprimer quel ID ?");
    	Scanner id = new Scanner ( System.in ) ;
  		vLocId.remove(id.nextInt());

	}*/

}

class GestionLocatairesTest {
    public static void main(String args[]) {

 //   ArrayList<Integer> tab = new Arraylist<Integer>() ;

    GestionLocataires g = new GestionLocataires ();
    int []tab = g.creerVLocId();

//  g.ajoutLoc();
    g.creerVLocId(tab);
    g.creerVLocNo();
    g.creerVLocAd();

    System.out.print("_____________TABLEAU______________");
    g.afficherVLocId(tab);


    }
}
