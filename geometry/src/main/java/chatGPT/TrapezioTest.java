package chatGPT;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrapezioTest {

    @Test
    void testCalcularArea() {
        Trapezio trapezio = new Trapezio(8, 5, 4);
        double areaEsperada = ((8 + 5) * 4) / 2; // ((baseMaior + baseMenor) * altura) / 2
        assertEquals(areaEsperada, trapezio.calcularArea(), 0.0001, "Área do trapézio incorreta.");
    }

    @Test
    void testCalcularPerimetroValido() {
        Trapezio trapezio = new Trapezio(8, 5, 4);
        double perimetroEsperado = 25.0; // 8 + 5 + 6 + 6
        assertEquals(perimetroEsperado, trapezio.calcularPerimetro(8, 5, 6, 6), 0.0001, "Perímetro do trapézio incorreto.");
    }

    @Test
    void testSetBaseMaior() {
        Trapezio trapezio = new Trapezio(8, 5, 4);
        trapezio.setBaseMaior(10);
        assertEquals(10, trapezio.getBaseMaior(), "Base maior não foi atualizada corretamente.");
    }

    @Test
    void testSetBaseMenor() {
        Trapezio trapezio = new Trapezio(8, 5, 4);
        trapezio.setBaseMenor(7);
        assertEquals(7, trapezio.getBaseMenor(), "Base menor não foi atualizada corretamente.");
    }

    @Test
    void testSetAltura() {
        Trapezio trapezio = new Trapezio(8, 5, 4);
        trapezio.setAltura(6);
        assertEquals(6, trapezio.getAltura(), "Altura não foi atualizada corretamente.");
    }

    @Test
    void testDescricacao() {
        Trapezio trapezio = new Trapezio(8, 5, 4);
        String descricaoEsperada = "Trapézio com base maior 8.0, base menor 5.0 e altura 4.0";
        assertEquals(descricaoEsperada, trapezio.descricao(), "Descrição do trapézio incorreta.");
    }

    @Test
    void testDimensoesNegativas() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Trapezio(-8, 5, 4);
        });
        String mensagemEsperada = "Bases e altura não podem ser negativas.";
        assertTrue(exception.getMessage().contains(mensagemEsperada));
    }
}

