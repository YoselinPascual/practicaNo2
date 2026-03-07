package Restaurant;

public class Proveedor {
    private String nombre;
    private String telefono;
    private String direccion;
    public Proveedor(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public String obtenerNombre() {
        return nombre;
    }
    public String obtenerTelefono() {
        return telefono;
    }
    public String obtenerDireccion() {
        return direccion;
    }
    public String toString() {
        return "Proveedor: " + nombre +  ", Telefono: " + telefono + ", Direccion: " + direccion;
    }
}
