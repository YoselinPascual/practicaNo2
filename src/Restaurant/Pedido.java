package Restaurant;

import java.time.LocalDate;

public class Pedido {
    private int cantidadPedida;
    private LocalDate fechaPedido;
    private int cantidadLlegada;
    private LocalDate fechaLlegada;
    private Mercancia mercancia;
    private Proveedor proveedor;
    public Pedido(int cantidadPedida, LocalDate fechaPedido, Mercancia mercancia, Proveedor proveedor) {
        this.cantidadPedida = cantidadPedida;
        this.fechaPedido = fechaPedido;
        this.mercancia = mercancia;
        this.proveedor = proveedor;
    }
    public int getCantidadPedida() {
        return cantidadPedida;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }
    public int getCantidadLlegada() {
        return cantidadLlegada;
    }
    public void setCantidadLlegada(int cantidadLlegada){
        this.cantidadLlegada=cantidadLlegada;
    }
    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }
    public void setFechaLlegada(LocalDate fechaLlegada){
        this.fechaLlegada=fechaLlegada;
    }
    public Mercancia getMercancia() {
        return mercancia;
    }
    public Proveedor getProveedor() {
        return proveedor;
    }
    public void registrarLlegada(int cantidadLlegada, LocalDate fechaLlegada) {
        this.cantidadLlegada = cantidadLlegada;
        this.fechaLlegada = fechaLlegada;
        mercancia.actualizarExistencia(cantidadLlegada);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cantidadPedida=" + cantidadPedida +
                ", fechaPedido=" + fechaPedido +
                ", cantidadLlegada=" + cantidadLlegada +
                ", fechaLlegada=" + fechaLlegada +
                ", mercancia=" + mercancia +
                ", proveedor=" + proveedor +
                '}';
    }
}
