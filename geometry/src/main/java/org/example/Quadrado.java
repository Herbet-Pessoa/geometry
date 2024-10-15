package org.example;

public class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    public double calcularDiagonal() {
        return lado * Math.sqrt(2);
    }
}

