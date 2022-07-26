package com.imersaojava.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.imersaojava.model.Conteudo;
import com.imersaojava.parser.JsonParser;

public class ApiIMDb implements ApiExtrator {

    public List<Conteudo> extraiConteudos(String json) {

        // filtrar as informações buscadas com a API
        JsonParser parser = new JsonParser();

        List<Map<String, String>> listaDeAtributos = parser.parse(json);

        List<Conteudo> conteudos = new ArrayList<>();

        // preencher lista
        for (Map<String, String> atributos : listaDeAtributos) {

            String titulo = atributos.get("title");
            String urlImagem = atributos.get("image")
                   .replaceAll("(@+)(.*).jpg$", "$1.jpg");
                   
            Conteudo conteudo = new Conteudo(titulo, urlImagem);
            
            conteudos.add(conteudo);
        }

        return conteudos;

    }
    
}
