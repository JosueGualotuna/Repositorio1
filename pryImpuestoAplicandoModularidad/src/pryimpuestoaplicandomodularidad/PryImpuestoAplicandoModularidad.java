package pryimpuestoaplicandomodularidad;

import Carrito.ListaCompras;
import Carrito.Producto;
import Factura.GenerarFactura;
import Impuesto.ConfiguradorImpuesto;
import java.util.Scanner;

public class PryImpuestoAplicandoModularidad {

    public static void main(String[] args) {

        GenerarFactura gf = new GenerarFactura();
        ConfiguradorImpuesto ci = new ConfiguradorImpuesto();
        ListaCompras lista = new ListaCompras();

        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("===CARRITO DE COMPRAS===");
            System.out.println("1) Agregar producto");
            System.out.println("2) mostrar la lista y valor a pagar");
            System.out.println("3) salir");
            System.out.print("ENTRADA: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = entrada.nextDouble();
                    Producto prod = new Producto(nombre, precio);
                    lista.agregarProducto(prod);

                    break;
                case 2:

                    lista.mostrarLista();
                    System.out.println("===LISTA DE PRODUCTOS===");
                    System.out.println("Total sin IVA: " + lista.precioSinIva());
                    System.out.println("Total del IVA del " + ci.tasaimpuesto + ": " + lista.precioDELIVA());
                    System.out.println("Total a pagar con IVA del " + ci.tasaimpuesto + ": " + lista.totalAPAGAR());

                    break;
            }
        } while (opcion != 3);
    }

}
