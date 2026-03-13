package Restaurant;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Mercancia mercancia = new Mercancia(
                "Carne",
                50,
                LocalDate.now(),
                10
        );

        Proveedor proveedor = new Proveedor(
                "Distribuidora Lopez",
                "2721234567",
                "Av Central 45"
        );

        Pedido pedido = new Pedido(
                30,
                LocalDate.now(),
                mercancia,
                proveedor
        );

        pedido.registrarLlegada(30, LocalDate.now());

        System.out.println("Mercancia:");
        System.out.println(mercancia);

        System.out.println("\nProveedor:");
        System.out.println(proveedor);

        System.out.println("\nPedido:");
        System.out.println(pedido);

        if (mercancia.verificarReorden()) {
            System.out.println("\nSe necesita hacer un nuevo pedido.");
        } else {
            System.out.println("\nHay suficiente mercancía.");
        }

    }


}
