package Laboratorio;

public class Director {
    public static void main(String[] args) {
        Lubricante lubricante1 = new Lubricante("delvac",15);
        Muestra muestra1 = new MotorSampleBuilder().ingresarCodigoMuestra("122").ingresarCodigoComponente("cd").
                ingresarCodigoComponente("motor12").ingresarCodigoEquipo("v412").ingresarFechaMuestreo("05/08/2021")
                .ingresarDescripcionComponente("hidraulico").construirMuestra();
    }
}