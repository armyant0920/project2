package Map;

import java.awt.*;
import java.util.Random;

public class BasicObj {
    private Point point;
    private int radius;
    private Color color;
    private double angle;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public BasicObj(Container container){
        Random rnd=new Random();
        Point endPoint=new Point(container.getWidth(),container.getHeight());//抓長高,如果有其他元件可能會影響準確度

        point=new Point(rnd.nextInt(endPoint.x),rnd.nextInt(endPoint.y));
        radius=rnd.nextInt(100);
        color=new Color(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
        angle=rnd.nextInt(360);
        speed=10;
    }

    public void move(){

            point.translate((int)(speed*Math.cos(Math.toRadians(angle))),(int)(speed*Math.sin(Math.toRadians(angle))));



    }
    public BasicObj(Point point, int radius, Color color) {
        this.point = point;
        this.radius = radius;
        this.color = color;
    }
}
