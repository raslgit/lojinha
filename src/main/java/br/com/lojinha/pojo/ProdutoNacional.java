package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

//extends: "quero herdar tudo de"
public class ProdutoNacional extends Produto implements Favorito {
    private double impostoNacional;//private para encapsular


    //como tenho um construtor na classe Produto, automaticamente o java ja reclama e diz que aqui também vai ter que ter, obrigando a quem usar
    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }


    //encapsulando
    public double getImpostoNacional(){
        return this.impostoNacional;
    }

    public void setImpostoNacional(double novoImpostoNacional){
        this.impostoNacional = novoImpostoNacional;
    }

    //interface
    //metodo necessario por conta da interface
    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
    }


}
