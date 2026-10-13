public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Giampiero", 37);
        persona.presentati();

        persona.presentati("Luca");

        Studente studente = new Studente("Istituto Tecnico", "Giulia", 17);
        studente.presentati();
        studente.presentati("Giampiero");
    }
}
