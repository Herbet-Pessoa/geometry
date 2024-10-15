package org.example;

public class Elipse extends FiguraGeometrica {
    private double semiEixoMaior;
    private double semiEixoMenor;

    public Elipse(double semiEixoMaior, double semiEixoMenor) {
        this.semiEixoMaior = semiEixoMaior;
        this.semiEixoMenor = semiEixoMenor;
    }

    public double getSemiEixoMaior() {
        return semiEixoMaior;
    }

    public void setSemiEixoMaior(double semiEixoMaior) {
        this.semiEixoMaior = semiEixoMaior;
    }

    public double getSemiEixoMenor() {
        return semiEixoMenor;
    }

    public void setSemiEixoMenor(double semiEixoMenor) {
        this.semiEixoMenor = semiEixoMenor;
    }

    @Override
    public double calcularArea() {
        return Math.PI * semiEixoMaior * semiEixoMenor;
    }

    public void desenhar() {
        System.out.println("Desenhando uma elipse com semi-eixo maior " + semiEixoMaior + " e semi-eixo menor " + semiEixoMenor);
    }

    public double calcularPerimetro() {
        double a = semiEixoMaior;
        double b = semiEixoMenor;
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }
}

