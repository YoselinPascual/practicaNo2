package Restaurant;

import java.time.LocalDate;

public class Pedido {
    private float cantidadPedida;
    private LocalDate fechaPedido;
    private float cantidadLlegada;
    private LocalDate fechaLlegada;
    private Proveedor proveedor;
    public Pedido(Proveedor proveedor, float cantidadPedida, LocalDate fechaPedido) {
        this.proveedor = proveedor;
        this.cantidadPedida = cantidadPedida;
        this.fechaPedido = fechaPedido;
        this.cantidadLlegada = 0;
        this.fechaLlegada = null;
    }
    public void registraLlegada(float cantidadLlegada, LocalDate fechaLlegada) {
        this.cantidadLlegada = cantidadLlegada;
        this.fechaLlegada = fechaLlegada;
    }
    public float getCantidadLlegada() {
        return cantidadLlegada;
    }
    public LocalDate getFechaPedido() {
        return fechaPedido;
    }
    public Proveedor getProveedor() {
        return proveedor;
    }
    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }
    @Override
    public String toString() {
        return "Pedido{" +
                "\nProveedor: " + proveedor +
                "\nCantidad Pedida: " + cantidadPedida +
                "\nFecha Pedido: " + fechaPedido +
                "\nCantidad Llegada: " + (cantidadLlegada > 0 ? cantidadLlegada : "Vacio") +
                "\nFecha Llegada: " + (fechaLlegada != null ? fechaLlegada : "Sin fecha de llegada") +
                "\n}";
    }
}
