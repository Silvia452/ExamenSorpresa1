public class FabricaDialogoWindows implements FabricaDialogo {

    @Override
    public Dialogo nuevoDialogo() {
        return new DialogoWindows();
    }
}

