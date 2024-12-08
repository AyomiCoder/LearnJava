package learnJava;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Steganography {

    public static void encode(String message, String imagePath, String outputPath) throws IOException {
        BufferedImage image = ImageIO.read(new File(imagePath));
        byte[] messageBytes = message.getBytes();
        int messageIndex = 0;

        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                int pixel = image.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = pixel & 0xff;

                // Modify the least significant bit of the red component
                if (messageIndex < messageBytes.length * 8) {
                    red = (red & 0xFE) | ((messageBytes[messageIndex / 8] >> (7 - (messageIndex % 8))) & 1);
                    messageIndex++;
                }

                pixel = (red << 16) | (green << 8) | blue;
                image.setRGB(i, j, pixel);

                if (messageIndex >= messageBytes.length * 8) {
                    break;
                }
            }
            if (messageIndex >= messageBytes.length * 8) {
                break;
            }
        }

        ImageIO.write(image, "png", new File(outputPath));
    }

    public static void main(String[] args) {
        try {
            encode("Hello World!", "input.png", "output.png");
            System.out.println("Message encoded successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}