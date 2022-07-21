package com.imersaojava;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

public class Functions {

    public static final String STAR = "\u2B50";

    // coloca estrelas ao lado da nota do filme
    public String ratingStars(String nota) {

        String stars = "";

        for (int i = 0; i < Math.floor(Double.parseDouble(nota)); i++) {
             
            stars = stars + "result";
        }

        return stars;
    }

    // cria sticker 
    public void criarSticker(String imageUrl, String imageName, String nota) throws Exception{

        // leitura da imagem
        InputStream inputStream = new URL(imageUrl).openStream() ;
        BufferedImage posterImage =  ImageIO.read(inputStream);

        // cria nova imagem em memória *editada
        int width = posterImage.getWidth() + 100;
        int height = posterImage.getHeight() + 50;

        BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);

        // copiar a imagem original para nova imagem
        Graphics2D graphics = (Graphics2D) newImage.getGraphics();
        graphics.drawImage(posterImage, 0, 0, null);

        // configurar a fonte/cor da frase (SE HOUVER)
        /*
        Font font = new Font("JetBrains Mono", 1, 100);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(font);
        graphics.setBackground(Color.BLACK);

        graphics.drawString(stickerText, (width / 2) - 280, height - 100);
        */

        // editando sticker
        InputStream approvedInput = new FileInputStream("C:/Users/Dricas/Desktop/JoaoPedro/imersaoJava/images/aprovado.png");
        InputStream halfInput = new FileInputStream("C:/Users/Dricas/Desktop/JoaoPedro/imersaoJava/images/quase.png");
        InputStream notInput = new FileInputStream("C:/Users/Dricas/Desktop/JoaoPedro/imersaoJava/images/jamais.png");
          
        if (Double.parseDouble(nota) >= 9) {
            BufferedImage approved = ImageIO.read(approvedInput);
            graphics.drawImage(approved, (width - 370), (height - 300), null);

        } else if (Double.parseDouble(nota) >= 8.4) {
            BufferedImage half = ImageIO.read(halfInput);
            graphics.drawImage(half, (width - 370), (height - 300), null);  

        } else {
            BufferedImage not = ImageIO.read(notInput);
            graphics.drawImage(not, (width - 370), (height - 300), null);

        }

        // escrever a nova imagem em um arquivo
        ImageIO.write(newImage, "png", new File("C:/Users/Dricas/Desktop/JoaoPedro/imersaoJava/images/stickers/" + imageName + ".png"));

    }

    public static void main(String[] args) throws Exception {
        
        String im = "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@.jpg";
        Functions func = new Functions();

        func.criarSticker(im, "rujim", "8");
    }

}
