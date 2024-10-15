package chatGPT;

public class Circulo extends FiguraGeometrica {
    private double raio;

    // Construtor
    public Circulo(double raio) {
        if (raio < 0) {
            throw new IllegalArgumentException("Raio não pode ser negativo.");
        }
        this.raio = raio;
    }

    // Getter e Setter
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio < 0) {
            throw new IllegalArgumentException("Raio não pode ser negativo.");
        }
        this.raio = raio;
    }

    // Implementação do método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    // Novo Método: Calcular Circunferência
    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }
}

