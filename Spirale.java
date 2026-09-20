public class Spirale {

    /**
     * Construit et retourne une matrice n x n remplie en spirale
     * (sens horaire) avec les nombres de 1 à n^2.
     */
    public static int[][] construireSpirale(int n) {
        int[][] m = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int val = 1;

        while (top <= bottom && left <= right) {

            // 1) haut : de gauche à droite
            for (int j = left; j <= right; j++) {
                m[top][j] = val;
                val++;
            }
            top++;

            // 2) droite : de haut en bas
            for (int i = top; i <= bottom; i++) {
                m[i][right] = val;
                val++;
            }
            right--;

            // Vérifier si les bornes sont encore valides
            if (top > bottom || left > right) {
                break;
            }

            // 3) bas : de droite à gauche
            for (int j = right; j >= left; j--) {
                m[bottom][j] = val;
                val++;
            }
            bottom--;

            // 4) gauche : de bas en haut
            for (int i = bottom; i >= top; i--) {
                m[i][left] = val;
                val++;
            }
            left++;
        }

        return m;
    }

    /**
     * Affiche une matrice n x n de manière lisible.
     */
    public static void afficherMatrice(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%3d", m[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] tests = {1, 2, 3, 4, 5};
        System.out.println("Tests pour construire et afficher une spirale :");
        for (int n : tests) {
            System.out.println("n = " + n);
            int[][] matrice = construireSpirale(n);
            afficherMatrice(matrice);
            System.out.println();
        }
    }
}