
package peyusoarralylist2;

import java.util.ArrayList;


public class PeyUSOARRALYLIST2 {

    public static void main(String[] args) {

        ArrayList<String> listaEstudiantes = new ArrayList<>();
/*
        listaEstudiantes.add("ANA");
        listaEstudiantes.add("PEDRO");
        listaEstudiantes.add("LUIS");
        listaEstudiantes.set(0, "ANITA");
        String v_luis = listaEstudiantes.get(2);
        System.out.println(v_luis);         

        //repetir 200 veces la sintaxis de declarar un arraylist         
        // String nombre[] =new String [2];           
        // 100 cada uno
        // String nombre1[]={"er","wewe","3we"};   
*/

ArrayList<Integer> numerosParesInt = new ArrayList<>(); 

numerosParesInt.add(2);
numerosParesInt.add(4);
numerosParesInt.add(6);

int nPares[]={2,4,6};

        for (int nPare : nPares) {
            System.out.print(nPare+" ");
        }
        
        System.out.println(""); 
        System.out.println("===============");
        
 ArrayList<Double> numerosParesDouble = new ArrayList<>(); 

numerosParesDouble.add(2.3);
numerosParesDouble.add(3.5);
numerosParesDouble.add(5.4);

double nPares1[]={2.3,3.5,5.6};

        for (double nPare : numerosParesDouble) {
            System.out.print(nPare+" ");
        }
         
    }    
}