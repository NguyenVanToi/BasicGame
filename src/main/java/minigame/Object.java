package minigame;

import java.awt.*;

public class Object {
    protected int width;
    protected int height;
    protected int x;
    protected int y;

    public Object (int x, int y, int width, int height)
    {
        this.width  = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public int  getWidth()
    {
        return this.width;
    }

    public int getHeight()
    {
        return this.height;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public Rectangle getBound()
    {
        return new Rectangle(x, y, width, height);
    }
}
