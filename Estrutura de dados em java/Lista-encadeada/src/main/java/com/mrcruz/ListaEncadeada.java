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

    public T get(int index){
        return  getNo(index).getConteudo();
    }

    public T remove(int index) {
        No<T> noPivor = this.getNo(index);
        if(index == 0){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = this.getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAux = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++){
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

    @Override
    public String toString() {
        String str = "";
        No<T> noAux = referenciaEntrada;

        for(int i = 0; i < this.size(); i++){
            str +="No[{conteúdo=" + noAux.getConteudo() + "}]--->";
            noAux = noAux.getProximoNo();
        }

        str += "null";
        return str;
    }

    private void validaIndice(int index){
        if(index >= this.size()){
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index);
        }
    }
}
