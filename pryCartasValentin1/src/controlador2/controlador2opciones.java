/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador2;

import controlador.BuzonSanValentinSingleton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.pantallaVista;


public class controlador2opciones {
   private pantallaVista vista;
   private BuzonSanValentinSingleton buzon;

    public controlador2opciones(pantallaVista vista, BuzonSanValentinSingleton buzon) {
        this.vista = vista;
        this.buzon = buzon;
    
 }

}