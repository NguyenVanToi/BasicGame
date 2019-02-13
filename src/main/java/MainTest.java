import javax.swing.JFrame;


public class MainTest extends JFrame
{
    public MainTest()
    {
        setTitle("MainTest World!");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new LoadImage());
    }

//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        g.drawString("MainTest world!!!", 200, 100);
//    }

    public static void main(String[] args) {
        new MainTest().setVisible(true);
    }
}
