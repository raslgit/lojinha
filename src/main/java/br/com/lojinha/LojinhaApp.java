//pacote
package br.com.lojinha;

import br.com.lojinha.enums.NomeItemAdicional;
import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

//classe
public class LojinhaApp {

    //metodo principal psvm
    public static void main(String[] args){
        Produto meuProduto = new Produto("JVL", Tamanho.GRANDE);


        System.out.println(meuProduto.getMarca());//print só pra mostrar que o construtor ja inicia o objeto com a marca xpto
        System.out.println(meuProduto.getTamanho());


        meuProduto.setNome("Play Station 5");
        meuProduto.setValor(56); //com encapsulamento
        meuProduto.setMarca("Nintendo");//Para Marca, vamos criar um construtor na classe Produto.java que já será inicializado logo que se cria o objeto
        meuProduto.setTamanho(Tamanho.MEDIO);//Como é um enum (com possibilidade definidas), as opcoes ficam limitadas! E isso eh a grande vantagem



        //Exercicios Práticos Modulo 6...resposta do Julio
        //criando uma variavel do tipo list ItemIncluso chamada itensInclusos
        List<ItemIncluso> itensInclusos = new ArrayList<>();//lista de itensInclusos do tipo ItemIncluso aqui ainda vazia

        ItemIncluso primeiroItemAdicional = new ItemIncluso(2, NomeItemAdicional.CONTROLES);//antes de adicionar, preciso criar os itens...então criando um objeto pra ItemIncluso que ainda está vazio
        itensInclusos.add(primeiroItemAdicional);//adicionando o primeiroItemAdicional na lista itensInclusos...item 0

        ItemIncluso segundoItemAdicional = new ItemIncluso(3, NomeItemAdicional.JOGOS);//novamente antes de adicionar, preciso criar os itens...então criando um objeto pra ItemIncluso que ainda está vazio
        itensInclusos.add(segundoItemAdicional);//adicionando o segundoItemAdicional na lista itensInclusos...item 1

        ItemIncluso terceiroItemAdicional = new ItemIncluso(2, NomeItemAdicional.CABOS_DE_ENERGIA);//novamente...
        itensInclusos.add(terceiroItemAdicional);//adicionando o terceiroItemAdicional na lista itensInclusos...item 2

        System.out.println(itensInclusos);//aqui vem na forma de objeto

        meuProduto.setItensInclusos(itensInclusos);//agora a lista de itensInclusos foi enviada pra dentro do produto

        //como imprimir os ietns da lista?
        System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());
        System.out.println((meuProduto.getItensInclusos().get(0).getNome()));
        System.out.println(meuProduto.getItensInclusos().get(1).getQuantidade());
        System.out.println((meuProduto.getItensInclusos().get(1).getNome()));
        System.out.println(meuProduto.getItensInclusos().get(2).getQuantidade());
        System.out.println((meuProduto.getItensInclusos().get(2).getNome()));


        //com o for tradicional
        for (int i=0; i<itensInclusos.size(); i++){
            System.out.print(meuProduto.getItensInclusos().get(i).getQuantidade());
            System.out.println((meuProduto.getItensInclusos().get(i).getNome()));
        }


        //com o for do julio...para navegar na lista
        //lado esquerdo do : => variavel itemAtual que é do mesmo tipo da lista criada.........lado direito do : a lista propriamente dita
        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()){
            System.out.print(itemAtual.getQuantidade());
            System.out.println((itemAtual.getNome()));
        }




        //System.out.println(meuProduto.getItensInclusos().get(1));//pegando um item especifico da lista
        //System.out.println(meuProduto.getItensInclusos().size());

        System.out.println(meuProduto.getNome());// não apresenta as caracteristicas...pois ele eh um objeto?
        System.out.println(meuProduto.getValor());// aqui sim imprime o nome?
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());






 /*       String joias = "100gr de Ouro 50k";
        int minhaIdade = 43;
        double meuSalario = 29500.99; //numeros de forma americana com ponto flutuante
        boolean minhaResposta = false;

        System.out.println(minhaIdade);*/

        //meuProduto.setItensInclusos("2 controles e 3 jogos");
        //criando uma variavel do tipo list String chamada itensInclusos
        //List<String> itensInclusos = new ArrayList<>();//aqui ainda vazia
        //itensInclusos.add("2 controles");//adicionando itens na lista...item 0
        //itensInclusos.add("3 jogos");//item 1
        //itensInclusos.add("2 cabos de energia");//item 2
        //meuProduto.setItensInclusos(itensInclusos); //agora temos que passar uma lista de strings


        //Exercicios Práticos Modulo 6...minha resposta
        //itemIncluso.setQtyeItemAdicional(1, NomeItemAdicional.CONTROLES);
        //System.out.print(itemIncluso.getQuantidade() + " ");
        //System.out.println(itemIncluso.getNome());



    }

}
