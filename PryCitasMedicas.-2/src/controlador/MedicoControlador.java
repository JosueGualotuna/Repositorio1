
package controlador;

import java.util.ArrayList;
import modelo.EspecialidadModelo;
import modelo.MedicoModelo;


public class MedicoControlador {
  
    ArrayList<MedicoModelo> MedicoLista ;
    
 private static MedicoControlador instancia;

    public MedicoControlador() {
        this.MedicoLista = new ArrayList<>();
    }
    
public static  MedicoControlador getInstancia(){
    if(instancia==null){
        instancia = new MedicoControlador();
    }
    return instancia;
}
 
public MedicoModelo agregarMedico(EspecialidadModelo especialidad, String cedula, String nombres, int edad, boolean sexo){
MedicoModelo medico = new MedicoModelo(especialidad, cedula, nombres, edad, sexo);
    MedicoLista.add(medico);
    return medico;
}

public  ArrayList<MedicoModelo> RetornarListaMedico(){
  return MedicoLista;    
}





}
