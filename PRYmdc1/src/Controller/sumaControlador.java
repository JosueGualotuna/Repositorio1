package Controller;
import View.sumarView;
import model.sumaModel;

public class sumaControlador {
 
private sumarView vista;    
    private sumaModel model;    

    public sumaControlador(sumarView vista, sumaModel model) {
        this.vista = vista;
        this.model = model;
    }

public void iniciar(){
int num1,num2,numResultado;
num1=vista.pedirNumero("Ingrese el N. 1:");

num2=vista.pedirNumero("Ingrese el N. 2:");
    System.out.println();
    System.out.println("suma");
numResultado=model.sumar(num1, num2);
vista.mostrarResultado(numResultado);
    System.out.println();

    System.out.println("resta");

numResultado=model.restar(num1, num2);
vista.mostrarResultado(numResultado);
    System.out.println();

    System.out.println("multiplicacion");

numResultado=model.multiplicar(num1, num2);
vista.mostrarResultado(numResultado);

}    
    
}
