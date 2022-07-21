package com.imersaojava.parser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.imersaojava.model.Filme;

public class JacksonParser {

    public static void main(String[] args) throws Exception {
        
        String url = "https://alura-filmes.herokuapp.com/conteudos";
        URI endereco = URI.create(url);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        ObjectMapper objectMapper = new ObjectMapper();

        Filme filme = (Filme) objectMapper.readValue(response.body(), new TypeReference<Map<String, String>>() {});

        System.out.println(filme);
    }
    
}
