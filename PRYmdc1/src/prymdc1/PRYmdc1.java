
package prymdc1;

import Controller.sumaControlador;
import View.sumarView;
import model.sumaModel;

public class PRYmdc1 {

public static void main(String[] args) {
    sumaModel sumModel = new sumaModel();
    sumarView  sumView= new sumarView();
    
    sumaControlador sc= new sumaControlador(sumView, sumModel);
        sc.iniciar();
        
    }
    
}
