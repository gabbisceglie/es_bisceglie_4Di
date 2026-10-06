import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {

    //3. Leggi 10 voti da tastiera e conta quanti sono maggiori o uguali a 6.

    Scanner scanner = new Scanner(System.in);
    int cont = 0;

    for (int i = 0; i < 10; i++) {
        System.out.print("Inserisci il voto " + (i + 1) + ": ");
        int voto = scanner.nextInt();
        if (voto >= 6) {
            cont++;
        }
    }
        //Aggiuntivo: stampa contatore alla fine del ciclo
        System.out.println("Numero di voti maggiori o uguali a 6: " + cont);
        scanner.close();
    }
}