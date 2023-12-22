import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2 {
    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<>();

        //Agrego elementos
        frutas.add("Manzana");
        frutas.add("Sandia");
        frutas.add("Frutilla");

        //Obtener un Iterator desde el ArrayList
        Iterator<String> iterator = frutas.iterator();

        //Iterar sobre la coleccion o lista utilizando el Iterator
        while (iterator.hasNext()){
            String fruta = iterator.next();

            //Eliminar un elemento
            if(fruta.equals("Sandia")){
                iterator.remove();
                System.out.println(frutas);

            }


        }




    }
}
