package logica;
import java.util.ArrayList;
import java.util.Scanner;

import static logica.Mesa.abrirMesas;

public class Main {

    public static void main(String[] args) {
        ArrayList<Mesa> mesas = new ArrayList<>();
        System.out.println(mesas);

        System.out.println("-----------------------");
        System.out.println("Elija una opcion");
        System.out.println("1. Abrir una nueva mesa");
        System.out.println("2. Editar una mesa");
        System.out.println("3. Eliminar una mesa");
        System.out.println("4. Cerrar una mesa");
        System.out.println("5. Salir");
        System.out.println("------------------------");
        Scanner teclado = new Scanner(System.in);

    }
}