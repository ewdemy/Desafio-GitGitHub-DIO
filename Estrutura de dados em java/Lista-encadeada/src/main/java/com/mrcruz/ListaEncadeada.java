package com.mrcruz;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAux = referenciaEntrada;
        for (int i = 0; i < this.size() - 1; i++){
            noAux = noAux.getProximoNo();
        }
        noAux.setProximoNo(novoNo);
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAux = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i < this.size() - 1; i++){
            noRetorno = noAux;
            noAux = noAux.getProximoNo();
        }
        return noRetorno;
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;

        while (true){
            if (referenciaAux != null){
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return tamanhoLista;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null;
    }
    private void validaIndice(int index){
        if(index >= this.size()){
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index);
        }
    }
}
