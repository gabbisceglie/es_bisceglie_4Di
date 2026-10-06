public class Libro {

    private String titolo;
    private String autore;
    private int nPagine;
    private double prezzo;

    public Libro(String titolo, String autore, int nPagine, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.nPagine = nPagine;
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getnPagine() {
        return nPagine;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setnPagine(int nPagine) {
        this.nPagine = nPagine;
    }

    public void setPrezzo(double prezzo) {
        // Controllo per assicurarsi che il prezzo sia positivo
        if (prezzo <= 0) {
            System.out.println("Il prezzo deve essere positivo.");
        } else {
            this.prezzo = prezzo;
        }
    }


    public void stampaScheda() {
        System.out.println(this.titolo + " - " + this.autore + " - " + this.nPagine + " pagine - " + this.prezzo + " euro");
    }

    public void applicaSconto(double percentuale) {
        if (percentuale > 0 && percentuale < 100) {
            this.prezzo = this.prezzo * (1 - percentuale / 100);
        } else {
            System.out.println("La percentuale di sconto deve essere compresa tra 0 e 100.");
        }
    }

    public boolean isVoluminoso() {
        return this.nPagine > 500;
    }

}