package Menu;

import Laboratorio.*;

public class SubmenuResultados {
    public static void ingresarResultado(){

        Laboratorio smartlab = Laboratorio.crearLaboratorio();
        int opcion2;

        System.out.println("Ingrese codigo de muestra");
        Muestra muestraBuscada = null;
        String codigo2 = Scanner2.nextString();
        for(Muestra m : smartlab.getMuestras()){
            if(m.getCodigoMuestra().equals(codigo2)){
                muestraBuscada=m;
            }
        }
        do{
            System.out.println("1. Ingresar viscosidad");
            System.out.println("2. Ingresar Fe");
            System.out.println("3. Ingresar Pb");
            System.out.println("4. Ingresar oxidacion");
            System.out.println("5. Regresar al menú Principal");
            opcion2 = Scanner2.nextInt();
            switch (opcion2)
            {
                case 1:
                    double viscosidadIn = Scanner2.nextDouble();
                    muestraBuscada.ingresarViscosidad(viscosidadIn);
                    break;
                case 2:
                    double FeIn = Scanner2.nextDouble();
                    muestraBuscada.ingresarContenidoFe(FeIn);
                    break;
                case 3:
                    double PbIn = Scanner2.nextDouble();
                    muestraBuscada.ingresarContenidoPb(PbIn);
                    break;
                case 4:
                    System.out.println("Ingrese Oxidacion");
                    double OxIn = Scanner2.nextDouble();
                    muestraBuscada.ingresarOxidacion(OxIn);
                    break;
            }
        }while(opcion2 !=5);


    }
}
