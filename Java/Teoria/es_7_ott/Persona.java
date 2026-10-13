public class Persona {

    protected String nome;
    protected int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public void presentati() {
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni.");
    }

    public void presentati(String destinatario) {
        System.out.println("Ciao " + destinatario + ", mi chiamo " + nome + " e ho " + eta + " anni.");
    }





    
}