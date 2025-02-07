package Impuesto;

public class ConfiguradorImpuesto {

    public double tasaimpuesto = 0.15;

    public double calcularImpuesto(double valor) {
        return valor * tasaimpuesto;

    }

}
