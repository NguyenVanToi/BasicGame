import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Box
{
    private int x;
    private int y;
    private int dx;
    private int dy;
    private Image image;
    private int SPEED = 3;

    public Box ()
    {
        ImageIcon imageIcon = new ImageIcon("image/box.png");
        image = imageIcon.getImage();
        x = 50;
        y = 50;
    }

    public int getX ()
    {
        return x;
    }

    public int getY ()
    {
        return y;
    }

    public Image getImg ()
    {
        return image;
    }

    public void move()
    {
        x += dx;
        y += dy;
    }
    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        switch (key)
        {
            case KeyEvent.VK_UP:
                dy = -SPEED;
                break;
            case KeyEvent.VK_DOWN:
                dy = SPEED;
                break;
            case KeyEvent.VK_LEFT:
                dx = -SPEED;
                break;
            case KeyEvent.VK_RIGHT:
                dx = SPEED;
                break;
        }
    }

    public void keyReleased(KeyEvent e)
    {
        int key = e.getKeyCode();
        switch (key)
        {
            case KeyEvent.VK_UP:
                dy = 0;
                break;
            case KeyEvent.VK_DOWN:
                dy = 0;
                break;
            case KeyEvent.VK_LEFT:
                dx = 0;
                break;
            case KeyEvent.VK_RIGHT:
                dx = 0;
                break;
        }
    }
}