package console;

import java.util.Scanner;
public class If {

	public static void main(String[] args) {
	
		Scanner enter = new Scanner(System.in);
		
		System.out.print("Insira sua nota: ");
		double valor1 = enter.nextDouble();
		
		System.out.print("Insira sua nota: ");
		double valor2 = enter.nextDouble();
		
		System.out.print("Insira sua nota: ");
		double valor3 = enter.nextDouble();
		
		System.out.print("Insira sua nota: ");
		double valor4 = enter.nextDouble();
		
		double media = (valor1 + valor2 + valor3 + valor4) / 4;
		
		boolean mediaFinal = media >= 7.0 ;
		if(mediaFinal){
			System.out.println("Parabens!");
			System.out.println("Você passou!");
			System.out.println("Média Final: " + media);
			
		}
		boolean mediaFinalRecuperacao = media < 7.0 && media >= 5.0;
		if(mediaFinalRecuperacao){
			System.out.println("Você está de recuperação: ");
			System.out.println("Média Final: " + media);
		}
		
		boolean mediaFinalReprovado = media < 5.0 && media >= 0.0;
		if(mediaFinalReprovado){
			System.out.println("Você está reprovado");
			System.out.println("Média Final: " + media);
		}
		
		
		enter.close();
	}
}
