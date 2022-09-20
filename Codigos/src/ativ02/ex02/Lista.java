package ativ02.ex02;

public class Lista {

    // A classe lista tem as posições
    private Pessoa primeiro_posicao;
    private Pessoa ultimo_posicao;
    private int tamanho;


    //Construtor que inicia sem elemento e com tamanho 0
    public Lista(){
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void adicionar(String novoValor){

        //Criando novo elemento
        Pessoa new_elemento = new Pessoa(novoValor);

        if (this.primeiro_posicao == null && this.ultimo_posicao == null){
            //Se for o primeiro valor inserido na lista, então esse valor é o primeiro e o último
            this.primeiro_posicao = new_elemento;
            this.ultimo_posicao = new_elemento;
        }else{

            // Par onde o último apontava, agora ele aponta para o novo elemento
            this.ultimo_posicao.setProximo(new_elemento);

            // Colocando o novo elemento na última posicao
            this.ultimo_posicao = new_elemento;

        }

        this.tamanho++;

    }

    public int get_valor_na_posicao(String posicao){

        Pessoa atual = this.primeiro_posicao;

        for(int i=0; i < posicao; i++){

            if (atual.getProximo() != null){

                atual = atual.getProximo();

            }

        }

        return atual.getValor_elemento();
    }

}
