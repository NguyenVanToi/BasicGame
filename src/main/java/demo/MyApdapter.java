package demo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyApdapter extends KeyAdapter
{
    private Box box;

    public  MyApdapter (Box box)
    {
        this.box = box;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        box.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        box.keyReleased(e);
    }
}