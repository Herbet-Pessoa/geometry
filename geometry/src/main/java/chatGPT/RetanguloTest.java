import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    void testCalcularArea() {
        Retangulo retangulo = new Retangulo(4, 6);
        double areaEsperada = 24.0; // largura * altura = 4 * 6
        assertEquals(areaEsperada, retangulo.calcularArea(), 0.0001, "Área do retângulo incorreta.");
    }

    @Test
    void testCalcularPerimetro() {
        Retangulo retangulo = new Retangulo(4, 6);
        double perimetroEsperado = 20.0; // 2 * (4 + 6)
        assertEquals(perimetroEsperado, retangulo.calcularPerimetro(), 0.0001, "Perímetro do retângulo incorreto.");
    }

    @Test
    void testSetLargura() {
        Retangulo retangulo = new Retangulo(4, 6);
        retangulo.setLargura(10);
        assertEquals(10, retangulo.getLargura(), "Largura não foi atualizada corretamente.");
    }

    @Test
    void testSetAltura() {
        Retangulo retangulo = new Retangulo(4, 6);
        retangulo.setAltura(12);
        assertEquals(12, retangulo.getAltura(), "Altura não foi atualizada corretamente.");
    }

    @Test
    void testDimensoesNegativas() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Retangulo(-4, 6);
        });
        String mensagemEsperada = "Largura e altura não podem ser negativas.";
        assertTrue(exception.getMessage().contains(mensagemEsperada));
    }
}
