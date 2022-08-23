package ativ01;


/*
 *Busca Sequencial: Fazer um programa que insira 10 valores inteirosrandômicos
 *em um vetor, mostre o vetor e busque um determinado elemento (mostrar a
 *posição que encontrou). Caso não exista imprimir mensagem de não localizado.
 */

import java.util.Random;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
        int vet[]= new int[10];

        Random randomico = new Random();

        for(int i=0;i< vet.length;i++){
            vet[i]= randomico.nextInt(100);
        }

        //exibe todo o vetor
        System.out.print("Vet: ");
        for(int i:vet) {
            System.out.print(i +" | ");
        }
        
		
		System.out.print("\nDigite o número que quer encontrar: ");
		int num = scan.nextInt();	
		scan.close();
        
		
        
		for(int i=0; i<vet.length; i++) {
			
			if(vet[i]==num) {
				System.out.printf("\nA posição do %d é: %d \n", num, i);
				i = vet.length;
			}else if(i+1 == vet.length) {
				System.out.printf("\nnão localizado!!!!!");
			}
			
        }
        
    }
}