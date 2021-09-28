package Menu;

import Laboratorio.*;

import java.util.List;

public class SubmenuObtenerPendientes {

    public static void obtenerPendientes(){
        Laboratorio smartlab = Laboratorio.crearLaboratorio();
        int opcion3;
        List<Muestra> pendientes1 = smartlab.muestrasPendientes();
        System.out.println("Las muestras pendientes son: ");
        for(Muestra m:pendientes1){
            System.out.println(m.getCodigoMuestra());
        }
    }


}
