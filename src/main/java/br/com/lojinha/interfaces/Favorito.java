package br.com.lojinha.interfaces;

//interface => o nome tem que ser um adjetivo (Neste caso Favorito). Toda classe que usar favorito precisa implementar o contrato
//o uso de interface serve para padronizar o código perante a equipe
public interface Favorito {

    String getDadosFavoritos();//Neste caso o contrato diz que nome, marca e valor são os dados Favoritos. Toda a classe que deseja usar Favorito precisa usar determinados metodos

}
