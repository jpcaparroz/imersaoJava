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
        String url = "https://imdb-api.com/en/API/Top250Movies/k_h2ku7xc7";
        URI endereco = URI.create(url);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        // filtrar as informações buscadas com a API (titulo, poster, classificação)
        JsonParser parser = new JsonParser();

        List<Map<String, String>> listaDeFilmes = parser.parse(response.body());

        // exibir e manipular as informações
        for (Map<String,String> filme : listaDeFilmes) {
            System.out.println(filme.get("fullTitle"));
            System.out.println(filme.get("image"));
            System.out.println(filme.get("imDbRating"));
            System.out.println();
        }

    }
}
