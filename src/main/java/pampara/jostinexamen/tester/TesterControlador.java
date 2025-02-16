/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pampara.jostinexamen.tester;

import pampara.jostinexamen.modelo.Productos;

/**
 *
 * @author Global Technology Ec
 */
public class TesterControlador {
    public void prueba(Productos objProducto) {
        System.out.println("Titulo: " + objProducto.getProducto());
        System.out.println("Descripcion: " + objProducto.getPrecio());
        System.out.println("Estado: " + objProducto.getDisponible());
    }
}
