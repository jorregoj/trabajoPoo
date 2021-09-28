package Laboratorio;

import java.util.ArrayList;
import java.util.List;

public abstract class Muestra {
    private String codigoMuestra;
    private Lubricante lubricante;
    private String fechaMuestreo;
    private String codigoEquipo;
    private String codigoComponente;
    private String descripcionComponente;
    private String Estado = "En proceso";
    private double viscosidad=-1;
    private double contenidoFe=-1;
    private double contenidoPb=-1;
    private double oxidacion=-1;



    public Muestra(String codigoMuestra, Lubricante lubricante, String fechaMuestreo, String codigoEquipo,
                   String codigoComponente, String descripcionComponente) {
        this.codigoMuestra = codigoMuestra;
        this.lubricante = lubricante;
        this.fechaMuestreo = fechaMuestreo;
        this.codigoEquipo = codigoEquipo;
        this.codigoComponente = codigoComponente;
        this.descripcionComponente = descripcionComponente;
    }

    //Metodos para ingresar resultados de los ensayos
    public void ingresarViscosidad(double viscosidad){
        this.viscosidad = viscosidad;
    }

    public void ingresarContenidoFe(double contenidoFe){
        this.contenidoFe = contenidoFe;
    }

    public void ingresarContenidoPb(double contenidoPb){
        this.contenidoPb = contenidoPb;
    }

    public void ingresarOxidacion(double oxidacion){
        this.oxidacion = oxidacion;
    }
    /* Obtener estado de ensayos. En algunos casos dependera si la muestra es motor, o componente. En el caso de
    la viscosidad, dependera del tipo de aceite. */

    public String verificarViscosidad(){
        if(this.viscosidad<0){
            return "En Proceso";
        }
        double vnormal= lubricante.getViscosidadNormal();
        double diferencia = Math.abs(vnormal-this.viscosidad);
        if(diferencia<=0.7){
            return "Normal";
        } else if(diferencia<=1.2){
            return "Precaucion";
        } else return "Critico";
    }

    public abstract String verificarContenidoFe();

    public abstract String verificarContenidoPb();

    public abstract String verificarOxidacion();

    //Método para obtener estado de la muestra

    public abstract List<String> listaEstados();

    public abstract String obtenerEstado();

    //getters & setters

    public String getCodigoMuestra() {
        return codigoMuestra;
    }

    public void setCodigoMuestra(String codigoMuestra) {
        this.codigoMuestra = codigoMuestra;
    }

    public Lubricante getLubricante() {
        return lubricante;
    }

    public void setLubricante(Lubricante lubricante) {
        this.lubricante = lubricante;
    }

    public String getFechaMuestreo() {
        return fechaMuestreo;
    }

    public void setFechaMuestreo(String fechaMuestreo) {
        this.fechaMuestreo = fechaMuestreo;
    }

    public String getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(String codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public String getCodigoComponente() {
        return codigoComponente;
    }

    public void setCodigoComponente(String codigoComponente) {
        this.codigoComponente = codigoComponente;
    }

    public String getDescripcionComponente() {
        return descripcionComponente;
    }

    public void setDescripcionComponente(String descripcionComponente) {
        this.descripcionComponente = descripcionComponente;
    }


    public double getViscosidad() {
        return viscosidad;
    }

    public void setViscosidad(double viscosidad) {
        this.viscosidad = viscosidad;
    }

    public double getContenidoFe() {
        return contenidoFe;
    }

    public void setContenidoFe(double contenidoFe) {
        this.contenidoFe = contenidoFe;
    }

    public double getContenidoPb() {
        return contenidoPb;
    }

    public void setContenidoPb(double contenidoPb) {
        this.contenidoPb = contenidoPb;
    }

    public double getOxidacion() {
        return oxidacion;
    }

    public void setOxidacion(double oxidacion) {
        this.oxidacion = oxidacion;
    }

}
