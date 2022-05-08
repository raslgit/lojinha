package br.com.lojinha.pojo; //pojo Plan old java object...aqui sao definidos os atrbutos e os metods que o objeto pode fazer

import br.com.lojinha.enums.Tamanho;

import java.util.List;

//classe para representar os produtos da lojinha - Receita
public class Produto {

    //atributos - aspectos dos produtos - está logo abaixo da classe (raiz da classe) e não do metodo (que seria uma variavel)
    private String nome;
    private String marca;
    private double valor;
    //private String tamanho;
    private Tamanho tamanho; //passando a variável de tipo string para tipo enum Tamanho
    //private String itensInclusos;
    //private List<String> itensInclusos; //Como criar uma lista de Strings
    private List<ItemIncluso> itensInclusos;//criando uma lista de ItemIncluso. Não houve importação pois as classes estão no mesmo package


    //construtor é muito similar a um metodo...é um grupo de acoes que vai acontecer logo que se cira o objeto (instanciacao "new")
    //criando um Constutor (logo apos os atributos)...posso passar paramentros também pra ele
    //Construtor nao tem return...ele somene faz algo
    public Produto(String marcaInicial,Tamanho tamanhoInicial){
        //Definir comandos que serao iniciados durante a instanciacao
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;

    }



    //Metodos
    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }


    public double getValor() {
        return this.valor;
    }

    public void setValor(double novoValor) {
        if (novoValor > 0) {
            this.valor = novoValor;
        }
        else{
            throw new IllegalArgumentException("Valores devem ser maiores que 0!!!!!!!!!!!");//existem dezenas de exceções pra escolher...qual a mehlhor => procurar no google :)
        }
    }


    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho novoTamanho) {
        this.tamanho = novoTamanho;
    }


    public List<ItemIncluso> getItensInclusos() {
        return this.itensInclusos;
    }

    public void setItensInclusos(List<ItemIncluso> novoItemIncluso) {
        this.itensInclusos = novoItemIncluso;
    }




/*################              EXPLICAÇÃO de ENCAPSULAMENTO   #####################################################################

//encapsulamento protege os atributos através do private e de dois metodos criados: um para atribuir valor ao atributo valor e outro para capturar o valor do atributo
//encapsulamento tambem se chama criar os Setter e getters
//encapsulamento eh bom, pois eh possivel setar dentro dos metodos de get e set quais as regrinhas fundamentais do que deve acontecer
//O proprio intlj faz o encapsulamento em: Clicar sobre o atributo private => refactor => encapsuleted fields


    //classe para representar os produtos da lojinha - Receita
    public class Produto {
        //atributos - aspectos dos produtos - está logo abaixo da classe (raiz da classe) e não do metodo (que seria uma variavel)
        public String nome;
        public String marca;
        //private somente para outras classes, nesta classe ele eh enxergado
        private double valor;//encapsulamento protege os atributos através do private e de dois metodos criados: um para atribuir valor ao atributo valor e outro para capturar o valor do atributo
        public String tamanho;
        public String itensInclusos;

        //metodo 1 pra fazer encapsulamento...O proprio itlj é esperto e ja percebe que quero fazer um encapslamento
        public double getValor() {
            return this.valor; //retorne o atributo valor contido neste objeto (produto)
        }

        //metodo 2 pra fazer encapsulamento...para colocar o valor dentro do atributo valor
        //toda a classe externa que quiser interagir com o valor, terá que chamar o metodo setValor
        public void setValor(double novoValor) {
            this.valor = novoValor;
        }
*/

/*
    //Limitando o tamnaho com condicional
    public void setTamanho2(String novoTamanho) {
        if (novoTamanho.equalsIgnoreCase("Pequeno") || novoTamanho.equalsIgnoreCase("grande") || novoTamanho.equalsIgnoreCase("Medio")) {
            this.tamanho = novoTamanho;
        }
        else{
            throw new IllegalArgumentException("Tamanhos pequeno medio ou grande somente");
        }
    }*/


    }
