package bikeparq;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class RecargoTest {

    @Test
    void tarifaTresMilALas22PagaCincoMil() {
        // Preparar
        int tarifa = 3000;
        int horaEntrada = 22;

        // Ejecutar
        int total = Recargo.aplicarRecargoNocturno(tarifa, horaEntrada);

        // Verificar
        assertEquals(5000, total);
    }

    @Test
    void tarifaTresMilALas10NoTieneRecargo() {
        // Preparar
        int tarifa = 3000;
        int horaEntrada = 10;

        // Ejecutar
        int total = Recargo.aplicarRecargoNocturno(tarifa, horaEntrada);

        // Verificar
        assertEquals(3000, total);
    }

    @Test
    void tarifaCeroALas23NoTieneRecargo() {
        // Preparar
        int tarifa = 0;
        int horaEntrada = 23;

        // Ejecutar
        int total = Recargo.aplicarRecargoNocturno(tarifa, horaEntrada);

        // Verificar
        assertEquals(0, total);
    }

    @Test
    void hora24LanzaIllegalArgumentException() {
        // Preparar
        int tarifa = 3000;
        int horaEntrada = 24;

        // Ejecutar y verificar
        assertThrows(IllegalArgumentException.class,
                () -> Recargo.aplicarRecargoNocturno(tarifa, horaEntrada));
    }
}
