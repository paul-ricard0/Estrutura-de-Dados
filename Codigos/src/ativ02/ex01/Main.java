package ativ02.ex01;

/*
Uma agência bancária necessita organizar a fila para atendimento do
Auxílio Brasil. Cada usuário receberá uma senha numérica, serão
atendidas 200 pessoas por dia.
Percebeu-se que as pessoas que possuem senha impar até o número
100 são consideradas prioridade, por isso, devem ficar em outra fila
separada
Fazer um programa usando lista que gere a entrada de dados de 200
pessoas, separe as pessoas com a senha impar até o número 100,
criando a lista de prioridades. Ao final deverão ser impressos a lista de
prioridade e a lista ordenada das pessoas que estão na fila comum
 */

public class Main {

    public static void main(String[] args) {

        Lista fila_normal = new Lista();
        Lista fila_prioridade = new Lista();



        for(int i=0; i < 200; i++) {
            if(i%2==0){
                fila_normal.adicionar(i);
            }else{
                fila_prioridade.adicionar(i);
            }
        }

        for(int i=0; i < fila_prioridade.getTamanho(); i++) {
            System.out.println(fila_prioridade.get_valor_na_posicao(i));
        }


    }


}
