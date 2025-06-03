package br.edu.figurasgeometricasplanas;
import java.util.Scanner;
public class Losango {
	public class Losangulo {
	    private double maior;
	    private double menor;
	    private double area;

	    public void calcArea() {
	        this.area = (maior * menor) / 2;
	    }

	    public void recebeMaior(double maior) {
	        this.maior = maior;
	    }

	    public void recebeMenor(double menor) {
	        this.menor = menor;
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

	    public double getArea() {
	        return area;
	    }
	}
}
