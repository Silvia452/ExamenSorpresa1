public class FabricaDialogoMac implements FabricaDialogo {

    @Override
    public Dialogo nuevoDialogo() {
        return new DialogoMac();
    }
}

