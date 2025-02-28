package prycitasmedicas.pkg2;

import controlador.EspecialidadControlador;
import controlador.MedicoControlador;
import controlador.PacienteControlador;
import modelo.EspecialidadModelo;
import vista.PantallaPrincipal;

public class PryCitasMedicas2 {

    public static void main(String[] args) {
        
        PacienteControlador pc =PacienteControlador.getInstancia();
        pc.AgregarPaciente("33", "PEPE MACIAS", 50, true);
        pc.AgregarPaciente("4846", "JORGE ULLOA",11, true);
        pc.AgregarPaciente("2616", "MANUEL CAÑO", 24, false);
        
        EspecialidadControlador ec= EspecialidadControlador.getInstancia();
        EspecialidadModelo em1= ec.AgregarEspecialidad("PEDIATRIA");
        EspecialidadModelo em2= ec.AgregarEspecialidad("GENERAL");
        EspecialidadModelo em3= ec.AgregarEspecialidad("VETERINAIA");
        EspecialidadModelo em4= ec.AgregarEspecialidad("ODONTOLOGIA");
        
        MedicoControlador mc= MedicoControlador.getInstancia();
        mc.agregarMedico(em1, "1515", "MATIAS TORRES", 64, true);
        mc.agregarMedico(em2, "2616", "MARILUNA ROMIN", 42, true);
        mc.agregarMedico(em3, "1415", "JOSEFA TUTUTULIPAPA", 34, false);
        mc.agregarMedico(em4, "1620", "SCARLETH PEREZ", 29, false);
        
        
        PantallaPrincipal pantalla = new PantallaPrincipal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
    
}
