
package pampara.jostinexamen.controlador;

import pampara.jostinexamen.modelo.GestionProductos;
import pampara.jostinexamen.modelo.Productos;
import pampara.jostinexamen.vista.Listar;
import pampara.jostinexamen.vista.VistaSistema;

public class Controlador {
    private VistaSistema vista;
    private GestionProductos gestorProductos;
    private Listar listar;

    public Controlador(VistaSistema vista, Listar listar) {
        this.vista = vista;
        this.gestorProductos = new GestionProductos();
        this.listar = listar;
    }
    
    public void agregarTarea() {

        try {
            if (this.vista != null) {
                Productos objproducto = new Productos();
                objproducto.setProducto(this.vista.getProducto());
                objproducto.setPrecio(this.vista.getPrecio());
                objproducto.setDisponible(this.vista.getDisponible());
                String msm = gestorProductos.agregarTarea(objproducto);
                vista.error(msm);

            } else {
                vista.error("Completa los datos!");
            }
        } catch (Exception e) {
            vista.error("Error controlado:" + e);
        }
    }

    public void listarProductos() {

        try {
            String msm = "";
            Productos[] tareas = new Productos[5];
            tareas = gestorProductos.listarProductos();
            if (tareas != null) {
                String lista = "";
                for (int i = 0; i < tareas.length; i++) {
                    if (tareas[i] != null) {
                        lista = lista + "id:" + tareas[i].getId() + "\n"
                                + "Producto:" + tareas[i].getProducto()+ "\n"
                                + "Precio:" + tareas[i].getPrecio()+ "\n"
                                + "Disponibilidad:" + tareas[i].getDisponible()+ "\n";
                    }
                }
                msm = lista;
            } else {
                msm = "No hay datos que mostrar";
            }
            listar.mostrarDatos(msm);

        } catch (Exception e) {
            System.out.println("Error Controlador-listarTarea: " + e);
        }
    }
    
}
