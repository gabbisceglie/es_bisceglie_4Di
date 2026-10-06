public class es2 {
    public static void main(String[] args) {
        //2. Stampa gli elementi di un array dall'ultimo al primo, partendo dall'indice length − 1.

        int[] array = {1, 2, 3, 4, 5, 6};

        for(int i=array.length-1; i>=0; i--) {
            System.out.println("Elemento "+ i + ": " + array[i]);
        }
    }
}