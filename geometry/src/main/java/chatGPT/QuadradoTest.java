package chatGPT;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {

    @Test
    void testCalcularArea() {
        Quadrado quadrado = new Quadrado(5);
        double areaEsperada = 25.0; // lado² = 5²
        assertEquals(areaEsperada, quadrado.calcularArea(), 0.0001, "Área do quadrado incorreta.");
    }

    @Test
    void testCalcularDiagonal() {
        Quadrado quadrado = new Quadrado(5);
        double diagonalEsperada = 5 * Math.sqrt(2); // lado * √2
        assertEquals(diagonalEsperada, quadrado.calcularDiagonal(), 0.0001, "Diagonal do quadrado incorreta.");
    }

    @Test
    void testSetLado() {
        Quadrado quadrado = new Quadrado(5);
        quadrado.setLado(10);
        assertEquals(10, quadrado.getLado(), "Lado não foi atualizado corretamente.");
    }

    @Test
    void testLadoNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Quadrado(-5);
        });
        String mensagemEsperada = "Lado não pode ser negativo.";
        assertTrue(exception.getMessage().contains(mensagemEsperada));
    }

    @Test
    void testCalcularPerimetro() {
        Quadrado quadrado = new Quadrado(5);
        double perimetroEsperado = 20.0; // 4 * lado = 4 * 5
        assertEquals(perimetroEsperado, quadrado.getLado() * 4, 0.0001, "Perímetro do quadrado incorreto.");
    }
}

