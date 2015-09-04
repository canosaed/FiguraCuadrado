package ar.edu.unlam.tallerweb.cuadrado;

public class Cuadrado {
	public double lado;
	private double perimetro;

	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	public double perimetro() {
		 perimetro = 4 * lado;
		 return perimetro;
	}

	public double area() {
		return lado * lado;
	}
}
