public class es4 {
    public static void main(String[] args) {
        //4. Data una matrice 3×4, stampa la somma di ogni riga con due for annidati.

        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        for (int righe=0; righe<mat.length; righe++) {
            int sommaRiga = 0;

            for (int j=0; j<mat[righe].length; j++) {
                sommaRiga += mat[righe][j];
            }
            System.out.println("Somma della riga " + (righe + 1) + ": " + sommaRiga);
        }
    }
}
