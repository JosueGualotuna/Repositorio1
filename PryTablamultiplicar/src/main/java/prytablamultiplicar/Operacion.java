
package prytablamultiplicar;


public abstract class Operacion {
    
public abstract void Operacion(int num, int iter);    
    
public int sumarTabla(int num, int iter){
int suma =0;
for(int i=0; i<iter;i++){
    suma += num*(i+1);
}
    return suma;
 }

public void tablaInvertida(int num, int iter){
    System.out.println("Tabla del numero "+num+" en orden descendente: ");    
for(int i =iter-1;i>=0;i--){
    System.out.println(+num+" x "+(i+1)+" = " +(num*(i+1)));    

    
}
}
        

    
}
