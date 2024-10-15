package org.example;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias das figuras
        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Triangulo triangulo = new Triangulo(3, 4);
        Quadrado quadrado = new Quadrado(5);
        Trapezio trapezio = new Trapezio(8, 5, 4);
        Elipse elipse = new Elipse(7, 3);

        // Calculando e exibindo as áreas
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
        System.out.println("Área do Quadrado: " + quadrado.calcularArea());
        System.out.println("Área do Trapézio: " + trapezio.calcularArea());
        System.out.println("Área da Elipse: " + elipse.calcularArea());


        // Circulo
        System.out.println("Circunferência do Círculo: " + circulo.calcularCircunferencia());

        // Retangulo
        System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro());

        // Triangulo
        try {
            double perimetroTriangulo = triangulo.calcularPerimetro(3, 4, 5);
            System.out.println("Perímetro do Triângulo: " + perimetroTriangulo);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Quadrado
        System.out.println("Perímetro do Quadrado: " + (4 * quadrado.getLado()));
        System.out.println("Diagonal do Quadrado: " + quadrado.calcularDiagonal());

        // Trapezio
        double perimetroTrapezio = trapezio.calcularPerimetro(8, 5, 6, 6); // Exemplo de lados
        System.out.println("Perímetro do Trapézio: " + perimetroTrapezio);
        System.out.println(trapezio.descricao());

        // Elipse
        elipse.desenhar();
        double perimetroElipse = elipse.calcularPerimetro();
        System.out.println("Perímetro da Elipse (aproximado): " + perimetroElipse);
    }
}
