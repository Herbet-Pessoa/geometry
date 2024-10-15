import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {

    @Test
    void testCalcularArea() {
        Triangulo triangulo = new Triangulo(3, 4);
        double areaEsperada = 6.0; // (base * altura) / 2 = (3 * 4) / 2
        assertEquals(areaEsperada, triangulo.calcularArea(), 0.0001, "Área do triângulo incorreta.");
    }

    @Test
    void testCalcularPerimetroValido() {
        Triangulo triangulo = new Triangulo(3, 4);
        double perimetroEsperado = 12.0; // 3 + 4 + 5
        assertEquals(perimetroEsperado, triangulo.calcularPerimetro(3, 4, 5), 0.0001, "Perímetro do triângulo incorreto.");
    }

    @Test
    void testCalcularPerimetroInvalido() {
        Triangulo triangulo = new Triangulo(3, 4);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            triangulo.calcularPerimetro(1, 2, 3); // Não forma um triângulo válido
        });
        String mensagemEsperada = "Os lados fornecidos não formam um triângulo válido.";
        assertTrue(exception.getMessage().contains(mensagemEsperada));
    }

    @Test
    void testSetBase() {
        Triangulo triangulo = new Triangulo(3, 4);
        triangulo.setBase(6);
        assertEquals(6, triangulo.getBase(), "Base não foi atualizada corretamente.");
    }

    @Test
    void testSetAltura() {
        Triangulo triangulo = new Triangulo(3, 4);
        triangulo.setAltura(8);
        assertEquals(8, triangulo.getAltura(), "Altura não foi atualizada corretamente.");
    }

    @Test
    void testDimensoesNegativas() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(-3, 4);
        });
        String mensagemEsperada = "Base e altura não podem ser negativas.";
        assertTrue(exception.getMessage().contains(mensagemEsperada));
    }
}
