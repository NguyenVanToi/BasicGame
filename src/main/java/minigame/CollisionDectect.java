package minigame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class CollisionDectect extends JPanel  implements ActionListener {
    private MyCharacter character;
    private Enemy eneymy;
    private int DELAY = 10;
    private Timer timer;

    public CollisionDectect()
    {
        character = new MyCharacter(50, 50, 50, 50);
        eneymy = new Enemy(100, 100, 50, 50);
        addMouseMotionListener(new MyApdapter());
        timer = new Timer(DELAY, this);
        timer.start();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(character.getX(), character.getY(), character.getWidth(), character.getHeight());
        g.drawRect(eneymy.getX(), eneymy.getY(), eneymy.getWidth(), eneymy.getHeight());
    }

    public void actionPerformed(ActionEvent actionEvent) {
        checkCollision();
        character.move();
        repaint();
    }

    public void checkCollision()
    {
        Rectangle bound_char = character.getBound();
        Rectangle bound_enemy = eneymy.getBound();
        if(bound_char.intersects(bound_enemy))
        {
            System.out.println("Collision!");
        }
    }

    private class MyApdapter extends MouseMotionAdapter
    {
        @Override
        public void mouseMoved(MouseEvent e) {
            character.mouseMoved(e);
        }
    }
}
