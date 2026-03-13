package Restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mercancia {
    private String nombre;
    private int existencia;
    private LocalDate fechaUltimaEntrada;
    private int puntoReorden;

    public Mercancia(String nombre, int existencia, LocalDate fechaUltimaEntrada, int puntoReorden) {
        this.nombre = nombre;
        this.existencia = existencia;
        this.fechaUltimaEntrada = fechaUltimaEntrada;
        this.puntoReorden = puntoReorden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExistencia() {
        return existencia;
    }

    public LocalDate getFechaUltimaEntrada() {
        return fechaUltimaEntrada;
    }

    public void setFechaUltimaEntrada(LocalDate fechaUltimaEntrada) {
        this.fechaUltimaEntrada = fechaUltimaEntrada;
    }

    public int getPuntoReorden() {
        return puntoReorden;
    }

    public void setPuntoReorden(int puntoReorden) {
        this.puntoReorden = puntoReorden;
    }

    public void actualizarExistencia(int cantidad) {
        existencia += cantidad;
        fechaUltimaEntrada = LocalDate.now();
    }

    public boolean verificarReorden() {
        return existencia <= puntoReorden;
    }

    @Override
    public String toString() {
        return "Mercancia{" +
                "nombre='" + nombre + '\'' +
                ", existencia=" + existencia +
                ", fechaUltimaEntrada=" + fechaUltimaEntrada +
                ", puntoReorden=" + puntoReorden +
                '}';
    }
}
