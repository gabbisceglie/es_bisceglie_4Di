public class Cerchio extends FiguraGeometrica{
    protected double raggio;

    public Cerchio(String nome, String colore, double raggio) {
        super(nome, colore);
        this.raggio = raggio;
    }

    public double circonferenza() {
        return 2 * Math.PI * raggio;
    }

    public double area() {
        return Math.PI * raggio * raggio;
    }

    @Override 
    public void visualizza() {
        super.visualizza();
        System.out.println("Raggio: " + raggio);
        System.out.println("Circonferenza: " + circonferenza());
        System.out.println("Area: " + area());
    }
}