package ativ01;


/*
 *Faça um programa que preencha uma matriz mat 3 x 4 de
 *inteiros randômicos. Descobrir o maior e menor elemento da
 *matriz.
 *Exibir a matriz (use a tabulação) e também o menor e maior
 *elemento.
 */

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][4]; // inicializa a matriz com zeros
		
        Random randomico = new Random();

        // Colocando os números na matriz
        for(int linhas=0;linhas<3;linhas++){
        	for(int cols=0;cols<4;cols++){
				matriz[linhas][cols]=randomico.nextInt(100);
        	}
        }
        
		int maior = 0;
		int menor = 101;
		
		for(int linhas=0;linhas<3;linhas++){
        	for(int cols=0;cols<4;cols++){
        		
				if(matriz[linhas][cols] > maior) {
					maior = matriz[linhas][cols];
				}
				
				if(matriz[linhas][cols]<menor) {
					menor = matriz[linhas][cols];
				}
				
        	}
        }
        
		System.out.printf("Maior número: %d\tMenor número: %d\n\n", maior, menor);
		
		for(int linhas=0;linhas<3;linhas++){
			for(int cols=0;cols<4;cols++){
						
				System.out.printf("%d\t",matriz[linhas][cols]);
			}
			System.out.println("");
		}
        
	}

}