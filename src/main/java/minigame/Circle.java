package minigame;

public class Circle {
    private int rad;
    private int x;
    private int y;

    public Circle(int rad, int x, int y)
    {
        this.x = x;
        this.y = y;
        this.rad = rad;
    }

    public int getRad()
    {
        return this.rad;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }
}
