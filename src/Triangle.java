import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("輸入層數");

            if (input.hasNextInt()) {
                int layer = input.nextInt();
                if (layer < 1) {
                    System.out.println("輸入不正確");
                } else {
                    int current = 1;
                    while (current <= layer) {
                        print(current, layer);
                        current++;
                    }


                }


                System.out.println(layer);
            } else {

                System.out.println("輸入不正確");
            }


        }


    }

    static void print(int current, int layer) {

        int mid = layer;
        for (int i = 0; i < mid - current; i++) {
            System.out.print(" ");

        }
        for (int j = 0; j < current * 2 - 1; j++) {
            System.out.print("*");

        }
        System.out.println();


    }



}

