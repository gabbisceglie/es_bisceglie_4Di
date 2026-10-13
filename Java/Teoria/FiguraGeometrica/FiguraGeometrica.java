public class FiguraGeometrica {
    protected String nome;
    protected String colore;

    public FiguraGeometrica(String nome, String colore) {
        this.nome = nome;
        this.colore = colore;
    }

    public void visualizza() {
        System.out.println("Nome: " + nome);
        System.out.println("Colore: " + colore);
    }
}