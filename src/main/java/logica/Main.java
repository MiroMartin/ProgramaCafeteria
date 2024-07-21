package logica;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Mesa> mesas = new ArrayList<>();
        String string = mesas.toString();
        System.out.println(mesas);

        System.out.println("-------------------------");
        System.out.println("Elija una opcion");
        System.out.println("1. Abrir una nueva mesa");
        System.out.println("2. Editar articulos de una mesa");
        System.out.println("3. Eliminar una mesa");
        Scanner teclado = new Scanner(System.in);
        int i = teclado.nextInt();
            switch (i){
                case 1:
                    abrirMesas(mesas);
                case 2:
                    //editarMesas();
                case 3:
                    //eliminarMesa();

                default:
            }
            System.out.println("Las mesas ocupadas son: " + mesas);
    }

    private static void abrirMesas(ArrayList<Mesa> mesas) {
        System.out.println("Elija la mesa deseada");
        Scanner teclado2 = new Scanner(System.in);
        int num = teclado2.nextInt();
        Mesa mesa = new Mesa();
        mesa.setNumMesa(num);
        System.out.println("Ingrese el nombre del camarero");
        String nom = teclado2.next();
        mesa.setNomCamarero(nom);
        mesas.add(mesa);
    }
}