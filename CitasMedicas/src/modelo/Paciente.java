
package modelo;

public class Paciente {
     
    public String cedula;
    public String apellidosNombres;
    public int edad;
    public boolean sexo;

    public Paciente(String cedula, String apellidosNombres, int edad, boolean sexo) {
        this.cedula = cedula;
        this.apellidosNombres = apellidosNombres;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setApellidosNombres(String apellidosNombres) {
        this.apellidosNombres = apellidosNombres;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getCedula() {
        return cedula;
    }

    public String getApellidosNombres() {
        return apellidosNombres;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isSexo() {
        return sexo;
    }




}