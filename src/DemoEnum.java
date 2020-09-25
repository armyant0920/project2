import java.util.Arrays;
import java.util.Scanner;

public class DemoEnum {

    public enum Order implements Command {
        UP(10) {
            @Override
            public void execute() {
                System.out.println("do UP");
            }
        }, LEFT(20) {
            @Override
            public void execute() {
                System.out.println("do LEFT");

            }
        }, RIGHT(30) {
            @Override
            public void execute() {
                System.out.println("do RIGHT");

            }
        }, DOWN(40) {
            @Override
            public void execute() {
                System.out.println("do DOWN");
            }
        };

        private int value;

        Order(int value) {
            this.value = value;
        }

        public void getOrder() {
            System.out.println(getValue());

        }

        public int getValue() {
            return this.value;
        }


    }

    public static void main(String[] s) {

        Order.LEFT.getOrder();

        for (Order order : Order.values()) {
            order.execute();
            //System.out.println(order.toString());
            //System.out.println(order.getValue());
        }


    }
}
