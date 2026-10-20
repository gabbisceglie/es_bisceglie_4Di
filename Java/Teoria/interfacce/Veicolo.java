public abstract class Veicolo {
    
    private String Marca;
    private String modello;
    private int Vmax;

    public Veicolo(String marca, String modello, int vmax) {
        this.Marca = marca;
        this.modello = modello;
        this.Vmax = vmax;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModello() {
        return modello;
    }

    public int getVmax() {
        return Vmax;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setVmax(int vmax) {
        this.Vmax = vmax;
    }

    public abstract String descrizione();

}
