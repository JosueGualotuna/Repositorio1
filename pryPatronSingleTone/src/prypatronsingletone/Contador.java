
package prypatronsingletone;

public class Contador {
//variable estatica de tipo private para almacer unica
private static Contador instancia;     
private int contadorInt = 0;

private Contador(){
    
}

public static Contador getInstancia(){
    if(instancia ==null){
     instancia=new Contador();
    }
       return instancia;     
}
//metodo para incrementar el contador
public void Incremento(){
contadorInt++;
}
//metodo para obtener el valor
public int regreso(){
return contadorInt;    
}


}