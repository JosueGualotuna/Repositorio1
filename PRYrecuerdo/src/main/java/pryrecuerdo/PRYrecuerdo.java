
package pryrecuerdo;

import java.util.Scanner;
public class PRYrecuerdo {

    public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
Scanner entradachico = new Scanner(System.in);
Scanner entrada1 = new Scanner (System.in);
Scanner entradachica = new Scanner(System.in);

System.out.print("Ingrese la cantidad de recuerdos del chico: ");
int nchico = entrada.nextInt();

System.out.println("Ingrese los "+nchico+" recuerdos " );
String[] rchico = new String [nchico];
String auxchico;

for(int i=0;i<rchico.length ;i++){
System.out.print("Ingrese el recuerdo "+(i+1)+" del chico: ");
auxchico =entradachico.nextLine();
rchico[i] =auxchico;
            }
        System.out.println("\n");
    System.out.print("Ingrese la cantidad de recuerdos de la chica: ");
 int nchica = entrada1.nextInt();
 
        System.out.println(" Ingrese los recuerdos de la chica" );
String [] rchica = new String[nchica];
String auxchica;


        for(int i=0;i<rchica.length ;i++){
            System.out.print("Ingrese el recuerdo "+(i+1)+" de la chica: ");           
        auxchica=entradachica.nextLine();
          rchica[i]=  auxchica  ;
        }        
          System.out.println("\n");
        System.out.println("MEZCLAR RECUERDOS");
        System.out.print("Ingrese la posicion del recuerdo del chico: ");
        Scanner mixchicoscanner = new Scanner(System.in);
                int mixchico=mixchicoscanner.nextInt();
System.out.print("Ingrese la posicion del recuerdo de la chica: ");
        Scanner mixchicascanner = new Scanner(System.in);
                int mixchica=mixchicascanner.nextInt();
                
        System.out.println("La mezcla de recuerdos es: "+rchico[mixchico]+" y "+rchica[mixchica]);
    }
}
