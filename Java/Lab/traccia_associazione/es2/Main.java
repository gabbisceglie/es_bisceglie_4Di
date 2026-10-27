package es2;

public class Main {
    public static void main(String[] args) {
        Motore motore = new Motore(119);
        Auto auto = new Auto(motore);
        auto.avvia();

        auto.setMotore(null);
        auto.avvia();
    }
}
