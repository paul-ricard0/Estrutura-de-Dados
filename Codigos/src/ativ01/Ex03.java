package ativ01;

/*
 * Entrar com um vetor randômico de 50 posições
 * Implementar o método de ordenação da Bolha – Bubble Sort
 * Realizar a rotina de busca de um elemento no vetor – método 
 * de pesquisa Binári
 */
import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
    	Scanner scan = new Scanner(System.in);
    	
        int vet[]= new int[10];
        
        Random randomico = new Random();
        
        System.out.print("Vetor desordenado: ");
        for(int i=0;i< vet.length;i++){
            vet[i]= randomico.nextInt(100);
            System.out.printf("%d  ",vet[i]);
        }
        int aux;
        
        for(int i=0; i<10; i++) {
        	for(int j=0; j<9; j++) {
        		
        		if(vet[j]>vet[j+1]) {
        			aux = vet[j];
        			vet[j] = vet[j+1];
        			vet[j+1] = aux;
        		}
        		
        	}
        }
        
        System.out.print("\n\nVetor organizado: ");
        for(int i=0;i< vet.length;i++){
            System.out.printf("%d  ",vet[i]);
        }
        
        System.out.println("\nDigite o número que quer encontrar: ");
		int num = scan.nextInt();	
		
        int inicio=0, meio=0, fim=vet.length - 1;
        while(inicio <= fim) {
        	meio = (fim+inicio) / 2; //Encontrando o meio do vetor
        	
        	if(vet[meio] == num) {
		        System.out.printf("Encontrou o número %d na posição %d \n", num, meio);
		        break;
        	}
        	
        	if(vet[meio] < num) { 
        		//definindo novo inicio menor caso o número seja menor que o antigo meio
        		inicio = meio + 1;
        	}else {
        		//definindo novo fim caso o número seja maior que o antigo meio
		        fim = meio - 1;
        	}
        	
        	// Caso não encontre o valor pesquisado dentro do vetor, imprime que não encontrou o valor pesquisado. 
		    if(inicio > fim) {
		      System.out.println("Não encontrou o número " + num);
		    }
        }
        scan.close();
        System.out.println("fim!!!");
	}
}
