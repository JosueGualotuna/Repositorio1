
package citasmedicas;

import controlador.ControllerPaciente;

public class CitasMedicas {

    public static void main(String[] args) {
        ControllerPaciente c = new ControllerPaciente();
c.agregar("153", "Ana ", 12, true);
        System.out.println(c);
}
}
