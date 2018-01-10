import java.util.Scanner;
import java.util.ArrayList;

public class Locataires {

	Scanner saisie = new Scanner ( System.in );

	int tabLocataires[][] = new int [5][500]; // id, nom, adresse, telephone, idbienloué 
//	int vLocId[] = new int [3]; // création d'un tableau de 500 cases ( identifiants adhérent)
//	String vLocNo[] = new String [500]; // création d'un tableau de 500 cases ( noms d'adhérents)
//	String vLocAd[] = new String [500]; // création d'un tableau de 500 cases (adresses d'adhérents)
//	int vLocBi[] = new int [5]; // création de 500 tab de 5 id de biens à louer ou loué

	int idLocataire;
	int telLocataire;
	String nomLocataire;
	String adresseLocataire;

	public void afficher() {
		System.out.print("ID");
		System.out.println();
		String affichage = " ";
		for ( int i = 0 ; i < vLocId.length ; i++) {
			if ( vLocId[i] != 0 ) {
			affichage = affichage + vLocId[i];
			System.out.println(affichage);
			}
		//	}else{ System.out.println("Le tableau est vide");
		}
	}
    
	public void ajoutModSupLoc() {
		System.out.println("~ a ~ Ajouter un locataire");
		System.out.println("~ b ~ Modifier un locataire");
		System.out.println("~ c ~ Supprimer un locataire");
		System.out.println("~ d ~ Retour au menu précédent");
		System.out.println();
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
	
    public void ajoutLoc() { // ajouter un Locataire
 		System.out.println("Saisir un numéro d'adhérent : ");
 		idLocataire = saisie.nextInt();

 /*		System.out.println("Saisir un nom : ");
 		nomLoc = saisie.next();

 		System.out.println("Saisir une adresse : ");
 		adresLoc = saisie.next();*/

 		for ( int ligne = 0 ; ligne < tabLocataire.length ; ligne++ ) {
 			for ( int colonne = 0 ; colonne < tabLocataire[ligne].length ; colonne++  )
 			if ( tabLocataire[ligne][colonne] == 0 ); // vérifier la case vide
 			tabLocataire[ligne][colonne] = idLocataire;
 			break;
 		//	vLocNo[i] = nomLoc; 
 		//	vLocAd[i] = adresLoc;



 		}

 	
  			
	}
	  

/*	void modifierLoc() {
		// rechercher la valeur à modifier
		System.out.print("Quelle est valeur à modifier ? : ");
 		aModifier = saisie.nextInt();
 		System.out.println();
 		System.out.print("Entrer la nouvelle valeur : ");
 		nouvelleValeur = saisie.nextInt();
 		System.out.println();

 		for ( int i = 0 ; i < vLocId.length ; i++ ) {
 			if ( vLocId[i] == aModifier ); 
 			vLocId[i] = nouvelleValeur;
 		}

	}*/


/*	void supprimerLoc() {
		System.out.println("Supprimer quel ID ?");
    	Scanner id = new Scanner ( System.in ) ;
  	
	}*/

}

class LocatairesTest {
    public static void main(String args[]) {

    Locataires g = new Locataires ();
//   int vLocId[] = new int [500]; // création d'un tableau de 500 cases ( identifiants adhérent)
//  int []tab = g.creerVLocId();

//  g.ajoutLoc();
//  g.creerVLocId();
//  g.creerVLocNo();
//  g.creerVLocAd();

    

    g.ajoutLoc();
//    g.modifierLoc();
    System.out.println();
    System.out.println("_____________TABLEAU______________");
    System.out.println();
    g.afficher();	


    }
}