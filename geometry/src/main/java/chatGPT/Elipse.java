package chatGPT;

public class Elipse extends FiguraGeometrica {
    private double semiEixoMaior;
    private double semiEixoMenor;

    // Construtor
    public Elipse(double semiEixoMaior, double semiEixoMenor) {
        if (semiEixoMaior < 0 || semiEixoMenor < 0) {
            throw new IllegalArgumentException("Semieixos não podem ser negativos.");
        }
        this.semiEixoMaior = semiEixoMaior;
        this.semiEixoMenor = semiEixoMenor;
    }

    // Getters e Setters
    public double getSemiEixoMaior() {
        return semiEixoMaior;
    }

    public void setSemiEixoMaior(double semiEixoMaior) {
        if (semiEixoMaior < 0) {
            throw new IllegalArgumentException("Semieixo maior não pode ser negativo.");
        }
        this.semiEixoMaior = semiEixoMaior;
    }

    public double getSemiEixoMenor() {
        return semiEixoMenor;
    }

    public void setSemiEixoMenor(double semiEixoMenor) {
        if (semiEixoMenor < 0) {
            throw new IllegalArgumentException("Semieixo menor não pode ser negativo.");
        }
        this.semiEixoMenor = semiEixoMenor;
    }

    // Implementação do método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * semiEixoMaior * semiEixoMenor;
    }

    // Método adicional: Desenhar Elipse (simulação)
    public void desenhar() {
        System.out.println("Desenhando uma elipse com semi-eixo maior " + semiEixoMaior + " e semi-eixo menor " + semiEixoMenor);
    }

    // Novo Método: Calcular Perímetro (Aproximação de Ramanujan)
    public double calcularPerimetro() {
        double a = semiEixoMaior;
        double b = semiEixoMenor;
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }
}

