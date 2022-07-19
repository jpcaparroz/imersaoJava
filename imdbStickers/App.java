package imdbStickers;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {

    // resetando cor do texto
    public static final String ANSI_RESET = "\u001B[0m";
  
    // mudando cor do texto
    public static final String ANSI_GREEN = "\u001B[32m" + " \u001B[42m";

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
        Functions func = new Functions();
        StickerGerator gerator = new StickerGerator();

        for (Map<String,String> filme : listaDeFilmes) {
            System.out.println("Filme: " + filme.get("fullTitle"));
            System.out.println("Poster: " + filme.get("image"));
            System.out.println(ANSI_GREEN + "Nota: " + filme.get("imDbRating") + func.ratingStars(filme.get("imDbRating")) + ANSI_RESET);
            System.out.println();

            // gerando a figurinha personalizada
            gerator.criar(filme.get("image"), filme.get("title"), filme.get("title"));
        }

    }
}
