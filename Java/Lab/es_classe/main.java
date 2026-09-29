package es_classe;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void Main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("+--------------------------------------+");
        System.out.println("|          GESTIONE STUDENTI           |");
        System.out.println("+--------------------------------------+");

        int nStudenti;
        System.out.print("\nNumero di studenti da inserire: ");
        nStudenti = scanner.nextInt();
        scanner.nextLine();
        
        Studente[] studenti = new Studente[nStudenti];

        Random random = new Random();

        for (int i = 0; i < nStudenti; i++) {
            studenti[i] = creaStudente(scanner, random, i + 1);
        }

        while (true) {
            System.out.println("+--------------------------------------+");
            System.out.println("|            ELENCO STUDENTI           |");
            System.out.println("+--------------------------------------+");
            
            for (int i = 0; i < studenti.length; i++) {
                System.out.printf("%d. %s%n", i + 1,
                        studenti[i].getNome() + " " + studenti[i].getCognome());
            }
            System.out.println(studenti.length + 1 + ". Crea un nuovo studente");
            System.out.println("----------------------------");
            System.out.println("0. Esci dal programma");

            int scelta;
            do {
                System.out.print("Scelta: ");
                scelta = scanner.nextInt();
            } while (scelta < 0 || scelta > studenti.length + 1);

            if (scelta == 0) {
                System.out.println("\n========================================");
                System.out.println("      Programma terminato. Arrivederci!");
                System.out.println("========================================");
                System.exit(0);
            } else if (scelta == studenti.length + 1) {
                scanner.nextLine();
                Studente[] nuoviStudenti = new Studente[studenti.length + 1];
                for (int i = 0; i < studenti.length; i++) {
                    nuoviStudenti[i] = studenti[i];
                }
                studenti = nuoviStudenti;
                studenti[studenti.length - 1] = creaStudente(scanner, random, studenti.length);
            } else {
                Studente studenteScelto = studenti[scelta - 1];
                System.out.println("\n----------------------------------------");
                System.out.println(" DATI DELLO STUDENTE");
                System.out.println(" Nome e cognome: " + studenteScelto.getNome() + " "
                        + studenteScelto.getCognome());
                System.out.println("----------------------------------------");
                studenteScelto.getMedia();
                studenteScelto.getMassimo();
                studenteScelto.getMinimo();
            }
        }
    }

    private static Studente creaStudente(Scanner scanner, Random random, int numero) {
        String[] dati;
        do {
            System.out.print("\nStudente " + numero + " - nome e cognome: ");
            dati = scanner.nextLine().trim().split("\\s+", 2);
            if (dati.length < 2 || dati[0].isEmpty() || dati[1].isEmpty()) {
                System.out.println("Errore: inserisci nome e cognome separati da uno spazio.");
            }
        } while (dati.length < 2 || dati[0].isEmpty() || dati[1].isEmpty());

        String nome = dati[0];
        String cognome = dati[1];

        Studente studente = new Studente(nome, cognome);
        int[] voti = new int[10];
        for (int i = 0; i < voti.length; i++) {
            voti[i] = random.nextInt(9) + 2;
        }
        studente.setVoti(voti);
        studente.calcolaMedia();
        return studente;
    }
}