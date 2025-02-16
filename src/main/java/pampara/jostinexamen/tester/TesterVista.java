/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pampara.jostinexamen.tester;

import pampara.jostinexamen.vista.VistaSistema;

/**
 *
 * @author Global Technology Ec
 */
public class TesterVista {
    
    private VistaSistema vista;

    public TesterVista(VistaSistema vista) {
        this.vista = vista;
    }

    public void prueba() {
        //Principal principal=new Principal();
        try {
            System.out.println("Titulo: " + vista.getProducto());
            System.out.println("Descripcion: " + vista.getPrecio());
            System.out.println("Estado: " + vista.getDisponible());

        } catch (NumberFormatException e) {
            
        }
    }  
}
