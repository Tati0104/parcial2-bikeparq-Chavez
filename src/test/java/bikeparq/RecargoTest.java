package bikeparq;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
