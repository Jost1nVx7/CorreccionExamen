package pampara.jostinexamen.modelo;

public class Productos {
    
    private int id;
    private String producto;
    private String precio;
    private boolean disponible;

    public Productos() {
    }

    public Productos(int id, String producto, String precio, boolean disponible) {
        this.id = id;
        this.producto = producto;
        this.precio = precio;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    
}
