package br.edu.figurasgeometricasplanas;
import java.util.Scanner;
public class Paralelogramo {
	double base;
	double altura;
	
	
public Paralelogramo(double base, double altura) {
	Scanner sc= new Scanner(System.in);
	
	base=sc.nextDouble();
	altura=sc.nextDouble();
}

public double calcularArea() {
	return(base*altura);
}

public double listadeAtributos() {
	return 2;
}

}
