package com.imersaojava.parser;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.imersaojava.model.Pessoa;

public class JacksonParser {

    public static void main(String[] args) throws Exception {
        
        String json = "{\"nome\":\"Maria da Silva\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        Pessoa pessoa = objectMapper.readValue(json, Pessoa.class);
        
        System.out.println(pessoa.getNome());
    }
    
}
