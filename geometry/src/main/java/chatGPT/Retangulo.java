package chatGPT;

public class Retangulo extends FiguraGeometrica {
    private double largura;
    private double altura;

    // Construtor
    public Retangulo(double largura, double altura) {
        if (largura < 0 || altura < 0) {
            throw new IllegalArgumentException("Largura e altura não podem ser negativas.");
        }
        this.largura = largura;
        this.altura = altura;
    }

    // Getters e Setters
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura < 0) {
            throw new IllegalArgumentException("Largura não pode ser negativa.");
        }
        this.largura = largura;
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
        return largura * altura;
    }

    // Novo Método: Calcular Perímetro
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}

