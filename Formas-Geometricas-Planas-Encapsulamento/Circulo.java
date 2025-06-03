package br.edu.figurasgeometricasplanas;
import java.util.Scanner;
public class Circulo {
	

		 private double raio;
	    private double area;

	    public void calcArea() {
	        this.area = Math.PI * raio * raio;
	    }

	    public void recebeRaio(double raio) {
	        this.raio = raio;
	    }

	    public double mostraAreaComRetorno() {
	        return this.area;
	    }

	    public double getRaio() {
	        return raio;
	    }

	    public double getArea() {
	        return area;
	    }
	}
