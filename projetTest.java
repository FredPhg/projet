class projetTest{

	public static void main (String args []){

		String [][] tabLocataires = new String [5] [500];
		String [][] tabBien = new String [4] [100];					// création et déclaration des trois tableaux à plusieurs dimensions pour la gestion des locataires, biens, et types de biens. 
		String [][] tabType = new String [2][20];					// je pense qu'on peux le faire avec des tableaux à plusieurs dimensions, c'est plus rapide qu'avec plusieurs à une seule dimension

		int compteurLocataire = 0;
		int compteurBien = 0;										// création de trois compteur pour les identifiants
		int compteurType = 0;

		sommaire monSommaire = new sommaire ();						// création de l'objet sommaire (tu dois créer un objet à chaque fois que t'appelle une méthode dans une autre classe)

		System.out.println (monSommaire.menuPrincipal());			// appel de la fonction menuPrincipal de la classe sommaire, qui contient toutes les autres fonctions. 

	}
}