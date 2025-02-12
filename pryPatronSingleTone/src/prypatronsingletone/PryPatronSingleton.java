package prypatronsingletone;

import java.util.ArrayList;

public class PryPatronSingleton {

    public static void main(String[] args) {
        Contador contadorMain1 = Contador.getInstancia();
        Contador contadorMain2 = Contador.getInstancia();
        contadorMain1.Incremento();
        contadorMain1.Incremento();
        contadorMain1.Incremento();
        System.out.println("Contador con contadorMain2: " + contadorMain2.regreso());
        System.out.println("Contador con contadorMain1: " + contadorMain1.regreso());
        System.out.println("");

        Configuracion configuracionMain = Configuracion.getInstancia();
        //"ingles,espanol,frances,italiano"
        // oscuro,claro,automatico
        ArrayList<String> listaIdiomas = new ArrayList<>();
        listaIdiomas.add("ingles");
        listaIdiomas.add("espanol");
        listaIdiomas.add("frances");
        listaIdiomas.add("italiano");

        ArrayList<String> listaTema = new ArrayList<>();
        listaTema.add("Oscuro");
        listaTema.add("Claro");
        listaTema.add("Automatico");

        configuracionMain.setIdioma(listaIdiomas.get(0));
        configuracionMain.setTema(listaTema.get(0));

        configuracionMain.MostrarConfiguracion();
        System.out.println("");
        Configuracion configuracionMain2 = Configuracion.getInstancia();
        configuracionMain2.MostrarConfiguracion();
    } //aplicando singleton puede haber dos comandante? NO
}
// aplicar el patron singleton, trabajar con arraylist, 5 ejercicios en un solo proyecto