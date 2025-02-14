package modelo;

public class modeloInstrumento {

    private String nombre;
    private double precio;
    private int cantidad;

    public modeloInstrumento(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Instrumento{" + "nombre: " + nombre + ", precio: " + precio + ", cantidad: " + cantidad + '}';
    }

}
