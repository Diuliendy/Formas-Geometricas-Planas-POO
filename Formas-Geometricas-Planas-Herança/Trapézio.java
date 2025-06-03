package br.edu.figurasgeometricasplanas;
import java.util.Scanner;
public class Trapézio {
	double Basemaior;
	double basemenor;
	double altura;
	
	
	
public Trapézio(double Basemaior, double basemenor,double altura) {
	Scanner sc= new Scanner(System.in);
	
     Basemaior=sc.nextDouble();
     Basemaior=sc.nextDouble();
	 altura=sc.nextDouble();
		
		
}

public double calcularArea() {
	return((Basemaior*basemenor)*altura/2);
}



public double listadeAtributos() {
	return 3;
}


}

