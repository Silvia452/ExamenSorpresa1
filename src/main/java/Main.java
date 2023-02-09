import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FabricaDialogo fabrica = new FabricaDialogoWindows();
        Cliente cliente = new Cliente(fabrica);

        System.out.println("Seleccione si desea Mac(opcion 1) o Windows(opcion 2)");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        if (opcion == 1) {
            fabrica = new FabricaDialogoMac();
            cliente = new Cliente(fabrica);
            cliente.imprimir();
        } else if (opcion == 2) {
            fabrica = new FabricaDialogoWindows();
            cliente = new Cliente(fabrica);
            cliente.imprimir();
        } else {
            System.out.println("Opción no válida");
        }

        cliente.mostrarMensaje();


    }
}
