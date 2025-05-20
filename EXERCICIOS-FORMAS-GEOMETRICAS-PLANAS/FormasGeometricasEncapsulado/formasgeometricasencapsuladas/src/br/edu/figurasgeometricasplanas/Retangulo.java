package br.edu.figurasgeometricasplanas;

public class Retangulo {
	private double base;
	private double area;
	private double altura;
	
	public Retangulo() {
		base = 0;
		
		area = 0;
	}

public double getBase() {
	return base;
}
public void setBase(double base) {
	this.base = base;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
public double getArea() {
	return area;
}

public void calcArea() {
	area = base * altura;
}

public double mostrarAreaComRetorno() {
	System.out.println(area);
	return area;
	}
}