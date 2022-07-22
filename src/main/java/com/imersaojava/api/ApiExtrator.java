package com.imersaojava.api;

import java.util.List;

import com.imersaojava.model.Conteudo;

public interface ApiExtrator {
    
    public List<Conteudo> extraiConteudos(String json);

}
