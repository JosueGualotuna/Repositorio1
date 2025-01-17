
package controlador;

public class operaciones {

public int suma(int a, int b){
    return a+b;
}

public int resta(int a, int b){
    return a-b;
}
    
public int multiplicacion(int a, int b){
    return a*b;
}
   
public int division(int a, int b){
    return a/b;
}

        public int convInt(String a){
int conv = Integer.parseInt(a);
return conv;
    }
        
         public String convString(int a){
    String conv = String.valueOf(a);
return conv;
    }

}
