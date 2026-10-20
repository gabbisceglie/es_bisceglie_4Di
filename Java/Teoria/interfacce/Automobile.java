public class Automobile extends Veicolo implements Accendibile {

    private int numeroPorte;

    public Automobile(String marca, String modello, int vmax, int numeroPorte) {
        super(marca, modello, vmax);
        this.numeroPorte = numeroPorte;
    }

    @Override 
    public void accendi() {
        System.out.println("L'automobile è accesa.");
    }

    @Override 
    public boolean isAcceso() {
        return true;
    }

    @Override 
    public void spegni() {
        System.out.println("L'automobile è spenta.");
    }

    @Override 
    public String descrizione() {
        return "Marca: " + getMarca() + ", Modello: " + getModello() + ", Velocità massima: " + getVmax() + ", Numero di porte: " + numeroPorte;
    }
}