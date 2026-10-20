public class Bicicletta extends Veicolo{

    public Bicicletta(String marca, String modello, int vmax) {
        super(marca, modello, vmax);
    }

    @Override
    public String descrizione() {
        return "Bicicletta: " + getMarca() + " " + getModello() + ", velocità massima: " + getVmax() + " km/h";
    }
}
