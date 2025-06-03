package br.edu.figurasgeometricasplanas;
import java.util.Scanner;
public class Hexágono {
	double base;
	double altura;
	double raizde3= Math.pow(3,1 /2);
	double lado;
	
public Hexágono(double base, double altura,double raizde3,double lado) {
	Scanner sc= new Scanner(System.in);
	
	base=sc.nextDouble();
	altura=sc.nextDouble();
}

public double calcularArea() {
	return(6*(lado*lado)*raizde3 /4);
}

public double listadeAtributos() {
	return 4;
}

}
