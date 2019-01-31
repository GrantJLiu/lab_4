public abstract class Shape {
    protected int x;
    protected int y;
    String colour = "blue";
    protected int z;


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void setX(int x);
    public abstract void setY(int Y);
}
