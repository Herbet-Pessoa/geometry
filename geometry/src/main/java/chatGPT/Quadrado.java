package chatGPT;

public class Quadrado extends FiguraGeometrica {
    private double lado;

    // Construtor
    public Quadrado(double lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("Lado não pode ser negativo.");
        }
        this.lado = lado;
    }

    // Getter e Setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("Lado não pode ser negativo.");
        }
        this.lado = lado;
    }

    // Implementação do método calcularArea
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    // Novo Método: Calcular Diagonal
    public double calcularDiagonal() {
        return lado * Math.sqrt(2);
    }
}

