import java.util.Scanner;
class Menu {
	Scanner saisie = new Scanner ( System.in ) ;

	void afficherLosc() {
		System.out.println("_______________________________________________________");
		System.out.println("");
		System.out.println("");
		System.out.println("          ~ ~ ~ ~ Gestion Locative LoSC ~ ~ ~ ~     ");
		System.out.println("");
		System.out.println("");
	}

	void menuPrincipale() {
		System.out.println("_____________________MENU PRINCIPAL____________________");
		System.out.println("");
		System.out.println("~ 1 ~ Gestion des locataires");
		System.out.println("~ 2 ~ Gestion des biens");
		System.out.println("~ 3 ~ Gestion des types de biens");
		System.out.println("~ 4 ~ Gestions des locations");
		System.out.println("~ 5 ~ Sauvegarde/Restauration des données dans des fichiers");
		System.out.println("~ 6 ~ Quitter le programme");
		System.out.println("");
		System.out.println("Saisir une option entre 1 et 6 :");

		switch ( saisie.nextInt()){
			case 1:
				menuLocataires();
				break;
			case 2:
				menuBiens();
				break;
			case 3:	
				menuTypesDeBiens();
				break;
			case 4:
				menuLocations();
				break;
			case 5:
				menuSauvegarde();
				break;
			case 6:
				quitter();
				break;
		}
	}
	void menuLocataires (){
		System.out.println("_________________GESTION DES LOCATAIRES_______________");
		System.out.println("");
		System.out.println("~ 1 ~ Ajouter, modifier ou supprimer un locataire");
		System.out.println("~ 2 ~ Afficher la liste des locataires par ordre alphabétique");
		System.out.println("~ 3 ~ Afficger la liste des locataires ayant joué un type de bien particulier");
		System.out.println("~ 4 ~ Rechercher la listes des locations d'un locataire particulier");
		System.out.println("~ 0 ~ Retour au menu principal");
		System.out.println("");
		System.out.println("Saisir une option entre 0 et 4 :");
		System.out.println(""); 
		switch ( saisie.nextInt()){
		/*	case 1:
				Locataires();
				break;
		/*	case 2:
				menuBiens();
				break;
			case 3:	
				menuTypesDeBiens();
				break;
			case 4:
				menuLocations();
				break;*/
			case 0:
				menuPrincipale(); 
		}
	}
	void menuBiens() {
		System.out.println("___________________GESTION DES BIENS__________________");
		System.out.println("");
		System.out.println("~ 1 ~ Ajouter, modifier ou supprimer un bien");
		System.out.println("~ 2 ~ Afficher la liste des biens par ordre alphabétique");
		System.out.println("~ 3 ~ Afficher la liste des biens d'un type particulier avec le nom du locataire s'il y a lieu");
		System.out.println("~ 0 ~ Retour au menu principale");
		System.out.println("");
	/*	switch ( saisie.nextInt()){
			case 1:
				ajouterUnBien();
				break;
			case 2:
				afficherDesBiensAlpha();
				break;
			case 3:
				afficherDesBiensNom();
				break;
			case 0:
				afficherDesBiensNom();
				break;
		}*/
	}	
	void menuTypesDeBiens() {
		System.out.println("________________GESTION DES TYPES DE BIENS_____________");
		System.out.println("");
		System.out.println("~ 1 ~ Ajouter, modifier ou supprimer un type de bien");
		System.out.println("~ 2 ~ Afficher la liste des types de biens");
		System.out.println("~ 0 ~ Revenir au menu principal");
		System.out.println("");
		/*	switch ( saisie.nextInt()){
			case 1:
				ajouterUnBien();
				break;
			case 2:
				afficherDesBiensAlpha();
				break;
			case 0:
				afficherDesBiensNom();
				break;*/
	}

	void menuLocations() {
		System.out.println("__________________GESTION DES LOCATIONS_______________");
		System.out.println("");
		System.out.println("~ 1 ~ Louer un bien");
		System.out.println("~ 2 ~ Libérer un bien");
		System.out.println("~ 3 ~ Afficher la liste des biens loués");
		System.out.println("~ 4 ~ Afficher la liste des locataires de biens");
		System.out.println("~ 5 ~ Afficher la liste des locataires ayant au moins un bien en cours de location");
		System.out.println("~ 0 ~ Revenir au menu principal");
		/*	switch ( saisie.nextInt()){
			case 1:
				menuLocataires();
				break;
			case 2:
				menuBiens();
				break;
			case 3:	
				menuTypesDeBiens();
				break;
			case 4:
				menuLocations();
				break;
			case 5:
				menuSauvegarde();
				break;
			case 0:
				quitter();
				break;*/
	}
	void menuSauvegarde() {
		System.out.println("________________SAUVEGARDE/RESTAURATION DES DONNEES______________");
		System.out.println("");
		System.out.println("~ 1 ~ Sauvegarde des données dans un ou plusieurs fichiers binaires");
		System.out.println("~ 2 ~ Restauration des données dans les structures choisies à partir des fichiers de sauvegarde");
		System.out.println("");
		/*	switch ( saisie.nextInt()){
			case 1:
				menuLocataires();
				break;
			case 2:
				menuBiens();
				break;*/
	}
	void quitter() {
		System.out.println("________________QUITTER______________");
		System.out.println("");
		System.out.println("~ 1 ~ Quitter le programme");
		System.out.println("");
		/*	switch ( saisie.nextInt()){
				case 1:
					menuLocataires();
					break;*/
	}
}	

class MenuTest {
    public static void main(String args[]) {

    Menu m = new Menu ();

    m.afficherLosc();
    m.menuPrincipale();

	}
}
