public class Cilindro extends Cerchio {
    protected double altezza;

    public Cilindro(String nome, String colore, double raggio, double altezza) {
        super(nome, colore, raggio);
        this.altezza = altezza;
    }

    public double volume() {
        return area() * altezza;
    }

    //metodi ridefiniti da cerchio.java
    @Override 
    public double area() {
        return 2 * Math.PI * raggio * (raggio + altezza);
    }

    @Override
    public void visualizza() {
        super.visualizza();
        System.out.println("Altezza: " + altezza);
        System.out.println("Volume: " + volume());
    }
}