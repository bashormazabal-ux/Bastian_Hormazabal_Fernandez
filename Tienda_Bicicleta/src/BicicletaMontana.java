public class BicicletaMontana extends Bicicleta {
    private int cantidadSuspensiones;

    public BicicletaMontana(String codigo, int anioFabricacion, double peso, int cantidadSuspensiones) {
        super(codigo, anioFabricacion, peso);
        setCantidadSuspensiones(cantidadSuspensiones);
    }

    public int getCantidadSuspensiones() {
        return cantidadSuspensiones;
    }

    public void setCantidadSuspensiones(int cantidadSuspensiones) {
        if (cantidadSuspensiones < 0) {
            throw new IllegalArgumentException("La cantidad de suspensiones no puede ser negativa.");
        }
        this.cantidadSuspensiones = cantidadSuspensiones;
    }

    @Override
    public double calcularCostoMantencion() {
        double costo = 30000;
        if (cantidadSuspensiones > 1) {
            costo = costo * 1.15;
        }
        return costo;
    }

    @Override
    public void mostrarInfoCompleta() {
        System.out.println("Tipo: Bicicleta de Montaña | Código: " + getCodigo() +
                " | Año: " + getAnioFabricacion() + " | Peso: " + getPeso() + " kg" +
                " | Suspensiones: " + cantidadSuspensiones + " | Costo mantención: $" + (int)calcularCostoMantencion());
    }
}