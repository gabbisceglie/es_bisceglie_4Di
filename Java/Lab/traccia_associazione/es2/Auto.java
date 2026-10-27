package es2;

public class Auto implements Veicolo {
    
    Motore motore;

    public Auto(Motore motore) {
        this.motore = motore;
    }

    public void setMotore(Motore motore) {
        this.motore = motore;
    }

    @Override 
    public void avvia() {
        if (motore == null) {
            System.out.println("L'auto non può essere avviata perché non ha un motore.");
            return;
        }
        System.out.println("L'auto è stata avviata.");
    }
}
