package Laboratorio;

public class MuestraComponente extends Muestra{

    private double conteoParticulas;
    public MuestraComponente(String codigoMuestra, Lubricante lubricante, String fechaMuestreo, String codigoEquipo, String codigoComponente, String descripcionComponente) {
        super(codigoMuestra, lubricante, fechaMuestreo, codigoEquipo, codigoComponente, descripcionComponente);
    }

    public void ingresarConteoParticulas(double conteoParticulas){
        this.conteoParticulas = conteoParticulas;
    }

    public String verificarOxidacion(){
        double oxidacion = super.getOxidacion();
        if(oxidacion>10){
            return "Critico";
        } else if(oxidacion>5){
            return "Precaucion";
        } else return "Normal";
    }

    public String verificarConteoParticulas(){
        if(conteoParticulas>20){
            return "Critico";
        } else if(conteoParticulas>18){
            return "Precaucion";
        } else return "Normal";
    }
}
