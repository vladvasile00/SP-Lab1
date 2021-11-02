package models;

public class Dimension {
    private int height;
    private int width;

    public Dimension(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void print() {
        System.out.println("models.Dimension :" + height + "," + width);
    }
}