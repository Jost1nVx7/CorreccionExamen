package pampara.jostinexamen.modelo;

public class GestionProductos {
    
    int tamanoVector = 5;
    Productos[] tareas = new Productos[tamanoVector];
    int cont = 0;
    
    public String agregarTarea(Productos producto) {
        String msg = "Ingreso exitoso";
        if (tareas.length != cont) {
            for (int i = 0; i < tareas.length; i++) {
                if (tareas[i] == null) {
                    //inicializar el objeto
                    tareas[i] = new Productos();
                    tareas[i].setId(i);
                    tareas[i].setProducto(producto.getProducto());
                    tareas[i].setPrecio(producto.getPrecio());
                    tareas[i].setDisponible(producto.getDisponible());
                    cont++;
                    //con esto me aseguro que los datos solo se ingresen una vez en el vector. 
                    return msg;
                }
            }
        } else {
                msg = "Ingreso no permitido, el vector esta lleno";
        }
        return msg;
    }

    public Productos[] listarProductos() {

        Productos[] auxProductos = new Productos[tamanoVector];
        for (int i = 0; i < cont; i++) {

            //if (tareas[i].getEstado()) {
            auxProductos[i] = new Productos();
            auxProductos[i].setId(tareas[i].getId());
            auxProductos[i].setProducto(tareas[i].getProducto());
            auxProductos[i].setPrecio(tareas[i].getPrecio());
            auxProductos[i].setDisponible(tareas[i].getDisponible());
            System.out.println("Modelo-listarProducto" + auxProductos[i].getDisponible());
            // }
        }
        return auxProductos;
    }
    
}