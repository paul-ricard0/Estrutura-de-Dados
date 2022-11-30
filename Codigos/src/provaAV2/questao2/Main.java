package br.com.provaAV2.questao2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AVLTree arvore = new  AVLTree();
        AVLTree t = new AVLTree();
        AVLTree.Node root = null;


        int[] vetor = {50, 13, 5, 17 , 9, 8, 10, 12, 55, 70};
        int key=0;


        do{
            System.out.println("\n\n<1> Inserir\n" +
                    "\n" +
                    "<2> Excluir\n" +
                    "\n" +
                    "<3> Pré-ordem\n" +
                    "\n" +
                    "<4> sair"
            );
            key = scan.nextInt();

            switch (key) {
                case 1:
                    for (int i = 0; i < vetor.length; i++) {
                        root = t.insert(root, vetor[i]);
                        t.print(root);
                    }
                    break;
                case 2:
                    System.out.println("Digite um número:");
                    int  num = scan.nextInt();
                    t.deleteNode(root, num);
                    break;
                case 3:
                    t.preOrder(root);
                    break;
                case 4:
                    System.out.println("VOLTE SEMPRE!!!!!");
                    break;
                default:
                    System.out.println("O número escolhido é inválido! Digite um número entre 1 a 4.");
            }

        }while(key!=4);


    }
}
