package chatGPT;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FiguraGeometricaTest {

    @Test
    void testCirculo() {
        Circulo circulo = new Circulo(5);
        assertEquals(Math.PI * 25, circulo.calcularArea(), 0.0001, "Área do círculo incorreta.");
        assertEquals(2 * Math.PI * 5, circulo.calcularCircunferencia(), 0.0001, "Circunferência do círculo incorreta.");
    }

    @Test
    void testRetangulo() {
        Retangulo retangulo = new Retangulo(4, 6);
        assertEquals(24.0, retangulo.calcularArea(), 0.0001, "Área do retângulo incorreta.");
        assertEquals(20.0, retangulo.calcularPerimetro(), 0.0001, "Perímetro do retângulo incorreto.");
    }

    @Test
    void testTriangulo() {
        Triangulo triangulo = new Triangulo(3, 4);
        assertEquals(6.0, triangulo.calcularArea(), 0.0001, "Área do triângulo incorreta.");
        assertEquals(12.0, triangulo.calcularPerimetro(3, 4, 5), 0.0001, "Perímetro do triângulo incorreto.");
    }

    @Test
    void testQuadrado() {
        Quadrado quadrado = new Quadrado(5);
        assertEquals(25.0, quadrado.calcularArea(), 0.0001, "Área do quadrado incorreta.");
        assertEquals(5 * Math.sqrt(2), quadrado.calcularDiagonal(), 0.0001, "Diagonal do quadrado incorreta.");
    }

    @Test
    void testTrapezio() {
        Trapezio trapezio = new Trapezio(8, 5, 4);
        assertEquals(26.0, trapezio.calcularArea(), 0.0001, "Área do trapézio incorreta.");
        assertEquals(25.0, trapezio.calcularPerimetro(8, 5, 6, 6), 0.0001, "Perímetro do trapézio incorreto.");
    }

    @Test
    void testElipse() {
        Elipse elipse = new Elipse(7, 3);
        assertEquals(Math.PI * 7 * 3, elipse.calcularArea(), 0.0001, "Área da elipse incorreta.");
        double a = 7;
        double b = 3;
        double perimetroEsperado = Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
        assertEquals(perimetroEsperado, elipse.calcularPerimetro(), 0.0001, "Perímetro da elipse incorreto.");
    }
}

