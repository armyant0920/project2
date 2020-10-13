package Decode;

import java.util.Scanner;

public class Test1 {


    public static void main(String[] args) {

        HandleData data = new HandleData("hekko123");
        data.showData();
        data.showEncryptData();
        System.out.println(data.unEncrypt());








  /*      while(true){
            System.out.println("請輸入隨機英文字母長度");
            Scanner input=new Scanner(System.in);

            HandleData myData=new HandleData(input.nextInt());
            myData.showData();

            myData.showEncryptData();
            System.out.println(myData.unEncrypt());


        }*/

    }
}
