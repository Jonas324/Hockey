package se.jonas;

public class Rectangle {
    private int height;
    private int width;
    private int area;

    public int calculateArea(){
        area = height * width;
        return area;
    }

    Rectangle(int height, int width){
        super();
        setheight(height);
        setwidth(width);
    }

    private void setwidth(int width) {
        this.width = width;
    }

    private void setheight(int height) {
        this.height = height;
    }
}
