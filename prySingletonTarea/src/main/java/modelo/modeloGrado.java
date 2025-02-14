package modelo;

public class modeloGrado {

    private double grado;

    public modeloGrado(double grado) {
        this.grado = grado;
    }

    public void setGrado(double grado) {
        this.grado = grado;
    }

    public double getGrado() {
        return grado;
    }

    @Override
    public String toString() {
        return "Grado centigrado{" + "grado centigrado: " + grado + '}';
    }

}
