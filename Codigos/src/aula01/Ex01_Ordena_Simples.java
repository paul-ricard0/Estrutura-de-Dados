package aula01;

import java.util.Scanner;

public class Ex01_Ordena_Simples {
	
	public static void main(String[] args) {
		
		int[] vet = new int[10];
		int aux;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<vet.length;i++){
			System.out.printf("\nDigite Posição #%d ",i+1);
			vet[i]= scan.nextInt();	
		}
		
		//ordenação de vetor simples
		for(int i=0; i<10; i++){
			for(int j=0; j<9; j++){
				if(vet[j]> vet[j+1]){
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		
		//mostra vetor ordenado
		System.out.println("Vetor Ordenado");
		for(int i=0;i<vet.length;i++){
			System.out.printf("%d\t",vet[i]);	
		}
		
		
		scan.close();

		
	}
	
}