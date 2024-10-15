package chatGPT;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void testCalcularArea() {
        Circulo circulo = new Circulo(5);
        double areaEsperada = Math.PI * 25; // π * r² = π * 5²
        assertEquals(areaEsperada, circulo.calcularArea(), 0.0001, "Área do círculo incorreta.");
    }

    @Test
    void testCalcularCircunferencia() {
        Circulo circulo = new Circulo(5);
        double circunferenciaEsperada = 2 * Math.PI * 5; // 2 * π * r
        assertEquals(circunferenciaEsperada, circulo.calcularCircunferencia(), 0.0001, "Circunferência do círculo incorreta.");
    }

    @Test
    void testSetRaio() {
        Circulo circulo = new Circulo(5);
        circulo.setRaio(10);
        assertEquals(10, circulo.getRaio(), "Raio não foi atualizado corretamente.");
    }

    @Test
    void testRaioNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Circulo(-5);
        });
        String mensagemEsperada = "Raio não pode ser negativo.";
        assertTrue(exception.getMessage().contains(mensagemEsperada));
    }
}

