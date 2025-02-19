
package modelo;

import modelo.MedicoModelo;
import modelo.PacienteModelo;

public class TurnoModelo  {
  int turnoEntrada,turnoSalida;
private MedicoModelo medico;
    public TurnoModelo(int turnoEntrada, int turnoSalida) {
        this.turnoEntrada = turnoEntrada;
        this.turnoSalida = turnoSalida;
    }

    public void setTurnoEntrada(int turnoEntrada) {
        this.turnoEntrada = turnoEntrada;
    }

    public void setTurnoSalida(int turnoSalida) {
        this.turnoSalida = turnoSalida;
    }

    public int getTurnoEntrada() {
        return turnoEntrada;
    }

    public int getTurnoSalida() {
        return turnoSalida;
    }



}
