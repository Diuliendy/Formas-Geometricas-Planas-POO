package br.edu.figurasgeometricasplanas;
import java.util.Scanner;
public class Quadrado {

		  private double lado;
	    private double area;

	    public void calcArea() {
	        this.area = lado * lado;
	    }

	    public void recebeLado(double lado) {
	        this.lado = lado;
	    }

	    public double mostraAreaComRetorno() {
	        return this.area;
	    }

	    public double getLado() {
	        return lado;
	    }

	    public double getArea() {
	        return area;
	    }
	}
