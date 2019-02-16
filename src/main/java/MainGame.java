import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class MainGame extends JPanel implements ActionListener {
    private Timer timer;
    private Box box;
    private final int DELAY = 10;

    public MainGame ()
    {
        setFocusable(true);
        setBackground(Color.white);
        box = new Box();
        MyApdapter adapt = new MyApdapter(box);
        addKeyListener(adapt);
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(box.getImg(), box.getX(), box.getY(), this);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        box.move();
        repaint();
    }
}
