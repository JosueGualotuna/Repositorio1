
package prytablamultiplicar;

public class TablaMultiplicar extends Operacion{

    @Override
    public void Operacion(int num, int iter) {
    System.out.println("Tabla del numero "+num+" en orden ascendente: ");
for(int i=0; i<iter;i++ ){
    System.out.println(num+" x "+(i+1)+" = "+(num*(i+1)));    
}
    }
}
