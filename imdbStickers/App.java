package imdbStickers;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        
        // conectar com HTTP da API > buscar os TOP 250 filmes
        String url = "https://alura-filmes.herokuapp.com/conteudos";
        URI endereco = URI.create(url);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        // filtrar as informações buscadas com a API (titulo, poster, classificação)
        JsonParser parser = new JsonParser();

        List<Map<String, String>> listaDeFilmes = parser.parse(response.body());

        // exibir e manipular as informações
        //Functions func = new Functions();

        for (Map<String,String> filme : listaDeFilmes) {
            System.out.println("Filme: " + filme.get("fullTitle"));
            System.out.println("Poster: " + filme.get("image"));
            System.out.println("Nota: " + filme.get("imDbRating"));
            System.out.println();
        }

    }
}
