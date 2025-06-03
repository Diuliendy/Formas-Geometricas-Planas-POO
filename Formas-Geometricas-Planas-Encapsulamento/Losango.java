package br.edu.figurasgeometricasplanas;
import java.util.Scanner;
public class Losango {
	double diagonalhorizontal;
	double diagonalvertical;
	
	
public Losango(double diagonalhorizontal, double diagonalvertical) {
	Scanner sc= new Scanner(System.in);
	
	diagonalhorizontal=sc.nextDouble();
	diagonalvertical=sc.nextDouble();
}

public double calcularArea() {
	return(diagonalhorizontal*diagonalvertical)/2;
}

public double listadeAtributos() {
	return 2;
}


}
