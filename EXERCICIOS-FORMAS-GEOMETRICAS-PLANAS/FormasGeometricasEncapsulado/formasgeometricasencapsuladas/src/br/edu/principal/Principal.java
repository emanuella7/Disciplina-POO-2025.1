package br.edu.principal;

import br.edu.figurasgeometricasplanas.*;


public class Principal {

	public static void main(String[] args) {
		Triangulo fg1 = new Triangulo();
		fg1.setBase(10);
		fg1.setAltura(6);
		fg1.calcArea();
		double recebaArea = fg1.mostrarAreaComRetorno();
		System.out.println("");
		

		Trapezio fg2 = new Trapezio();
		fg2.setBaseMaior(9.6);
		fg2.setBaseMenor(5);
		fg2.setAltura(8);
		fg2.getArea();
		recebaArea = fg2.mostrarAreaComRetorno();
		System.out.println("");
		
		Retangulo fg3 = new Retangulo();
		fg3.setBase(4);
		fg3.setAltura(9);
		fg3.calcArea();
		fg3. mostrarAreaComRetorno();
		recebaArea = fg3.mostrarAreaComRetorno();
		System.out.println("");
		
		Quadrado  fg4 = new Quadrado();
		fg4.setLado(8);
		fg4.calcArea();
		fg4.mostrarAreaComRetorno();
		recebaArea = fg4.mostrarAreaComRetorno();
		System.out.println("");
		
		Pentagono fg5 = new Pentagono();
		fg5.setLado(5);
		fg5.calcApotema();
		fg5.calcArea();
		fg5.mostrarAreaComRetorno();
		recebaArea = fg5.mostrarAreaComRetorno();
		System.out.println("");
		
		Paralelogramo fg6 = new Paralelogramo();
		fg6.setBase(12);
		fg6.setAltura(9);
		fg6.calcArea();
		fg6.mostrarAreaComRetorno();
		recebaArea = fg6.mostrarAreaComRetorno();
		System.out.println("");
		

		Losango fg7 = new Losango();
		fg7.setDiagMaior(7);
		fg7.setDiagMenor(9);
		fg7.calcArea();
		fg7.mostrarAreaComRetorno();
		recebaArea = fg7.mostrarAreaComRetorno();
		System.out.println("");
		
		Hexagono  fg8 = new Hexagono();
		fg8.setLado(4);
		fg8.calcArea();
		fg8.mostrarAreaComRetorno();
		recebaArea = fg8.mostrarAreaComRetorno();
		System.out.println("");
		
		
		Circulo  fg9 = new Circulo();
		fg9.setRaio(9);
		fg9.calcArea();
		
		recebaArea = fg9.retornaArea();
		System.out.println("");
		
	}
}
		
		
		