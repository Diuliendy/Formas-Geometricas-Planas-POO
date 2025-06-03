package br.edu.figurasgeometricasplanas;
import  java.util.Scanner;
public class Pentágono {
	double apotema;
	double perimetro;
	
	
public Pentágono(double apotema, double perimetro) {
	Scanner sc= new Scanner(System.in);
	
	apotema=sc.nextDouble();
	perimetro=sc.nextDouble();
}

public double calcularArea() {
	return(apotema*perimetro)/2;
}

public double listadeAtributos() {
	return 2;
}

}
