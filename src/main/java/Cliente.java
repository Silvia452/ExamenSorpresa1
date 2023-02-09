public class Cliente {
    private Dialogo dialogo; //crear dentro de interfaz dialogo

    public Cliente (FabricaDialogo fabrica) {
        dialogo = fabrica.nuevoDialogo();
    }

    public void imprimir() {
        dialogo.imprimir();
    }

    public void mostrarMensaje() {
        dialogo.mostrarMensaje();
    }
}
