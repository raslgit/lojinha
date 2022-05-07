package br.com.lojinha.pojo;

import br.com.lojinha.enums.NomeItemAdicional;

import java.util.Arrays;
import java.util.List;

public class ItensInclusos {
    //public  List<Integer> quantidade = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    private int qty;
    private NomeItemAdicional nome;


    public int getQty() {
        return this.qty;
    }

    public NomeItemAdicional getItemAdicional() {
        return this.nome;
    }

    public void setQtyeItemAdicional(int novaQuantidade, NomeItemAdicional novoNome) {
        if (novaQuantidade >= 0){
            this.qty = novaQuantidade;
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
