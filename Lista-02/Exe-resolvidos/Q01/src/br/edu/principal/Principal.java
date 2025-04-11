package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		double nota_trab, aval_sem, exame, media;
		
		System.out.println("Digite a nota do trabalho de laboratório: ");
		nota_trab = dado.nextDouble();
		System.out.println("Digite a nota da avaliação final: ");
		aval_sem= dado.nextDouble();
		
		System.out.println("Digite a nota do exame final: ");
		exame = dado.nextDouble();
		
		media = (double) (((nota_trab * 2) + (aval_sem * 3) + (exame * 5))/ 10);
		
		System.out.println("Média ponderada: " + media);
		
		dado.close();
		if (media >= 8 & media <= 10) {
		System.out.println("Obteve conceito A");
		}
		else if (media >= 7 & media < 8) {
		System.out.println("Obteve conceito B");
		}
		
		else if (media >= 6 & media < 7) {
			System.out.println("Obteve conceito C");
			}
		else if (media >= 5 & media < 6) {
			System.out.println("Obteve conceito D");
			}
		else   {
			System.out.println("Obteve conceito E");
			}
	}

}
