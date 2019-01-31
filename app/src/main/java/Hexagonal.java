public class Hexagonal extends Shape {
    private int x;
    private int y;

    public Hexagonal(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

}
