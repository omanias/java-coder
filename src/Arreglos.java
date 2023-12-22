public class Arreglos {
    public static void main(String[] args) {
        int dimension = 5;

        int[] listaNumerica = new int[dimension];

        listaNumerica[0] = 10;
        listaNumerica[1] = 20;
        listaNumerica[2] = 50;
        listaNumerica[3] = 80;
        listaNumerica[4] = 110;

        System.out.println("El valor del elemento es: ");

        for(int numero: listaNumerica){
            System.out.println(numero);
        }
    }
}
