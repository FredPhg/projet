import java.util.Scanner;
class GestionLocataires {
	Scanner saisie = new Scanner ( System.in ) ;

	int[] vLocId() { // création d'un tableau de 500 cases ( identifiants adhérent)
		int tab[] = new int [500] ;
		return tab;
	}
	int[] vLocNo() { // création d'un tableau de 500 cases ( noms d'adhérents)
		int tab[] = new int [500] ;
		return tab;
	}
	int[] vLocAd() { // création d'un tableau de 500 cases (adresses d'adhérents)
		int tab[] = new int [500] ;
		return tab;
	}
	int[] vLocBi() { // création de 500 tab de 5 id de biens à louer ou louer
		int tab[][] = new int [500][5] ;
		return tab;
	}

	void ajoutModSupLoc() {
		System.out.println("~ a ~ Ajouter un locataire");
		System.out.println("~ b ~ Modifier un locataire");
		System.out.println("~ c ~ Supprimer un locataire");
		System.out.println("");
		System.out.println("Saisir votre choix ( a, b, c )");
		System.out.println("");
		switch ( saisie.nextInt()){
			case 'a':
				ajoutLoc();
				break;
			case 'b':
				modifierLoc();
				break;
			case 'c':	
				SupprimerLoc();
				break;
		}
	}
	void ajoutLoc() {

	}















}