package Laboratorio;

public class Lubricante {
    private String nombreLubricante;
    private double viscosidadNormal;

    public Lubricante(String nombreLubricante, double viscosidadNormal) {
        this.nombreLubricante = nombreLubricante;
        this.viscosidadNormal = viscosidadNormal;
    }

    public String getNombreLubricante() {
        return nombreLubricante;
    }

    public double getViscosidadNormal() {
        return viscosidadNormal;
    }
}
