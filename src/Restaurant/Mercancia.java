package Restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mercancia {
    private String nombre;
    private float existencia;
    private LocalDate fechaUltimaEntrada;
    private float puntoReorden;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<Pedido> pedidos;
    public Mercancia(String nombre, float existencia, LocalDate fechaUltimaEntrada, float puntoReorden) {
        this.nombre = nombre;
        this.existencia = existencia;
        this.fechaUltimaEntrada = fechaUltimaEntrada;
        this.puntoReorden = puntoReorden;

        proveedores = new ArrayList<>();
        pedidos = new ArrayList<>();
    }
    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }
    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    public void actualizarExistencia(float cantidadLlegada, LocalDate fechaLlegada) {
        existencia += cantidadLlegada;
        fechaUltimaEntrada = fechaLlegada;
    }
}
