package br.edu.figurasgeometricasplanas;
import java.util.Scanner;
public class Hexágono {
	
	public class Hexagono {
	    private double base;
	    private double lado;
	    private double area;

	    public void calcArea() {
	        this.area = ((3 * Math.sqrt(3)) / 2) * lado * lado;
	    }

	    public void recebeBase(double base) {
	        this.base = base;
	    }

	    public void recebeLado(double lado) {
	        this.lado = lado;
	    }

	    public double mostraAreaComRetorno() {
	        return this.area;
	    }

	    public double getBase() {
	        return base;
	    }

	    public double getLado() {
	        return lado;
	    }

	    public double getArea() {
	        return area;
	    }
	}


}
