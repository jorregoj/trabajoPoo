package Laboratorio;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {
    private List<Muestra> muestras;
    private List<Lubricante> lubricantes;
    private static Laboratorio smartlab = new Laboratorio();

    private Laboratorio(){
        muestras = new ArrayList<>();
        lubricantes = new ArrayList<>();
    }

    public static Laboratorio crearLaboratorio(){
        return smartlab;
    }

    public void registrarMuestra(Muestra muestra){
        muestras.add(muestra);
    }

    public void registrarLubricante(Lubricante lubricante){
        lubricantes.add(lubricante);
    }

    public Lubricante buscarAceite(String nombreAceite){
        for(Lubricante l:lubricantes){
            if(l.getNombreLubricante().equalsIgnoreCase(nombreAceite)){
                return l;
            }
        }
        return null;
    }

    public List<Muestra> obtenerHistorial(String codigoComponente){
        List<Muestra> historial = new ArrayList<Muestra>();
        for(Muestra m : muestras){
            if(m.getCodigoComponente().equalsIgnoreCase(codigoComponente)){
                historial.add(m);
            }
        }
        return historial;
    }

    public List<Muestra> muestrasPendientes(){
        List<Muestra> pendientes=new ArrayList<>();
        for(Muestra m : muestras){
            if(m.obtenerEstado().equalsIgnoreCase("En proceso")){
                pendientes.add(m);
            }
        }
        return pendientes;
    }

    public List<Lubricante> getLubricantes() {
        return lubricantes;
    }

    public List<Muestra> getMuestras() {
        return muestras;
    }

}
