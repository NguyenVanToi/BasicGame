package minigame;

import javax.swing.*;
import java.awt.*;

public class MainTest extends JFrame {
    public MainTest()
    {
        add(new CollisionDectect());
        setTitle("Collection of two object");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.white);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainTest();
    }
}
