package se.jonas;

public class Point {   

    private int xPosition;
    private int yPosition;

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    Point(int x, int y) {
        super();

        setxPosition(x);
        setyPosition(y);
    }
}
