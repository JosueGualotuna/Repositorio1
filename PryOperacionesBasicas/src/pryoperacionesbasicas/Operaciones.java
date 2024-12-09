package pryoperacionesbasicas;

public class Operaciones {
public double num1;  
public double num2;  
 
public Operaciones(double num1, double num2) {
this.num1 = num1;
this.num2 = num2;
}

public double Sumar(){
    return num1+num2;
}
    
public double Resta(){
    return num1-num2;
}

public double Multiplicar(){
    return num1*num2;
}

public double Dividir(){
if (num2 !=0){
        return num1/num2;
}      
else{
    System.out.println("error");    
} 
    return 0;

}

    boolean Restar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}