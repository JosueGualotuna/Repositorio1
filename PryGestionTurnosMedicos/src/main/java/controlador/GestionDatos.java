
package controlador;

import java.util.ArrayList;
import modelo.MedicoModelo;
import modelo.PacienteModelo;
import modelo.TurnoModelo;


public class GestionDatos {

private static GestionDatos instancia;
    ArrayList<PacienteModelo> listaPaciente;
ArrayList<MedicoModelo> listaMedico;
ArrayList<TurnoModelo> listaTurno;

private GestionDatos(){
    listaPaciente = new ArrayList<>();
    listaMedico = new ArrayList<>();
    listaTurno = new ArrayList<>();
}

public static GestionDatos getInstancia(){
    if(instancia==null){
     instancia   = new GestionDatos();
    }
    return instancia;
}

public void agregarPaciente(PacienteModelo paciente ){
    listaPaciente.add(paciente);
}

public void agregarMedico(MedicoModelo medico){
    listaMedico.add(medico);
}

public void agregarTurno(TurnoModelo turno){
    listaTurno.add(turno);
}
public ArrayList<PacienteModelo> getListaPacientes() {
    return listaPaciente;
    }

    public ArrayList<MedicoModelo> getListaMedicos() {
        return listaMedico;
    }

    public ArrayList<TurnoModelo> getListaTurnos() {
        return listaTurno;
    }

    public ArrayList<Object> getListaCombinada() {
        ArrayList<Object> listaCombinada = new ArrayList<>();
        listaCombinada.addAll(listaPaciente);
        listaCombinada.addAll(listaMedico);
        listaCombinada.addAll(listaTurno);
        return listaCombinada;
    }

    public void eliminarMensajePorIndice(int indice) {
    if (indice >= 0 && indice < getListaCombinada().size()) { 
        getListaCombinada().remove(indice);
    }
}
    
    
    
}
