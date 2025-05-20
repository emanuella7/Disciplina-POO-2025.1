package br.edu.figurasgeometricasplanas;

public class Circulo {
	private double raio;
	private double area;
	
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return area;
	}
	public double retornaRaio() {
		System.out.println("O valor do raio é: "+ raio);
		return raio;
	}
	public void calcArea() {
		double pi = 3.14;
		area = pi * (Math.pow(raio, 2)); 
	}
	public double retornaArea() {
		System.out.println("O valor da Aréa é: "+ area);
		return area; 
	}
}