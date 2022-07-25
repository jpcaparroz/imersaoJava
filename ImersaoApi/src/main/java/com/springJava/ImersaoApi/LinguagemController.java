package com.springJava.ImersaoApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

    @Autowired
    private LinguagemRepository repository;

    @GetMapping (value ="/linguagem-preferida")
    public String processaLinguagem (){
    
        return "oi, java";
    }
    
    @GetMapping ("/linguagens")
    public List<Linguagem> getLinguagens(){
        List<Linguagem> linguagens = repository.findAll();
        return linguagens;
    }

    @PostMapping("/linguagens")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem){
        Linguagem linguagemSalva =  repository.save(linguagem);

        return linguagemSalva;
    }
}
