public class differenceDiagonale {
     public static int differenceDiag(int[][] m) {
          int n = m.length;
          int sommeDiagPrincipale = 0;
          int sommeDiagSecondaire = 0;
          
          for (int i = 0; i < n; i++) {
               sommeDiagPrincipale += m[i][i];
               sommeDiagSecondaire += m[i][n - 1 - i];
          }
          int diff=sommeDiagPrincipale - sommeDiagSecondaire;
          int absDiff=Math.abs(diff);
          return absDiff;
     }
     public static void main(String[] args) {
          System.out.println("Test 1:");
          int[][] matrice1 = {
               {1, 2, 3},
               {4, 5, 6},
               {7, 8, 9}
          };
          System.out.println("Différence diagonale matrice1 : " + differenceDiag(matrice1)); // Résultat attendu : 0

          System.out.println("Test 2:");
          int[][] matrice2 = {
               {11, 2, 4},
               {4, 5, 6},
               {10, 8, -12}
          };
          System.out.println("Différence diagonale matrice2 : " + differenceDiag(matrice2)); // Résultat attendu : 15
     }
}
