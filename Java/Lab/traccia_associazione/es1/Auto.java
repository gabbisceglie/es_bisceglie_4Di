package es1;

public class Auto implements Veicolo{

    Pilota p1;

    public void setPilota(Pilota p1) {
        this.p1 = p1;
    }

    public Pilota getPilota() {
        return p1;
    }

    public Auto(){
    }

@Override 
    public void avvia() {
        if (p1 == null) {
            System.out.println("Non puoi avviare l'auto senza un pilota");
            return;
        }
        System.out.println("Auto avviata, BRUM, BRUM ");
    }

}