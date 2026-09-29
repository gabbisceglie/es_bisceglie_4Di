public class Automobile {

private String marca;
private int velocita;

public String getMarca() {
return marca;
}

public void setMarca(String marca) {
return this.marca = marca;
}

public int getVelocita() {
return velocita;
}

public void setVelocita(String v) {
this.velocita = v;
}

}

//Il main va in un file separato

public class Main {

public static void main(String[] args) {
Automobile a = new Automobile();
a.setMarca("Fiat");
a.velocita = (50); //bisogna usare a.setVelocità
System.out.println(a.getmarca());
    }
}