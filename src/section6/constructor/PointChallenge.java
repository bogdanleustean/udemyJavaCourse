package section6.constructor;

import java.awt.*;

public class PointChallenge {
    private int x;
    private int y;

    public PointChallenge() {
    }

    public PointChallenge(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(((this.x)*(this.x))+((this.y)*(this.y)));
    }

    public double distance(int x, int y){
        return Math.sqrt(((this.x-x)*(this.x-x))+((this.y-y)*(this.y-y)));
    }

    public double distance(Point point){
        return Math.sqrt(((this.x-point.x)*(this.x-point.x))+((this.y-point.y)*(this.y-point.y)));
    }
}