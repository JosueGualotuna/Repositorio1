
package controlador;

public class OperacionesControlador {
 
public int sumar(int a,int b){
    return a+b;
}    

public int restar(int a,int b){
    return a-b;
}    

 public int multiplicar(int a,int b){
    return a*b;
}    
 
 public int dividir(int a,int b){
     if(b!=0){
        return a/b;
   }
   else{
       return 0;
   }
}  
}
