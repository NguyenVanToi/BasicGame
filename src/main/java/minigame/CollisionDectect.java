package minigame;

import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class CollisionDectect extends JPanel  implements ActionListener {
    private MyCharacter character;
    private Enemy eneymy;
    private Circle circle;
    private int DELAY = 10;
    private Timer timer;

    public CollisionDectect()
    {
        character = new MyCharacter(50, 50, 50, 50);
        eneymy = new Enemy(100, 100, 50, 50);
        circle = new Circle(30, 150, 150);
        addMouseMotionListener(new MyApdapter());
        timer = new Timer(DELAY, this);
        timer.start();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(character.getX(), character.getY(), character.getWidth(), character.getHeight());
        g.drawRect(eneymy.getX(), eneymy.getY(), eneymy.getWidth(), eneymy.getHeight());
        g.drawOval(circle.getX()-circle.getRad(), circle.getY()-circle.getRad(), circle.getRad()*2, circle.getRad()*2);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        checkCollision();
        if(checkCollisionRectAndCir(character.getBound(), circle))
        {
            System.out.println("Collision rect and circle!");
        }
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

    public boolean checkCollisionRectAndCir(Rectangle rect, Circle cir)
    {
        int rectleft = (int) rect.getX();
        int rectright = (int) (rect.getX() + rect.getWidth());
        int recttop = (int) rect.getY();
        int rectbottom = (int) (rect.getY() + rect.getHeight());
        int xC= cir.getX();
        int yC = cir.getY();
        int xA = xC;
        int yA = yC;
        if(xC < rectleft)
        {
            xA = rectleft;
        } else if(xC > rectright)
        {
            xA = rectright;
        }
        if(yC < recttop)
        {
            yA = recttop;
        } else if(yC > rectbottom)
        {
            yA = rectbottom;
        }
        return ((xA-xC)*(xA-xC) + (yA-yC)*(yA-yC)) <= cir.getRad()*cir.getRad();
    }

    private class MyApdapter extends MouseMotionAdapter
    {
        @Override
        public void mouseMoved(MouseEvent e) {
            character.mouseMoved(e);
        }
    }
}
