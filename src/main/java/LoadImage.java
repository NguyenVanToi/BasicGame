import javax.swing.*;
import java.awt.*;

public class LoadImage extends JPanel
{
    private Image image;
    public LoadImage()
    {
        ImageIcon imageIcon = new ImageIcon("image/img.png");
        image = imageIcon.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 100, 100, this);
    }
}
