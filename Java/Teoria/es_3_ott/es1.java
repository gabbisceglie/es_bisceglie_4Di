public static void main(String[] args) {
    //1. Dichiara un array con 6 temperature e stampa la somma e la media.

    double[] temperature = new double[6];

    //inserisco valori nell'array
    temperature[0] = 20.5;
    temperature[1] = 22.0;
    temperature[2] = 19.8;
    temperature[3] = 21.2;
    temperature[4] = 23.5;
    temperature[5] = 18.9;

    //calcolo somma e media
    double somma = 0;
    for (int i=0; i<temperature.length; i++) {
        somma+=temperature[i];
    }

    double media = somma/temperature.length;

    //stampo somma e media
    System.out.println("Somma delle temperature: " + somma);
    System.out.println("Media delle temperature: " + media);
    
}