package Map;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestProject implements ActionListener {
    /*    static int angle1, angle2;
        Random rnd = new Random();*/

    static Point p1 = new Point(50, 50);
    static int r1 = 10;
    static int angle1;
    static int speed1 = 10;
    static Point p2 = new Point(100, 50);
    static int r2 = 10;
    static int angle2;
    static int speed2 = 10;
    static Timer timer;
    static boolean collision = false;

    public static void main(String[] args) {
//        Random rnd = new Random();
       /* angle1=rnd.nextInt(360);
        angle2=rnd.nextInt(360);*/
        angle1 = 0;
        angle2 = 180;
        TestProject t = new TestProject();
        timer = new Timer(1000, t);


        System.out.println(Collision.check(p1, r1, p2, r2));
        timer.start();

        while (timer.isRunning()){

        }

        if(collision)
            System.out.printf("碰撞?%b\n",collision);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {

            p1.translate((int) (speed1 * Math.cos(Math.toRadians(angle1))), (int) (speed1 * Math.sin(Math.toRadians(angle1))));
            p2.translate((int) (speed2 * Math.cos(Math.toRadians(angle2))), (int) (speed2 * Math.sin(Math.toRadians(angle2))));
            System.out.printf("Point1 X:%d,Y:%d\nPoint2 X:%d,Y:%d\n", p1.x, p1.y, p2.x, p2.y);
            collision = Collision.check(p1, r1, p2, r2);
            System.out.println(collision);

            if(collision){
                System.out.println("發生碰撞,停止");
                timer.stop();



            }

        }

    }
}
