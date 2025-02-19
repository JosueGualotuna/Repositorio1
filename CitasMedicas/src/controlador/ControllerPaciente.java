
package controlador;

import java.util.ArrayList;
import modelo.Paciente;

public class ControllerPaciente {
    
    ArrayList<Paciente> pacienteList = new ArrayList<>();
    
public void agregar(String cedula, String apellidosNombres, int edad, boolean sexo){
   
    Paciente paciente = new Paciente(cedula, apellidosNombres, edad, true);
    pacienteList.add(paciente);
}
    
public void listado(){
    for(Paciente pacienteFor : pacienteList)
        System.out.println(pacienteFor.getApellidosNombres());
        }


}
