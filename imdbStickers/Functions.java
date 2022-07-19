package imdbStickers;

public class Functions {
        

    public static void main(String[] args) {

        String nota = "5";
        String stars = "\uD83D\uDE80";
        
        for (int i = 0; i < Integer.parseInt(nota); i++) {
             
            System.out.print("\uD83D\uDE00");
        }
    }
    
    // public String ratingStars(String nota) {

    //     String stars = "⭐";

    //     for (int i = 0; i < Integer.parseInt(nota); i++) {
             
    //         stars = stars + "⭐";
    //     }

    //     return stars;
    // }

}
