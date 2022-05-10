package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito { //implements - pois estou usando a interface Favorito (contrato)
    private double taxaDeImportacao;//dá pra fazer o encapsulamento (getters and setters) de forma automatica (clicando direito sobre a variavel=> refactor => encapsulate fileds)

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    //Polimorfismo: um mesmo metodo pode ter comportamento diferente em diferentes classes...exemplo set valor para Produtos internacionais onde o menor valor pode ser -99.99...copiado da classe produto
    //extende as caracterisiticas da classe pai, copia e cola o metodo desejado (tudo igual) aparece o ozinho, pode se alterar o modificador da variavel para protected
    public void setValor(double novoValor) {
        if (novoValor > -100) {
            this.valor = novoValor;
        }
        else{
            throw new IllegalArgumentException("Valores devem ser maiores que -100!!!!!!!!!!!");//existem dezenas de exceções pra escolher...qual a mehlhor => procurar no google :)
        }
    }

    public void setTaxaDeImportacao(double novaTaxaDeImportacao){
        this.taxaDeImportacao = novaTaxaDeImportacao;
    }

    public double getTaxaDeImportacao(){
        return this.taxaDeImportacao;
    }

    //metodo necessario por conta da interface
    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
    }
}
