public class Main {
    public static void main(String[] args) {
      
        Libro libro1 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1178, 25.99);
        Libro libro2 = new Libro("Topolino", "Disney", 328, 15.99);

        // Stampa la scheda di entrambi i libri
        libro1.stampaScheda();
        libro2.stampaScheda();

        // Prova a impostare un prezzo negativo su uno dei due libri
        libro1.setPrezzo(-10.0); // Dovrebbe stampare un messaggio di errore

        // Applica uno sconto del 20% al primo libro e stampa il nuovo prezzo
        libro1.applicaSconto(20);
        System.out.println("Nuovo prezzo del primo libro: " + libro1.getPrezzo() + " euro");

        // Stampa se ciascun libro è voluminoso o no
        System.out.println("Il primo libro è voluminoso? " + (libro1.getnPagine() > 500 ? "Sì" : "No"));
        System.out.println("Il secondo libro è voluminoso? " + (libro2.getnPagine() > 500 ? "Sì" : "No"));

    }
}
