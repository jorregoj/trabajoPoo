package Laboratorio;

public abstract class Muestra {
    private String codigoMuestra;
    private Lubricante lubricante;
    private String fechaMuestreo;
    private String codigoEquipo;
    private String codigoComponente;
    private String descripcionComponente;
    private double viscosidad;
    private double contenidoFe;
    private double contenidoPb;
    private double oxidacion;


    public Muestra(String codigoMuestra, Lubricante lubricante, String fechaMuestreo, String codigoEquipo,
                   String codigoComponente, String descripcionComponente) {
        this.codigoMuestra = codigoMuestra;
        this.lubricante = lubricante;
        this.fechaMuestreo = fechaMuestreo;
        this.codigoEquipo = codigoEquipo;
        this.codigoComponente = codigoComponente;
        this.descripcionComponente = descripcionComponente;
    }

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
    public String verificarViscosidad(){
        double vnormal= lubricante.getViscosidadNormal();
        double diferencia = Math.abs(vnormal-viscosidad);
        if(diferencia<=0.7){
            return "Normal";
        } else if(diferencia<=1.2){
            return "Precaucion";
        } else return "Critico";
    }

    public String verificarContenidoFe(){
        if(contenidoFe>50){
            return "Critico";
        } else if(contenidoFe>25){
            return "Precaucion";
        } else return("Normal");
    }

    public String verificarContenidoPb(){
        if(contenidoPb>10){
            return "Critico";
        } else if(contenidoFe>5){
            return "Precaucion";
        } else return("Normal");
    }

    public abstract String verificarOxidacion();

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
