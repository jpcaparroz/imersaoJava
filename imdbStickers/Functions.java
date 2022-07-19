package imdbStickers;

public class Functions {


    // coloca estrelas ao lado da nota do filme
    public String ratingStars(String nota) {

        String stars = "";

        for (int i = 0; i < Math.floor(Double.parseDouble(nota)); i++) {
             
            stars = stars + " *";
        }

        return stars;
    }

}
