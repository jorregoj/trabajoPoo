package Laboratorio;

public class MuestraMotor extends Muestra{

    private double combustible;

    public MuestraMotor(String codigoMuestra, Lubricante lubricante, String fechaMuestreo,
                        String codigoEquipo, String codigoComponente, String descripcionComponente) {
        super(codigoMuestra, lubricante, fechaMuestreo, codigoEquipo, codigoComponente, descripcionComponente);
    }

    public void ingresarCombustible(double combustible){
        this.combustible = combustible;
    }
    public String verificarOxidacion(){
        double oxidacion = super.getOxidacion();
        if(oxidacion>10){
            return "Critico";
        } else if(oxidacion>5){
            return "Precaucion";
        } else return "Normal";
    }

    public String verificarCombustible(){
        if(combustible>2){
            return "Critico";
        } else if (combustible >1){
            return "Precaucion";
        } else return "Normal";
    }
}
