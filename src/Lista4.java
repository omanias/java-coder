import java.util.ArrayList;

public class Lista4 {

    public static void main(String[] args) {

        ArrayList<String> colores = new ArrayList<>();

        //Agregamos elementos
        colores.add("Celeste");
        colores.add("Naranja");
        colores.add("Azul");

        //Eliminar elemento
        colores.remove("Azul");

        System.out.println(colores);
    }
}
