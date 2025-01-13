
package prycalculadoraavanzada;

import controller.calculadoraController;
import model.calculadoraModel;
import view.calculadoraView;

public class PryCalculadoraAvanzada {

    public static void main(String[] args) {
        calculadoraModel model = new calculadoraModel();
        calculadoraView view = new calculadoraView();

        calculadoraController main = new   calculadoraController(model,view);      
main.iniciar();
    }
}
