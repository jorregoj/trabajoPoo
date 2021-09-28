package Laboratorio;

public interface SampleBuilder {
    SampleBuilder ingresarCodigoMuestra(String codigo);
    SampleBuilder ingresarLubricante(Lubricante lubricante);
    SampleBuilder ingresarFechaMuestreo(String fechaMuestreo);
    SampleBuilder ingresarCodigoEquipo(String codigoEquipo);
    SampleBuilder ingresarCodigoComponente(String codigoComponente);
    SampleBuilder ingresarDescripcionComponente(String descripcionComponente);
    Muestra construirMuestra();
}
