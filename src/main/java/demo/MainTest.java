package demo;

import javax.swing.JFrame;


public class MainTest extends JFrame
{
    public MainTest()
    {
//        setTitle("demo.MainTest World!");
//        setSize(400, 400);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        add(new demo.LoadImage());
        add(new MainGame());
        setSize(400, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        g.drawString("demo.MainTest world!!!", 200, 100);
//    }

    public static void main(String[] args) {
        new MainTest();
    }
}
