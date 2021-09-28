package Laboratorio;

import java.util.ArrayList;
import java.util.List;

public class MuestraComponente extends Muestra{

    public MuestraComponente(String codigoMuestra, Lubricante lubricante, String fechaMuestreo, String codigoEquipo, String codigoComponente, String descripcionComponente) {
        super(codigoMuestra, lubricante, fechaMuestreo, codigoEquipo, codigoComponente, descripcionComponente);
    }

    public String verificarOxidacion(){
        double oxidacion = super.getOxidacion();
        if(oxidacion < 0) return "En proceso";
        if(oxidacion>1){
            return "Critico";
        } else if(oxidacion>0.5){
            return "Precaucion";
        } else return "Normal";
    }

    @Override
    public String verificarContenidoFe() {
        double contenidoFe = super.getContenidoFe();
        if(contenidoFe < 0) return "En proceso";
        if(contenidoFe>=25){
            return "Critico";
        } else if(contenidoFe>20){
            return "Precaucion";
        } else return "Normal";
    }

    @Override
    public String verificarContenidoPb() {
        double contenidoPb = super.getContenidoPb();
        if(contenidoPb < 0) {
            return "En proceso";
        } else if(contenidoPb >5){
            return "Critico";
        } else if(contenidoPb>3){
            return "Precaucion";
        } else return "Normal";
    }

    public List<String> listaEstados(){
        List<String> estados = new ArrayList<>();
        estados.add(verificarViscosidad());
        estados.add(this.verificarOxidacion());
        estados.add(this.verificarContenidoFe());
        estados.add(this.verificarContenidoPb());
        return estados;
    }

    @Override
    public String obtenerEstado() {
        for(String s : listaEstados()) {
            if (s.equalsIgnoreCase("En proceso")) return "En proceso";
        }
        for(String s:listaEstados()){
            if(s.equalsIgnoreCase("critico")) {
                return "critico";
            }
        }
        for(String s:listaEstados()){
            if(s.equalsIgnoreCase("Precaucion")){
                return "precaucion";
            }
        }
        return "normal";
    }


}
