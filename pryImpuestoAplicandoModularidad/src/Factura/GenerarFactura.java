package Factura;

import Impuesto.ConfiguradorImpuesto;

public class GenerarFactura {

    ConfiguradorImpuesto ci = new ConfiguradorImpuesto();

    public double Factura(double valor) {
        double total = ci.calcularImpuesto(valor);
        return total;
    }

}
