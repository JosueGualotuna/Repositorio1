/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryarray2;

/**
 *
 * @author Laboratorios DCCO
 */
public class PryArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

double numeros[]={2,5,8,9,25};
        System.out.println("TABLA DE MULTIPLICAR POR 2");
for(int i=0;i<numeros.length;i++){
    System.out.println(numeros[i]+" x "+"2 = "+numeros[i]*2);   
   
}

        System.out.println("\nTABLA DE MULTIPLICAR POR 2 (MENOR A 20)");

for(int i=0;i<numeros.length;i++){
if(numeros[i]*2<=20){
     System.out.println(numeros[i]+" x "+"2 = "+numeros[i]*2);   
   
}
   
}




    }
    
}
