public class Main {
    public static void main(String[] args) {
        
        //New array di FiguraGeometrica
        FiguraGeometrica[] figure = new FiguraGeometrica[3];

        //Creazione di un oggetto cerchio
        Cerchio cerchio = new Cerchio("cerchio", "rosso", 5.0);

        //Aggiunta del cerchio all'array
        figure[0] = cerchio;
        cerchio.visualizza();












    }
}