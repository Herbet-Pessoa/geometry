package org.example;

public class Trapezio extends FiguraGeometrica {
    private double baseMaior;
    private double baseMenor;
    private double altura;

    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public String descricao() {
        return "Trapézio com base maior " + baseMaior + ", base menor " + baseMenor + " e altura " + altura;
    }

    public double calcularPerimetro(double lado1, double lado2, double lado3, double lado4) {
        return lado1 + lado2 + lado3 + lado4;
    }
}

