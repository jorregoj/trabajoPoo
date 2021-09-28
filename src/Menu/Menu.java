package Menu;
import Laboratorio.*;

import java.io.IOException;
import java.util.List;


public class Menu {
    public static void main(String[] args) throws IOException {
        int opcion;
        System.out.println("Presione Enter para iniciar el programa");
        System.in.read();
        Laboratorio smartlab = Laboratorio.crearLaboratorio();
        do{
            System.out.println("1. Registrar Muestra");
            System.out.println("2. Registrar Lubricante");
            System.out.println("3. Ingresar Resultados");
            System.out.println("4. Mostrar Muestras pendientes");
            System.out.println("5. Obtener Historial de componente");
            System.out.println("6. Finalizar Programa");
            System.out.println();
            opcion = Scanner2.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("Ingrese codigo de muestra");
                    String codigo = Scanner2.nextString();
                    System.out.println("Ingrese nombre Lubricante");
                    String nombreLubricante = Scanner2.nextString();
                    System.out.println("Ingrese Fecha de Muestreo");
                    String fecha = Scanner2.nextString();
                    System.out.println("Ingrese Codigo de equipo");
                    String codigoEquipo = Scanner2.nextString();
                    System.out.println("Ingrese codigo de componente");
                    String codigoComponente = Scanner2.nextString();
                    System.out.println("Ingresar Descripcion de componenete");
                    String descripcionComponente = Scanner2.nextString();
                    Lubricante l = smartlab.buscarAceite(nombreLubricante);
                    Muestra muestra =null;
                    if(descripcionComponente.equalsIgnoreCase("motor")){
                        muestra = new MotorSampleBuilder().ingresarCodigoMuestra(codigo).
                                ingresarLubricante(l).
                                ingresarFechaMuestreo(fecha).
                                ingresarCodigoEquipo(codigoEquipo).
                                ingresarCodigoComponente(codigoComponente).
                                ingresarDescripcionComponente(descripcionComponente).construirMuestra();
                    } else {
                        muestra = new ComponentSampleBuilder().ingresarCodigoMuestra(codigo).
                                ingresarLubricante(l).
                                ingresarFechaMuestreo(fecha).
                                ingresarCodigoEquipo(codigoEquipo).
                                ingresarCodigoComponente(codigoComponente).
                                ingresarDescripcionComponente(descripcionComponente).construirMuestra();
                    }
                    smartlab.registrarMuestra(muestra);
                    break;
                case 2:
                    System.out.println("Ingrese nombre del lubricante");
                    String nombreLubricante2 = Scanner2.nextString();
                    System.out.println("Ingresar viscosidad normal");
                    double viscosidadNormal = Scanner2.nextDouble();
                    Lubricante lubricante = new Lubricante(nombreLubricante2,viscosidadNormal);
                    smartlab.registrarLubricante(lubricante);
                    break;

                case 3:
                    SubmenuResultados.ingresarResultado();
                    break;
                case 4:
                    SubmenuObtenerPendientes.obtenerPendientes();
                    break;
                case 5:
                    System.out.println("Ingrese el codigo del componente");
                    String codigoComponente1 = Scanner2.nextString();
                    List<Muestra> historial = smartlab.obtenerHistorial(codigoComponente1);
                    for(Muestra m : historial){
                        System.out.println(m.getCodigoComponente() + "  " + m.getFechaMuestreo());
                    }
                    System.out.println();

            }
        }while(opcion != 6);

        for(Muestra m : smartlab.getMuestras()){
            System.out.println(m.getLubricante().getViscosidadNormal());
            for(String s : m.listaEstados()){
                System.out.println(s);
            }
        }



    }

}
