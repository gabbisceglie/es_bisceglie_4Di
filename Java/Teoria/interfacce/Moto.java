public class Moto extends Veicolo{
    private int cilindrata;

    public Moto(String marca, String modello, int vmax, int cilindrata) {
        super(marca, modello, vmax);
        this.cilindrata = cilindrata;
    }

    @Override 
    public String descrizione() {
        return "Moto: " + getMarca() + " " + getModello() + ", velocità massima: " + getVmax() + " km/h, cilindrata: " + cilindrata + " cc";
    }
}
