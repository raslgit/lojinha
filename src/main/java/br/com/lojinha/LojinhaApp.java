//pacote
package br.com.lojinha;

import br.com.lojinha.enums.NomeItemAdicional;
import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItensInclusos;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

//classe
public class LojinhaApp {

    //metodo principal psvm
    public static void main(String[] args){
        Produto meuProduto = new Produto("XPTO", Tamanho.GRANDE);//como criei um construtor para marca e ele está aguadando a marca inicial, então eu passo o paramentro no momento da instanciacao
        ItensInclusos itemIncluso = new ItensInclusos();



        System.out.println(meuProduto.getMarca());//print só pra mostrar que o construtor ja inicia o objeto com a marca xpto
        System.out.println(meuProduto.getTamanho());

        meuProduto.setNome("Play Station 5");
        //meuProduto.valor = 0; //sem encapsulamento
        meuProduto.setValor(56); //com encapsulamento


        meuProduto.setMarca("Nintendo");//Para Marca, vamos criar um construtor na classe Produto.java que já será inicializado logo que se cria o objeto

        //meuProduto.setTamanho2("GRANDE");//se eu quiser que seja somente pequeno, medio ou grande tenho que fazer um condicional no setTamanho2, porem essa não eh a melhor forma..por isso usamos o Enum
        //meuProduto.setTamanho("grande");
        meuProduto.setTamanho(Tamanho.MEDIO);//Como é um enum (com possibilidade definidas), as opcoes ficam limitadas! E isso eh a grande vantagem


        //meuProduto.setItensInclusos("2 controles e 3 jogos");
        //criando uma variavel do tipo list String chamada itensInclusos
        List<String> itensInclusos = new ArrayList<>();//aqui ainda vazia
        itensInclusos.add("2 controles");//adicionando itens na lista...item 0
        itensInclusos.add("3 jogos");//item 1
        itensInclusos.add("2 cabos de energia");//item 2
        meuProduto.setItensInclusos(itensInclusos); //agora temos que passar uma lista de strings

        //System.out.println(itemIncluso.quantidade.get(0));
        //itemIncluso.setQtyAdicional();
        itemIncluso.setQtyeItemAdicional(1, NomeItemAdicional.CONTROLES);
        System.out.print(itemIncluso.getQty() + " ");
        System.out.println(itemIncluso.getItemAdicional());





        System.out.println(meuProduto.getItensInclusos().get(1));//pegando um item especifico da lista
        //System.out.println(meuProduto.getItensInclusos().size());

        System.out.println(meuProduto.getNome());// não apresenta as caracteristicas...pois ele eh um objeto
        System.out.println(meuProduto.getValor());// aqui sim imprime o nome
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());






 /*       String joias = "100gr de Ouro 50k";
        int minhaIdade = 43;
        double meuSalario = 29500.99; //numeros de forma americana com ponto flutuante
        boolean minhaResposta = false;

        System.out.println(minhaIdade);*/



    }

}
