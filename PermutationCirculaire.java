public class PermutationCirculaire {

     public static boolean estPermutationCirculaire(int[] t) {
          int n = t.length;

          // Étape 1 : vérifier que t est une permutation de 1..n
          if (!estPermutation(t, n)) {
               return false;
          }

          // Étape 2 : trouver la position de la valeur 1 dans t
          int pos = -1;
          for (int i = 0; i < n; i++) {
               if (t[i] == 1) {
                    pos = i;
                    break;
               }
          }
          if (pos == -1) {
               return false; // ne devrait pas arriver si étape 1 est validée
          }

          // Étape 3 : vérifier l'ordre circulaire à partir de pos
          for (int k = 0; k < n; k++) {
               int idx = (pos + k) % n;
               int valeurAttendue = k + 1;
               if (t[idx] != valeurAttendue) {
                    return false;
               }
          }

          return true;
     }

     
     private static boolean estPermutation(int[] t, int n) {
          boolean[] vu = new boolean[n + 1]; // indices 0..n, on utilise 1..n

          for (int x : t) {
               if (x < 1 || x > n) {
                    return false; // valeur hors de l'intervalle [1..n]
               }
               if (vu[x]== true) {
                    return false; // doublon détecté
               }
               vu[x] = true;
          }

          return true; // aucun doublon, aucune valeur hors intervalle
     }

     public static void main(String[] args) {
          int[][] tests = {
               {1, 2, 3, 4, 5},   
               {2, 3, 4, 5, 1},   
               {3, 4, 5, 1, 2},   
               {5, 1, 2, 3, 4},   
               {1, 3, 2, 4, 5},   
               {2, 1, 3, 4, 5},   
               {1, 2, 2, 4, 5},   
               {1, 2, 3, 4, 6},   
               {1}                
          };
          System.out.println("Tests pour vérifier si le tableau est une permutation circulaire :");
          for (int[] t : tests) {
               System.out.println(java.util.Arrays.toString(t)
                    +":" + estPermutationCirculaire(t));
          }
     }
}