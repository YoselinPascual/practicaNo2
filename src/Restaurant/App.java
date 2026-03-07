package Restaurant;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Proveedor proveedor1 = new Proveedor("Carlos", "2721234567", "Orizaba");
        Mercancia mercancia1 = new Mercancia(
                "Carne",
                50,
                LocalDate.of(2026,3,7),
                20
        );
        mercancia1.agregarProveedor(proveedor1);
        Pedido pedido1 = new Pedido(
                proveedor1,
                30,
                LocalDate.of(2026,3,7)
        );
        mercancia1.agregarPedido(pedido1);
        System.out.println("PEDIDO ANTES DE LLEGAR");
        System.out.println(pedido1);
        pedido1.registraLlegada(30, LocalDate.of(2026,3,8));
        mercancia1.actualizarExistencia(30, LocalDate.of(2026,3,8));
        System.out.println("\nPEDIDO DESPUES DE LLEGAR");
        System.out.println(pedido1);
        System.out.println("\nINFORMACION DE MERCANCIA");
        System.out.println(mercancia1);

    }
}
