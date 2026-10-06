public class es4 {
    public static void main(String[] args) {
        //4. Data una matrice 3×4, stampa la somma di ogni riga con due for annidati.

        int[][] matrice = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        for (int i=0; i<matrice.length; i++) {
            int sommaRiga = 0;

            for (int j=0; j<matrice[i].length; j++) {
                sommaRiga += matrice[i][j];
            }
            System.out.println("Somma della riga " + (i + 1) + ": " + sommaRiga);
        }
    }
}
