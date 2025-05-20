package br.edu.figurasgeometricasplanas;

public class Trapezio {
	private double baseMaior;
	private double baseMenor;
	private double altura;
	private double area;
	public Trapezio() {
		baseMaior = 0;
		baseMenor = 0;
		altura = 0;
		area = 0;
	}
	public double getBaseMaior() {
		return baseMaior;
	}
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
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
	
	public double mostrarAreaComRetorno () {
		System.out.println(area);
		return area;
	}
}