

package pryarray;


public class PryArray {


    public static void main(String[] args) {
int tamanoNotas=10;
        
boolean resultados[]={true,false,true,false};
double[] notas={100,90,80,70};

String dias1[] ={"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
String[] dias ={"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};

boolean resultado1= resultados[2];
double nota1= notas[2];
String dia1= dias[5];

        System.out.println(resultado1+"\n");
        System.out.println(nota1+"\n");
        System.out.println(dia1+"\n");
        System.out.println(notas.length+"\n");        
        
for(int i=0;i<dias.length;i++){    
System.out.print(dias[i]+" ");
}
        System.out.println("\n");

        for(String dia : dias){
    System.out.print(dia+" ");    
}

        System.out.println("\n");

        for(String dia : dias){
 if(dia.equals("jueves")){
     System.out.println("HOY ES JUEVES");    
 }
}

}
}