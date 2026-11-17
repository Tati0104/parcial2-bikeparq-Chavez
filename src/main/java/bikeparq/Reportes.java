package bikeparq;

import java.util.List;

public class Reportes {

    public static Resumen resumenDelDia(List<Registro> registros) {
        int totalRecaudado = 0;
        int cantidadCarros = 0;
        int cantidadMotos = 0;
        for (Registro registro : registros) {
            boolean esCarro = "carro".equals(registro.tipo());
            boolean esMoto = "moto".equals(registro.tipo());
            if (esCarro) {
                cantidadCarros++;
            }
            if (esMoto) {
                cantidadMotos++;
            }
            if (esCarro || esMoto) {
                totalRecaudado += registro.valor();
            }
        }
        return new Resumen(totalRecaudado, cantidadCarros, cantidadMotos);
    }

    public static int mayorCobro(List<Registro> registros) {
        int cobroMayor = 0;
        for (Registro registro : registros) {
            if (registro.valor() > cobroMayor) {
                cobroMayor = registro.valor();
            }
        }
        return cobroMayor;
    }
}
