package imdbStickers;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;

public class Functions {

    // coloca estrelas ao lado da nota do filme
    public String ratingStars(String nota) {

        String stars = "";

        for (int i = 0; i < Math.floor(Double.parseDouble(nota)); i++) {
             
            stars = stars + " *";
        }

        return stars;
    }

    // cria sticker 
    public void criarSticker(String imageUrl, String stickerText, String imageName) throws Exception{

        // leitura da imagem
        InputStream inputStream = new URL(imageUrl).openStream() ;
        BufferedImage posterImage =  ImageIO.read(inputStream);

        // cria nova imagem em memória *editada
        int width = posterImage.getWidth();
        int height = posterImage.getHeight();

        int newHeight = height + 200;

        BufferedImage newImage = new BufferedImage(width, newHeight, BufferedImage.TRANSLUCENT);

        // copiar a imagem original para nova imagem
        Graphics2D graphics = (Graphics2D) newImage.getGraphics();
        graphics.drawImage(posterImage, 0, 0, null);

        // configurar a fonte/cor da frase
        Font font = new Font("JetBrains Mono", 1, 100);
        graphics.setColor(Color.MAGENTA);
        graphics.setFont(font);

        // escrever uma frase na nova imagem
        graphics.drawString(stickerText, (width / 2) - 200, newHeight - 100);

        // escrever a nova imagem em um arquivo
        ImageIO.write(newImage, "png", new File("stickers/" + imageName + ".png"));

    }

}
