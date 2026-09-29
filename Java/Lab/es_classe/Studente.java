package es_classe;

public class Studente {

    private int voti[]= new int[10];
    private String nome, cognome;
    private double media=0;

    //Costruttore
    public Studente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public void setVoti(int voti[]) {
        this.voti = voti;
    }

    public void setVoti(int voti, int indice) {
        this.voti[indice] = voti;
    }

    //Metodo per inserire i voti
    public void inserisciVoti(int voti[]) {
        for (int i=0; i<voti.length; i++) {
            this.voti[i] = voti[i];
        }
        if (voti.length != 10) {
            System.out.println("Errore: è possibile inserire solo 10 voti.");
        }
    }
    
    public void getMedia() {
        System.out.println("La media dei voti di " + nome + " " + cognome + " è: " + media);
    }

    //Metodo per calcolare la media dei voti
    public double calcolaMedia() {
        int somma = 0;
        for (int i=0; i<voti.length; i++) {
            somma += voti[i];
        }
        media = (double) somma / voti.length;
        return media;
    }

    //Metodo per calcolare il voto massimo
    public int getMassimo() {
        int massimo = voti[0];
        for (int i=1; i<voti.length; i++) {
            if (voti[i] > massimo) {
                massimo = voti[i];
            }
        }
        System.out.println("Il voto massimo di " + nome + " " + cognome + " è: " + massimo);
        return massimo;
    }

    //Metodo per calcolare il voto minimo
    public int getMinimo() {
        int minimo = voti[0];
        for (int i=1; i<voti.length; i++) {
            if (voti[i] < minimo) {
                minimo = voti[i];
            }
        }
        System.out.println("Il voto minimo di " + nome + " " + cognome + " è: " + minimo);
        return minimo;
    }

        public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

















}
