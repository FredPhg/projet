import java.util.Scanner

class sommaire{

	Scanner saisie = new Scanner ( System.in );

	methodesLocataires locataires = new methodesLocataires();
	methodesBiens biens = new methodesBiens();
	methodesTypesDeBien TypesDeBien = new methodesTypesDeBien(); // Création de tous les objets dont on aura besoin dans les différentes méthodes
	methodesLocations locations = new methodesLocations();
	methodesSauvegarde sauvegarde = new methodesSauvegarde();

	void menuPrincipal() {

		System.out.println("_____________________MENU PRINCIPAL____________________"\n);
		System.out.println("~ 1 ~ Gestion des locataires");
		System.out.println("~ 2 ~ Gestion des biens");
		System.out.println("~ 3 ~ Gestion des types de biens");
		System.out.println("~ 4 ~ Gestions des locations");
		System.out.println("~ 5 ~ Sauvegarde/Restauration des données dans des fichiers");
		System.out.println("~ 6 ~ Quitter le programme"\n);
		System.out.println("Veuillez saisir un chiffre entre 1 et 6 :"\n);

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
				System.out.println("________________QUITTER______________"\n); // ici je l'ai mis dans le switch, pour pouvoir annuler au cas ou l'utilisateur choisi de revenir en arrière : si on va directement dans la méthode "quitter", pas de retour en arrière possible à partir du moment où l'utilisateur appui sur 6
				System.out.println("~ 1 ~ Quitter le programme");
				System.out.println("~ 2 ~ Retour"\n)
				if(saisie.nextInt()=1){
					System.exit(0);
				}
				break;
			else :
				System.out.println ("Saisissez un chiffre valide");
				break;
		}
	}


	void menuLocataires (){

		System.out.println("_________________GESTION DES LOCATAIRES_______________"\n);
		System.out.println("~ 1 ~ Ajouter, modifier ou supprimer un locataire");
		System.out.println("~ 2 ~ Afficher la liste des locataires par ordre alphabétique");
		System.out.println("~ 3 ~ Afficger la liste des locataires ayant joué un type de bien particulier");
		System.out.println("~ 4 ~ Rechercher la listes des locations d'un locataire particulier");
		System.out.println("~ 0 ~ Retour au menu principal"\n);

		switch ( saisie.nextInt()){
			case 1:
				System.out.println("_________________GESTION DES LOCATAIRES_______________"\n);
				System.out.println("~ 1 ~ Ajouter un locataire");
				System.out.println("~ 2 ~ Modifier un locataire");
				System.out.println("~ 3 ~ Supprimer un locataire");

				switch (saisie.nextInt()){
					case 1:
						ajouterLocataire();
						break;
					case 2:
						modifierLocataire();
						break;
					case 3:
						supprimerLocataire();
						break;
					else :
						System.out.println("Saisissez un chiffre valide");
						break;
				}
				break;
			case 2:
				listeLocatairesAlphabetique();
				break;
			case 3:	
				listeLocatairesParTypeDeBiens();
				break;
			case 4:
				listeLocationsDUnLocataire();
				break;
			case 0:
				menuPrincipal();
				break;
			else : 
				System.out.println ("Saisissez un chiffre valide");
				break;
	}


	void menuBiens (){
		System.out.println("___________________GESTION DES BIENS__________________"\n);
		System.out.println("~ 1 ~ Ajouter, modifier ou supprimer un bien");
		System.out.println("~ 2 ~ Afficher la liste des biens par ordre alphabétique");
		System.out.println("~ 3 ~ Afficher la liste des biens d'un type particulier avec le nom du locataire s'il y a lieu");
		System.out.println("~ 0 ~ Retour au menu principal"\n);

		switch ( saisie.nextInt()){
			case 1:
				System.out.println("_________________GESTION DES BIENS_______________"\n);
				System.out.println("~ 1 ~ Ajouter un bien");
				System.out.println("~ 2 ~ Modifier un bien");
				System.out.println("~ 3 ~ Supprimer un bien");

				switch (saisie.nextInt()){
					case 1:
						ajouterBien();
						break;
					case 2:
						modifierBien();
						break;
					case 3:
						supprimerBien();
						break;
					else :
						System.out.println("Saisissez un chiffre valide");
						break;
				}
				break;
			case 2:
				listeBiensAlphabetique();
				break;
			case 3:
				listeBiensDUnType();
				break;
			case 0:
				menuPrincipal();
				break;
			else :
				System.out.println("Saisissez un chiffre valide");
				break;
		}
	}	


	void menuTypesDeBiens() {
		System.out.println("________________GESTION DES TYPES DE BIENS_____________"\n);
		System.out.println("~ 1 ~ Ajouter, modifier ou supprimer un type de bien");
		System.out.println("~ 2 ~ Afficher la liste des types de biens");
		System.out.println("~ 0 ~ Revenir au menu principal"\n);

			switch ( saisie.nextInt()){
				case 1:
					System.out.println("_________________GESTION DES TYPES DE BIENS_______________"\n);
					System.out.println("~ 1 ~ Ajouter un type de bien");
					System.out.println("~ 2 ~ Modifier un type de bien");
					System.out.println("~ 3 ~ Supprimer un type de bien");

					switch (saisie.nextInt()){
						case 1:
							ajouterTypeDeBien();
							break;
						case 2:
							modifierTypeDeBien();
							break;
						case 3:
							supprimerTypeDeBien();
							break;
						else :
							System.out.println("Saisissez un chiffre valide");
							break;
					}
					break;
				case 2:
					listeTypeDeBiensAlphabetique();
					break;
				case 0:
					menuPrincipal();
					break;
				else :
					System.out.println("Saisissez un chiffre valide");
					break;
			}
	}

	void menuLocations() {
		System.out.println ("__________________GESTION DES LOCATIONS_______________"\n);
		System.out.println("~ 1 ~ Louer un bien");
		System.out.println("~ 2 ~ Libérer un bien");
		System.out.println("~ 3 ~ Afficher la liste des biens loués");
		System.out.println("~ 4 ~ Afficher la liste des locataires de biens");
		System.out.println("~ 5 ~ Afficher la liste des locataires ayant au moins un bien en cours de location")
		System.out.println("~ 0 ~ Revenir au menu principal"\n);

			switch ( saisie.nextInt()){
				case 1:
					louerBien();
					break;
				case 2:
					libererBien();
					break;
				case 3:	
					listeBiensLoues();
					break;
				case 4:
					listeLocatairesDeBiens();
					break;
				case 5:
					listeLocatairesAuMoinsUnBien();
					break;
				case 0:
					menuPrincipal();
					break;
				else :
					System.out.println("Saisissez un chiffre valide");
					break;
			}		
	}


	void menuSauvegarde() {

		System.out.println("________________SAUVEGARDE/RESTAURATION DES DONNEES______________"\n);
		System.out.println("~ 1 ~ Sauvegarde des données dans un ou plusieurs fichiers binaires");
		System.out.println("~ 2 ~ Restauration des données dans les structures choisies à partir des fichiers de sauvegarde");
		System.out.println("~ 3 ~ Revenir au menu principal"\n);

			switch ( saisie.nextInt()){
				case 1:
					sauvegardeDonnees();
					break;
				case 2:
					restaurationDonnees();
					break;
				case 3:
					menuPrincipal();
					break;
				else :
					System.out.println("Saisissez un chiffre valide");
					break;
			}			
	}
}	