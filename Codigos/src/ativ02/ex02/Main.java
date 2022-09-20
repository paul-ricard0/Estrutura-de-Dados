package ativ02.ex02;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String convidado;
        Lista lista_mulher = new Lista();
        Lista lista_homem = new Lista();

        for(int i=0; i < 10; i++) {

            System.out.printf("\nConvidado mulher %d: ", i);
            convidado = scan.nextLine();

            lista_mulher.adicionar(convidado);
        }

    }
}
