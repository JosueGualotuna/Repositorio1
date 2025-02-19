package modelo;

/**
 *
 * @author Laboratorios DCCO
 */
public class medico extends Paciente{
public  especialidadModelo especialidad;    

    public medico(especialidadModelo especialidad, String cedula, String apellidosNombres, int edad, boolean sexo) {
        super(cedula, apellidosNombres, edad, sexo);
        this.especialidad = especialidad;
    }

    public especialidadModelo getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(especialidadModelo especialidad) {
        this.especialidad = especialidad;
    }

}