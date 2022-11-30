package br.com.provaAV2.questao1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, FullStackException {
        Scanner scan = new Scanner(new File("./nomes.txt"));

        Stack<String> pilha_nomes = new Stack();

        while (scan.hasNextLine()){
            pilha_nomes.push(scan.nextLine());
        }

        ArrayStack arrayStack = new  ArrayStack();

        while(pilha_nomes.size() > 0){
            arrayStack.push(pilha_nomes.pop());
        }

        System.out.println(arrayStack);

    }
}
