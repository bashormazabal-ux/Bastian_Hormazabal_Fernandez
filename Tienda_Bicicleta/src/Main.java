public class Main {
    public static void main(String[] args) {
        GestorTaller gestor = new GestorTaller();

        // 1. Instanciar bicicletas con los datos de la tabla
        BicicletaElectrica e1 = new BicicletaElectrica("BIC-E01", 2023, 22.5, 60, false);
        BicicletaElectrica e2 = new BicicletaElectrica("BIC-E02", 2022, 24.0, 45, true);
        BicicletaMontana m1 = new BicicletaMontana("BIC-M01", 2021, 13.5, 2);
        BicicletaMontana m2 = new BicicletaMontana("BIC-M02", 2020, 12.0, 1);

        // 2. Activar garantía extendida a BIC-E01
        e1.activarGarantiaExtendida();

        // 3. Registrar bicicletas
        gestor.registrarBicicleta(e1);
        gestor.registrarBicicleta(e2);
        gestor.registrarBicicleta(m1);
        gestor.registrarBicicleta(m2);

        System.out.println();

        // 4. Búsqueda por código
        System.out.println("=== BUSQUEDA POR CODIGO: \"BIC-E01\" ===");
        Bicicleta encontrada = gestor.buscarPorCodigo("BIC-E01");
        if (encontrada != null) {
            encontrada.mostrarInfoCompleta();
        }
        System.out.println("---");
        System.out.println();

        // 5. Listado de bicicletas usando toString()
        System.out.println("=== LISTADO DE BICICLETAS ===");
        for (Bicicleta b : gestor.getBicicletas()) {
            System.out.println(b.toString());
        }
    }
}