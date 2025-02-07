package Carrito;

import Impuesto.ConfiguradorImpuesto;
import java.util.ArrayList;

public class ListaCompras {

    ArrayList<Producto> listaCompras1 = new ArrayList<>();

    public void agregarProducto(Producto prod) {
        listaCompras1.add(prod);
    }

    public void mostrarLista() {
        for (Producto prod : listaCompras1) {
            System.out.println(prod);
        }

    }

    public double precioSinIva() {
        double total = 0;
        for (Producto prod : listaCompras1) {
            total += prod.getPrecio();
        }
        return total;
    }

    public double precioDELIVA() {
        double total = 0;
        ConfiguradorImpuesto ci = new ConfiguradorImpuesto();
        for (Producto prod : listaCompras1) {
            total = precioSinIva() * ci.tasaimpuesto;
        }
        return total;
    }

    public double totalAPAGAR() {
        double total = 0;
        ConfiguradorImpuesto ci = new ConfiguradorImpuesto();
        for (Producto prod : listaCompras1) {
            total = precioSinIva() + precioSinIva() * ci.tasaimpuesto;
        }
        return total;
    }
}
