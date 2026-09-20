public class LIS {

    /**
     * Retourne la longueur de la plus longue sous-séquence
     * strictement croissante du tableau t.
     */
    public static int longueurLIS(int[] t) {
        int longueur = t.length;
        if (longueur == 0) {
            return 0;
        }

        int[] dp = new int[longueur];
        // Initialisation : chaque élément est une sous-séquence de longueur 1 pour eviter l'initialisation à 0
        for (int i = 0; i < longueur; i++) {
            dp[i] = 1;
        }

        for (int i = 0; i < longueur; i++) {
            for (int j = 0; j < i; j++) {
                if (t[j] < t[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int reponse = 0;
        for (int i = 0; i < longueur; i++) {
            reponse = Math.max(reponse, dp[i]);
        }
        return reponse;
    }



    public static void main(String[] args) {
        int[][] tests = {
            {},
            {5},
            {5, 4, 3, 2, 1},
            {1, 2, 3, 4, 5},
            {2, 1, 4, 2, 3, 5, 1, 7},
            {3, 3, 3, 3},
            {10, 9, 2, 5, 3, 7, 101, 18}
        };
        System.out.println("Tests pour la longueur de la plus longue sous-séquence croissante :");
        for (int[] t : tests) {
            System.out.println("LIS = " + longueurLIS(t));
        }
    }
}