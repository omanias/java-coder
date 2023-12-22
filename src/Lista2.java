import java.util.ArrayList;

public class Lista2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        //agregar elementos
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        //acceder al elemento por el indice
        int primerNumero = numeros.get(0);
        System.out.println(primerNumero);

        //modificar un elemento
        numeros.set(1,50);
        System.out.println(numeros);
    }
}
