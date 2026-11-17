package bikeparq;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TarifaTest {

    @Test
    void cp01CarroSesentaMinutosPagaTresMil() {
        // Preparar
        int minutos = 60;
        String tipo = "carro";

        // Ejecutar
        int tarifa = Tarifa.calcularTarifa(minutos, tipo);

        // Verificar
        assertEquals(3000, tarifa);
    }

    @Test
    void cp02MotoDiezMinutosNoPagaPorTiempoDeGracia() {
        // Preparar
        int minutos = 10;
        String tipo = "moto";

        // Ejecutar
        int tarifa = Tarifa.calcularTarifa(minutos, tipo);

        // Verificar
        assertEquals(0, tarifa);
    }

    @Test
    void cp03TipoBicicletaLanzaIllegalArgumentException() {
        // Preparar
        int minutos = 60;
        String tipo = "bicicleta";

        // Ejecutar y verificar
        assertThrows(IllegalArgumentException.class,
                () -> Tarifa.calcularTarifa(minutos, tipo));
    }
}
