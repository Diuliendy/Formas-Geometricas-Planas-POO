package br.edu.figurasgeometricasplanas;
import java.util.Scanner;
public class Triangulo {

	double base;
	double altura;
	
public Triangulo(double base, double altura) {
	Scanner sc= new Scanner(System.in);
	
	base=sc.nextDouble();
	altura=sc.nextDouble();
}

public double calcularArea() {
	return(base*altura)/2;
}
}
