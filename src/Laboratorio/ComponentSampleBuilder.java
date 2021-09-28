package Laboratorio;

public class ComponentSampleBuilder implements SampleBuilder{

    private String codigoMuestra;
    private Lubricante lubricante;
    private String fechaMuestreo;
    private String codigoEquipo;
    private String codigoComponente;
    private String descripcionComponente;
    private Muestra muestra;

    @Override
    public SampleBuilder ingresarCodigoMuestra(String codigo) {
        this.codigoMuestra = codigo;
        return this;
    }

    @Override
    public SampleBuilder ingresarLubricante(Lubricante lubricante) {
        this.lubricante = lubricante;
        return this;
    }

    @Override
    public SampleBuilder ingresarFechaMuestreo(String fechaMuestreo) {
        this.fechaMuestreo = fechaMuestreo;
        return this;
    }

    @Override
    public SampleBuilder ingresarCodigoEquipo(String codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
        return this;
    }

    @Override
    public SampleBuilder ingresarCodigoComponente(String codigoComponente) {
        this.codigoComponente = codigoComponente;
        return this;
    }

    @Override
    public SampleBuilder ingresarDescripcionComponente(String descripcionComponente) {
        this.descripcionComponente = descripcionComponente;
        return this;
    }

    @Override
    public Muestra construirMuestra() {
        this.muestra = new MuestraComponente(this.codigoMuestra,this.lubricante,this.fechaMuestreo,
                this.codigoEquipo,this.codigoComponente,this.descripcionComponente);
        return muestra;
    }
}
