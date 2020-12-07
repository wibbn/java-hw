package lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageComp extends JComponent {
    private Image image;

    public ImageComp(String path)
    {
        try {
            image = ImageIO.read(new File(path)).getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        } catch (IOException ex){
            System.out.println('1');
        }
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }

    public int getWidth()
    {
        return image.getWidth(null);
    }
    public int getHeight()
    {
        return image.getHeight(null);
    }
}