package br.edu.figurasgeometricasplanas;

public class Quadrado {
	private double lado;
	private double area;
	
	
	public Quadrado() {
		lado = 0;
		area = 0;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getArea() {
		return area;
	}
	public void calcArea() {
		area = (lado * lado);
	}
	public double mostrarAreaComRetorno () {
		System.out.println(area);
		return area;
	}
}