import java.util.*;

    public class Trier {
       public static void main(String[]args) {
         String[] vLocNo = new String[500]; // Ce tableau est initialisé pour 500 éléments tous null
         // Si on quitte avant qu'il soit plein les derniers éléments seront null
         // Nous allons donc initialiser tous les éléments du tableau avec espace
         int i = 0;
         for (i = 0; i < vLocNo.length; i++)
            vLocNo[i] = " ";
            
        Scanner sc=new Scanner(System.in);
         String saisie = "";
      
         i = 0;
         while(i < vLocNo.length) {
            System.out.println("Entrez un nom (ou 0 pour terminer:)");
            saisie = sc.nextLine();
            System.out.println("");
            if (saisie.equals("0"))
               break;
            else {
               vLocNo[i] = saisie;
               i++;
            }
         }
         
         System.out.println("Vous avez saisie 0 ou le tableau est plein. Fin de saisie.");
       
       int compteur = 1;

         System.out.println("\nAVANT LE TRI:");
         for(i = 0; i<vLocNo.length; i++) {
            if(!vLocNo[i].equals("0") && !vLocNo[i].equals(" ")){
            System.out.println(i+1 + " " + vLocNo[i]);
            compteur ++;
         }
         }
         
         Arrays.sort(vLocNo);
         
         compteur = 1;

         System.out.println("\nRESULTAT APRES LE TRI:");
         for(i = 0; i<vLocNo.length; i++) {
            if (!vLocNo[i].equals("0") && !vLocNo[i].equals(" ")){          
               System.out.println(compteur + " " + vLocNo[i]);
               compteur ++;
            }
         }
      }
   }