public class BicicletaElectrica extends Bicicleta implements ConGarantiaExtendida {
        private int autonomia;
        private boolean bateriaCertificada;
        private boolean garantiaExtendida;

        public BicicletaElectrica(String codigo, int anioFabricacion, double peso, int autonomia, boolean bateriaCertificada) {
            super(codigo, anioFabricacion, peso);
            setAutonomia(autonomia);
            setBateriaCertificada(bateriaCertificada);
            this.garantiaExtendida = false;
        }

        public int getAutonomia() {
            return autonomia;
        }

        public void setAutonomia(int autonomia) {
            if (autonomia <= 0) {
                throw new IllegalArgumentException("La autonomía debe ser mayor a cero.");
            }
            this.autonomia = autonomia;
        }

        public boolean isBateriaCertificada() {
            return bateriaCertificada;
        }

        public void setBateriaCertificada(boolean bateriaCertificada) {
            this.bateriaCertificada = bateriaCertificada;
        }

        @Override
        public boolean tieneGarantiaExtendida() {
            return garantiaExtendida;
        }

        @Override
        public void activarGarantiaExtendida() {
            this.garantiaExtendida = true;
        }

        @Override
        public double calcularCostoMantencion() {
            double costo = 45000;
            if (!bateriaCertificada) {
                costo = costo * 1.25;
            }
            return costo;
        }

        @Override
        public void mostrarInfoCompleta() {
            String cert = bateriaCertificada ? "Sí" : "No";
            String gar = garantiaExtendida ? "Sí" : "No";
            System.out.println("Tipo: Bicicleta Eléctrica | Código: " + getCodigo() +
                    " | Año: " + getAnioFabricacion() + " | Peso: " + getPeso() + " kg" +
                    " | Autonomía: " + autonomia + " km | Batería certificada: " + cert +
                    " | Garantía extendida: " + gar + " | Costo mantención: $" + (int)calcularCostoMantencion());
        }
    }