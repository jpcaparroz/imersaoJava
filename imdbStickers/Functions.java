package imdbStickers;

public class Functions {

    public String ratingStars(String nota) {

        String stars = "";

        for (int i = 0; i < Math.floor(Double.parseDouble(nota)); i++) {
             
            stars = stars + " X";
        }

        return stars;
    }

}
