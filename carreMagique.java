public class carreMagique {
     public static boolean estCarreMagique(int[][] m) {
          int n =m.length;
          int ref=0;
          for(int i=0;i<n;i++){
               ref+=m[0][i];
          }
          // verifie si la somme des lignes est égale à la somme de la première ligne
          for(int i=0;i<n;i++){
               int sommeLigne=0;
               for(int j=0;j<n;j++){
                    sommeLigne+=m[i][j];
               }
               if(sommeLigne!=ref){
                    return false;
               }
          }
          // verifie si la somme des colonnes est égale à la somme de la première ligne
          for(int j=0;j<n;j++){
               int sommeColonne=0;
               for(int i=0;i<n;i++){
                    sommeColonne+=m[i][j];
               }
               if(sommeColonne!=ref){
                    return false;
               }
          }
          // verifie si la somme de la diagonale principale est égale à la somme de la première ligne
          int sommeDiagPrincipale=0;
          for(int i=0;i<n;i++){
               sommeDiagPrincipale+=m[i][i];
          }
          if(sommeDiagPrincipale!=ref){
               return false;
          }
          // verifie si la somme de la diagonale secondaire est égale à la somme de la première ligne
          int sommeDiagSecondaire=0;
          for(int i=0;i<n;i++){
               sommeDiagSecondaire+=m[i][n-1-i];
          }
          if(sommeDiagSecondaire!=ref){
               return false;
          }
     return true;
     }
     public static void main(String[] args) {
          System.out.println("Test 1:");
          int[][] matrice1 = {
               {8, 1, 6},
               {3, 5, 7},
               {4, 9, 2}
          };
          System.out.println("Matrice1 est un carré magique : " + estCarreMagique(matrice1));

          System.out.println("Test 2:");
          int[][] matrice2 = {
               {2, 7, 6},
               {9, 5, 1},
               {4, 8, 2}
          };
          System.out.println("Matrice2 est un carré magique : " + estCarreMagique(matrice2)); 
          System.out.println("Test 3:");
          int[][] matrice3 = {
               {1,1,1},
               {1,1,1},
               {1,1,1}
          };
          System.out.println("Matrice3 est un carré magique : " + estCarreMagique(matrice3));
     }
}
