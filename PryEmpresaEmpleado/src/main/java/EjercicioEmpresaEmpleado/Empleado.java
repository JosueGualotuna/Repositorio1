

package EjercicioEmpresaEmpleado;
class Empleado {
    private String nombre;
    private String cedula;
    private double salario;

    public Empleado(String nombre, String cedula, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado(" +"nombre='" + nombre + '\'' + ", cedula='" + cedula + '\'' +", salario=" + salario + ')';
    }
}
