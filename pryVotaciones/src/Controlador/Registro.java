
package Controlador;

import Modelo.Candidato;
import Modelo.Ciudadano;
import java.util.ArrayList;



public class Registro {

    ArrayList<Ciudadano> listaNoboa = new ArrayList<>();
    ArrayList<Ciudadano> listaLuisa = new ArrayList<>();
    ArrayList<Ciudadano> listaAndrea = new ArrayList<>();

public void agregarNoboa(Ciudadano ciudadanoAgregado){
    listaNoboa.add(ciudadanoAgregado);
}

public void mostrarNoboa(){

    for(Ciudadano ciudadanoMostrar : listaNoboa){
    System.out.println(ciudadanoMostrar);    
}
}
public int cantidadVotosNoboa(){
int votosNoboa = listaNoboa.size();
    return votosNoboa;
}

public void agregarLuisa(Ciudadano ciudadanoAgregado){
    listaLuisa.add(ciudadanoAgregado);
}

public void mostrarLuisa(){
for(Ciudadano ciudadanoMostrar : listaLuisa){
    System.out.println(ciudadanoMostrar);    
}
}

public int cantidadVotosLuisa(){
int votosLuisa = listaLuisa.size();
    return votosLuisa;
}

public void agregarAndrea(Ciudadano ciudadanoAgregado){
    listaAndrea.add(ciudadanoAgregado);
}

public void mostrarAndrea(){
for(Ciudadano ciudadanoMostrar: listaAndrea){
    System.out.println(ciudadanoMostrar);    
}
}

public int cantidadVotosAndrea(){
int votosAndrea = listaAndrea.size();
    return votosAndrea;
}

public double porcentajeNoboa(){
double total = listaAndrea.size()+listaLuisa.size()+listaNoboa.size();
    double porcentaje = (listaNoboa.size()/total)*100;

return porcentaje;
}

public double porcentajeLuisa(){
double total = listaAndrea.size()+listaLuisa.size()+listaNoboa.size();
    double porcentaje = (listaLuisa.size()/total)*100;

return porcentaje;
}

public double porcentajeAndrea(){
double total = listaAndrea.size()+listaLuisa.size()+listaNoboa.size();
    double porcentaje = (listaAndrea.size()/total)*100;

return porcentaje;
}
}