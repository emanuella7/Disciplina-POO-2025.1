package br.edu.figurasgeometricasplanas;

public class Pentagono {
	private double lado;
	private double apotema;
	private double area;
	public Pentagono() {
		lado = 0;
		area = 0;
	}
	public void calcApotema() {
		apotema = lado / (2 * Math.tan(Math.PI / 5));
	}
	public void calcArea() {
		area = (5 * lado * apotema) / 2;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getApotema() {
		return apotema;
	}
	public void setApotema(double apotema) {
		this.apotema = apotema;
	}
	public double getArea() {
		return area;
	}
	public double mostrarAreaComRetorno () {
		System.out.println(area);
		return area;
	}
}