public class SontÉgales {
    /**
     * Donnée : deux matrices d' entiers P et Q de même dimensions
     * Résultat : retourne true si P et Q sont égales, false sinon
     */
    public static boolean sontÉgales(int[][] P, int[][] Q) {
        if (P.length != Q.length || P[0].length != Q[0].length) {
            return false;
        }
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < P[0].length; j++) {
                if (P[i][j] != Q[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
