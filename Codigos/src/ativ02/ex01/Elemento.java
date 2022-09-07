package ativ02.ex01;

public class Elemento {

    private int valor_elemento;

    private Elemento proximo;



    public Elemento(int novoValor){
        this.valor_elemento = novoValor;
    }

    public int getValor_elemento() {
        return valor_elemento;
    }

    public void setValor_elemento(int valor_elemento) {
        this.valor_elemento = valor_elemento;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }



}
