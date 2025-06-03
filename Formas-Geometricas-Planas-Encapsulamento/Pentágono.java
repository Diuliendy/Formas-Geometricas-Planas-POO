package br.edu.figurasgeometricasplanas;
import  java.util.Scanner;
public class Pentágono {
	public class Pentagono {
	    private double perimetro;
	    private double apotema;
	    private double area;

	    public void calcArea() {
	        this.area = (perimetro * apotema) / 2;
	    }

	    public void recebePerimetro(double perimetro) {
	        this.perimetro = perimetro;
	    }

	    public void recebeApotema(double apotema) {
	        this.apotema = apotema;
	    }

	    public double mostraAreaComRetorno() {
	        return this.area;
	    }

	    public double getPerimetro() {
	        return perimetro;
	    }

	    public double getApotema() {
	        return apotema;
	    }

	    public double getArea() {
	        return area;
	    }
	}
}
