public class Studente extends Persona {
    private String scuola; 

    public Studente(String scuola, String nome, int eta) {
        super(nome, eta);
        this.scuola = scuola;
    }

    @Override
    public void presentati() {
        System.out.println("Ciao, mi chiamo " + nome + ", ho " + eta + " anni e frequento la scuola " + scuola + ".");
    }
}
