
package pryusuarioslist;

import java.util.Scanner;


public class PryUsuariosList {


    public static void main(String[] args) {
/*
  ingrese la cantidad de estudiantes que quiere ingresar: 3;
        ingresar nombre del estudiante 1: kenny;
        ingresar nota del estudiante 1: 5;
        se repite 3 veces
      consultar notas del sexo M
        consultar notas del seno F       
        */
usuarioReportes reportes = new usuarioReportes();
        Scanner entrada = new Scanner(System.in);
int opcion =0; 
int tamano=0;
do{
System.out.println("====GESTION DE ESTUDIANTES===");

    System.out.println(") ngrese la cantidad de estudiantes que desea agregar ");
    System.out.println(") Para finalizar el programa presione 0");
    System.out.print("Entrada: ");
    tamano=entrada.nextInt();
    System.out.println("");
    do{
    System.out.println("====GESTION DE ESTUDIANTES===");
    System.out.println("1) Agregar estudiantes");
        System.out.println("2) Mostrar estudiantes");
    System.out.println("3) Mostrar promedio de los estudiantes masculinos");
    System.out.println("4) mostrar promeido de los estudiantes femeninos ");
    System.out.println("5) salir");
    System.out.println("ENTRADA: ");
opcion = entrada.nextInt();
    System.out.println("");
entrada.nextLine();
switch(opcion){
    case 1:
        System.out.println("Ingrese el nombre del estudiante");
    String nombre= entrada.nextLine();
        System.out.println("Ingrese el sexo del estudiante");
String sexoString = entrada.nextLine();
boolean sexoBoolean=false;
if(sexoString.equalsIgnoreCase("masculino")){
 sexoBoolean = true;
}else{
if(sexoString.equalsIgnoreCase("femenino")){
 sexoBoolean = false;
}
}
        System.out.println("Ingrese la nota del estudiante");
        double nota= entrada.nextDouble();
    modeloEstudiante modelo = new modeloEstudiante(nombre, sexoBoolean, nota);
reportes.agregar(modelo);
        System.out.println("*estudiante agregado exitosamente*");
System.out.println("");

        break;
    case 2: 
        System.out.println("===LISTA DE ESTUDIANTES===");
        reportes.mostrar();
            System.out.println("");
break;

    case 3:
        System.out.print("el promedio de notas masculinas es: ");
reportes.mostrarHombres();
System.out.println("");
   break;
}

}
while(opcion!=5);
}
while(tamano!=0);


    }
    
}
