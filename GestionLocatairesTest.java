import java.util.Scanner;
import java.util.ArrayList;

class GestionLocataires {
	Scanner saisie = new Scanner ( System.in ) ;

	int[] creerVLocId() { // création d'un tableau de 500 cases ( identifiants adhérent)
		int vLocId[] = new int [500] ;
	/*	for ( int i = 0; i < 500 ; i++) {
			vLocId[i] = 0 ;
		}
	*/	return vLocId;
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
			if ( vLocId[i] != 0 ) {
			affichage = affichage + vLocId[i] ;
			System.out.println(affichage) ;
			}
		}

	}
    
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
	
 	void ajoutLoc(vLocNo[]) { // ajouter un Locataire
 		int i = 0;
    	System.out.print("Saisir un numero d'adhérent : ");
    	Scanner id = new Scanner ( System.in ) ;
  		vLocNo[i] = id;
  		i++;		
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
    g.creerVLocId();
//  g.creerVLocNo();
//  g.creerVLocAd();

    System.out.print("_____________TABLEAU______________");
    System.out.println("");
    g.afficherVLocId(tab);


    }
}
