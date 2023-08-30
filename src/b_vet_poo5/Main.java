package b_vet_poo5;

import java.util.Scanner;

import entidades.Alunos;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao cadastradas:");
		int n = sc.nextInt();
		
		Alunos[] vet = new Alunos[n];
		
		String nome;
		int idade;
		double altura;
		
		for(int i = 0;i<vet.length;i++) {
			sc.nextLine();
			System.out.println("Dados da "+ (i+1) +"a pessoa:");
			System.out.println("Nome:");
			nome = sc.nextLine();
			
			System.out.println("Idade:");
			idade = sc.nextInt();
			
			System.out.println("Altura:");
			altura = sc.nextDouble();
			
			vet[i] = new Alunos(nome,idade,altura);
		}
		
		double soma=0;
		
		for(int i=0; i<vet.length; i++) {
			soma += vet[i].getAltura();
		}
		double media = soma / vet.length; 
		
	
		double menor = 0;
		
		for(int i=0; i<vet.length; i++) {
			if(vet[i].getIdade() < 16) {
				menor = menor + 1;
				
			}
		}
		
		double media2 = (menor / vet.length) * 100; 
		
		System.out.println("Altura média: " + media);
		System.out.println("pessoas com menos de 16 anos:"+ media2 + "%");
		
		for(int i=0; i<vet.length; i++) {
			if(vet[i].getIdade()<16) {
				System.out.println(vet[i].getNome());;
			}
		}
		
		sc.close();

	}

}
