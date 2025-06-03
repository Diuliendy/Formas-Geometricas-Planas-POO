package br.edu.figurasgeometricasplanas;
import java.util.Scanner;
public class Paralelogramo {
	 private double base;
	    private double altura;
	    private double area;

	    public void calcArea() {
	        this.area = base * altura;
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
