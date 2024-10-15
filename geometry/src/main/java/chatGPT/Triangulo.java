package chatGPT;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    // Construtor
    public Triangulo(double base, double altura) {
        if (base < 0 || altura < 0) {
            throw new IllegalArgumentException("Base e altura não podem ser negativas.");
        }
        this.base = base;
        this.altura = altura;
    }

    // Getters e Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base < 0) {
            throw new IllegalArgumentException("Base não pode ser negativa.");
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("Altura não pode ser negativa.");
        }
        this.altura = altura;
    }

    // Implementação do método calcularArea
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Novo Método: Calcular Perímetro
    public double calcularPerimetro(double lado1, double lado2, double lado3) {
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            return lado1 + lado2 + lado3;
        } else {
            throw new IllegalArgumentException("Os lados fornecidos não formam um triângulo válido.");
        }
    }
}

