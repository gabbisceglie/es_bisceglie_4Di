public class Main {
    public static void main(String[] args) {
        Automobile automobile = new Automobile("Toyota", "Yaris", 140, 3);
        Moto moto = new Moto("Honda", "CBR 600 RR", 255, 600);
        Bicicletta bicicletta = new Bicicletta("Bianchi", "C-Sport", 35);

        System.out.println(automobile.descrizione());
        System.out.println(moto.descrizione());
        System.out.println(bicicletta.descrizione());

        automobile.accendi();
        System.out.println("Accesa: " + automobile.isAcceso());
        automobile.spegni();
    }
}
