package br.edu.figurasgeometricasplanas;
import java.util.Scanner;
public class Triangulo {

	public class Triangulo {
    private double base;
    private double altura;
    private double area;

    public void calcArea() {
        this.area = (base * altura) / 2;
    }

    public void recebeBase(double base) {
        this.base = base;
    }

    public void recebeAltura(double altura) {
        this.altura = altura;
    }

    public double mostraAreaComRetorno() {
        return this.area;
    }

    // Getters e Setters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return area;
    }
}
