package atividades.ativ03.ex01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
/*
Implemente uma pilha que leia um arquivo de texto contendo frases
buscadas em um software, como uma lista de frases de busca do
Google.
• O programa deverá empilhar todo conteúdo em uma estrutura de pilha.
• Mostrar as top 10 frases mais buscadas por último
• Desempilhar o restante dos dados depois da 10ª frase.
 */

public class Main {

    public static void main(String[] args) throws FileNotFoundException {



        Stack<String> pilha_frases = new Stack();
        Queue<String> fila_10_frases = new LinkedList<>();

        Scanner scan = new Scanner(new File("./tools/nomes.txt"));
        while (scan.hasNextLine()){
            pilha_frases.push(scan.nextLine());
        }

        System.out.println("Elementos da Fila " + pilha_frases);

        while(fila_10_frases.size() < 10){
            fila_10_frases.add(pilha_frases.pop());  // Estou tirando a última palavra da pilha e adicionando na fila
        }


        System.out.println("TOP 10 PALAVRAS");
        for(String i:fila_10_frases) {
            System.out.println(i);
        }


        System.out.println("\n \n \nO que NÃO estão no top 10:");
        while(!pilha_frases.isEmpty()){
            System.out.println(pilha_frases.pop());
        }



    }

}
