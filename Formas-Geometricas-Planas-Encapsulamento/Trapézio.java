package br.edu.figurasgeometricasplanas;
import java.util.Scanner;
public class Trapézio {
	public class Trapezio {
	    private double maior;
	    private double menor;
	    private double altura;
	    private double area;

	    public void calcArea() {
	        this.area = ((maior + menor) * altura) / 2;
	    }

	    public void recebeMaior(double maior) {
	        this.maior = maior;
	    }

	    public void recebeMenor(double menor) {
	        this.menor = menor;
	    }

	    public void recebeAltura(double altura) {
	        this.altura = altura;
	    }

	    public double mostraAreaComRetorno() {
	        return this.area;
	    }

	    public double getMaior() {
	        return maior;
	    }

	    public double getMenor() {
	        return menor;
	    }

	    public double getAltura() {
	        return altura;
	    }

	    public double getArea() {
	        return area;
	    }
	}
}
