class projet{

	void menuLocataires (){
		System.out.println ("\n________________GESTION DES LOCATAIRES_____________");
		System.out.println ("\n(1) Ajouter, modifier ou supprimer un locataire \n(2) Afficher la liste des locataires par ordre alphabétique\n(3) Afficger la liste des locataires ayant joué un type de bien particulier\n(4) Rechercher la listes des locations d'un locataire particulier\n\n(0) Retour au menu principal\n");
	}

	void menuTypesDeBiens (){
		System.out.println ("\n________________GESTION DES TYPES DE BIENS_____________");
		System.out.println ("\n(1) Ajouter, modifier ou supprimer un type de bien \n(2) Afficher la liste des types de biens\n\n(0) Revenir au menu principal\n");
	}

	void menuLocations (){
		System.out.println ("\n________________GESTION DES LOCATIONS______________");
		System.out.println ("\n(1) Louer un bien \n(2) Libérer un bien\n(3) Afficher la liste des biens loués \n(4) Afficher la liste des locataires de biens \n(5) Afficher la liste des locataires ayant au moins un bien en cours de location \n\n(0) Revenir au menu principal\n\n");
	}
}