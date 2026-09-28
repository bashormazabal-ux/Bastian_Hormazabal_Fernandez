import java.util.ArrayList;

public class GestorTaller {
    private ArrayList<Bicicleta> listaBicicletas;

    public GestorTaller() {
        listaBicicletas = new ArrayList<>();
    }

    public void registrarBicicleta(Bicicleta b) {
        listaBicicletas.add(b);
        String tipo = b.getClass().getSimpleName();
        System.out.println(b.getCodigo() + " (" + tipo + ") registrada correctamente.");
    }

    public Bicicleta buscarPorCodigo(String codigo) {
        for (Bicicleta b : listaBicicletas) {
            if (b.getCodigo().equals(codigo)) {
                return b;
            }
        }
        return null;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return listaBicicletas;
    }
}