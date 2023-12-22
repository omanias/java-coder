import java.util.ArrayList;

public class Lista3 {
    public static void main(String[] args) {
        //crear una lista con datos Double

        ArrayList<Double> precios = new ArrayList<>();

        //Agregar elementos al ArrayList
        precios.add(15.99);
        precios.add(20.99);
        precios.add(10.99);

        //Iterar sobre el ArrayList con el bucle for-each
        for (double precio: precios){
            System.out.println(precio);
        }
    }
}
