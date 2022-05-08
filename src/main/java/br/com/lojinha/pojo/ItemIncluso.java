package br.com.lojinha.pojo;

import br.com.lojinha.enums.NomeItemAdicional;

public class ItemIncluso {
    //public  List<Integer> quantidade = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    private int quantidade;
    private NomeItemAdicional nome;


    //construtor que será chamado sempre que instanciar a classe ItemIncluso (sempre que der um new)...com isso já forço a ter que passar os paramentros evitando assim a necessidade do set
    public ItemIncluso(int quantidadeInicial, NomeItemAdicional nomeInicial){
        this.quantidade = quantidadeInicial;
        this.nome = nomeInicial;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public NomeItemAdicional getNome() {
        return nome;
    }

    public void setQtyeItemAdicional(int novaQuantidade, NomeItemAdicional novoNome) {
        if (novaQuantidade >= 0){
            this.quantidade = novaQuantidade;
            this.nome = novoNome;
        }
        else{
            throw new IllegalArgumentException("Quantidade deve ser maior que 0 e inteira, do tipo: 1,2,3,4,5");
        }

    }

/*    public List<Integer> getQtyAdicional() {
        return this.quantidade;
    }

    public void setQtyAdicional(List<Integer> novaQuantidade) {
        this.quantidade = novaQuantidade;
    }*/

}
