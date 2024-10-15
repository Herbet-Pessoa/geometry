package chatGPT;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElipseTest {

    @Test
    void testCalcularArea() {
        Elipse elipse = new Elipse(7, 3);
        double areaEsperada = Math.PI * 7 * 3; // π * a * b
        assertEquals(areaEsperada, elipse.calcularArea(), 0.0001, "Área da elipse incorreta.");
    }

    @Test
    void testCalcularPerimetro() {
        Elipse elipse = new Elipse(7, 3);
        double a = 7;
        double b = 3;
        double perimetroEsperado = Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
        assertEquals(perimetroEsperado, elipse.calcularPerimetro(), 0.0001, "Perímetro da elipse incorreto.");
    }

    @Test
    void testDesenhar() {
        Elipse elipse = new Elipse(7, 3);
        // Como o método desenhar() apenas imprime no console, podemos redirecionar a saída padrão para testar
        // No entanto, isso é mais complexo e geralmente não é feito em testes unitários simples
        // Portanto, vamos apenas verificar se o método executa sem lançar exceções
        assertDoesNotThrow(() -> elipse.desenhar(), "Método desenhar() lançou uma exceção.");
    }

    @Test
    void testSetSemiEixoMaior() {
        Elipse elipse = new Elipse(7, 3);
        elipse.setSemiEixoMaior(10);
        assertEquals(10, elipse.getSemiEixoMaior(), "Semieixo maior não foi atualizado corretamente.");
    }

    @Test
    void testSetSemiEixoMenor() {
        Elipse elipse = new Elipse(7, 3);
        elipse.setSemiEixoMenor(5);
        assertEquals(5, elipse.getSemiEixoMenor(), "Semieixo menor não foi atualizado corretamente.");
    }

    @Test
    void testDimensoesNegativas() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Elipse(-7, 3);
        });
        String mensagemEsperada = "Semieixos não podem ser negativos.";
        assertTrue(exception.getMessage().contains(mensagemEsperada));
    }
}

