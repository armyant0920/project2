package Decode;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        System.out.println(4/4);
        System.out.println(4%4);
        System.out.println(3%4);
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("try");


            try{
                int x=input.nextInt();
                System.out.println(x);
            }catch (Exception e){
                e.printStackTrace();



            }

        }
    }
}
