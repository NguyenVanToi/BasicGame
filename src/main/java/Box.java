import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Box
{
    private int dx; //delta x = x - x0
    private int dy;
    private int x; //position character
    private int y;
    private Image image;
    private final int SPEED = 1;
    public Box()
    {
        ImageIcon imgIcon = new ImageIcon("image/box.png");
        image = imgIcon.getImage();
        x = 50;
        y = 50;
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
                dy = -1;
                break;
            case KeyEvent.VK_DOWN:
                dy = 1;
                break;
            case KeyEvent.VK_LEFT:
                dx = -1;
                break;
            case KeyEvent.VK_RIGHT:
                dx = 1;
                break;
        }
    }public void keyReleased(KeyEvent e)
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
