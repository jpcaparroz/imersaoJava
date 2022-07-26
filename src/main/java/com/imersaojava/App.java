package com.imersaojava;

import java.util.List;

import com.imersaojava.api.ApiExtrator;
import com.imersaojava.api.ApiIMDb;
import com.imersaojava.api.ApiNasa;
import com.imersaojava.model.Conteudo;

public class App {

    // resetando cor do texto
    public static final String ANSI_RESET = "\u001B[0m";
  
    // mudando cor do texto
    public static final String ANSI_GREEN = "\u001B[32m" + " \u001B[42m";

    public static void main(String[] args) throws Exception {
        
        // conectar com HTTP da API 

        //String url = "https://api.nasa.gov/planetary/apod?api_key=lkKwHHS4Bd8vdeHmqvXWJ9mS1U8zIYTZfKCqs8gf&start_date=2022-06-12&end_date=2022-06-14";
        //ApiExtrator extrator = new ApiNasa();
        
        //String url = "https://alura-filmes.herokuapp.com/conteudos";
        //ApiExtrator extrator = new ApiIMDb();

        String url = "https://api-imersao.herokuapp.com/linguagens";
        ApiExtrator extrator = new ApiIMDb();

        ClientHttp client = new ClientHttp();
        String json = client.buscaDados(url);
        
        // exibir e manipular as informações
        List<Conteudo> conteudos = extrator.extraiConteudos(json);

        Functions func = new Functions();

        for (int i = 0; i < 3; i++) {

            Conteudo conteudo = conteudos.get(i);

            func.criarSticker(conteudo.getUrlImagem(), conteudo.getTitulo(), "9");
            System.out.println(i + " -> " + conteudo.getTitulo());
        }

    }
}
