package Prova01.Q03;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Deque<PostRedeSocial> redeSocial = new LinkedList<PostRedeSocial>();

        int key=0;
        String publi;
        byte relevante;
        do {
            System.out.println("<1>Cadastrar Post \n<2>Visualizar Posts Relevantes \n<3>Sair");
            key = scan.nextInt();
            scan = new Scanner(System.in);
            switch (key){
                case 1:

                    System.out.println("O que deseja postar: ");
                    publi = scan.nextLine();


                    System.out.println("É um post relevante? (1=relevante | 2=comum)");
                    relevante = scan.nextByte();

                    if (relevante==1){
                        PostRedeSocial Post = new PostRedeSocial(publi, relevante);
                        redeSocial.addFirst(Post);
                    } else if (relevante == 2) {
                        PostRedeSocial Post = new PostRedeSocial(publi, relevante);
                        redeSocial.addLast(Post);
                    }else{
                        System.out.println("Defina a relevancia do seu post corretamente!!!");
                    }

                    break;
                case 2:

                    for (PostRedeSocial post: redeSocial){
                        if (post.getRelevancia()==1){
                            System.out.println(post.getMsg() +"\n");
                        }
                    }

                    break;
                case 3:
                    System.out.println("Obrigado por fazer parte da nossa rede!!!! até a próxima");
                    break;
                default:
                    System.out.println("Valor inválido!!!");

            }

        }while(key!=3);
    }
}
