package chatGPT;

public class Trapezio extends FiguraGeometrica {
    private double baseMaior;
    private double baseMenor;
    private double altura;

    // Construtor
    public Trapezio(double baseMaior, double baseMenor, double altura) {
        if (baseMaior < 0 || baseMenor < 0 || altura < 0) {
            throw new IllegalArgumentException("Bases e altura não podem ser negativas.");
        }
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    // Getters e Setters
    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        if (baseMaior < 0) {
            throw new IllegalArgumentException("Base maior não pode ser negativa.");
        }
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        if (baseMenor < 0) {
            throw new IllegalArgumentException("Base menor não pode ser negativa.");
        }
        this.baseMenor = baseMenor;
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
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    // Método adicional: Descrição do Trapézio
    public String descricao() {
        return "Trapézio com base maior " + baseMaior + ", base menor " + baseMenor + " e altura " + altura;
    }

    // Novo Método: Calcular Perímetro
    public double calcularPerimetro(double lado1, double lado2, double lado3, double lado4) {
        if (lado1 < 0 || lado2 < 0 || lado3 < 0 || lado4 < 0) {
            throw new IllegalArgumentException("Lados não podem ser negativos.");
        }
        return lado1 + lado2 + lado3 + lado4;
    }
}

