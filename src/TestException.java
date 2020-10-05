import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {


        while (true) {

            Scanner input = new Scanner(System.in);
            
            try {
                int i = input.nextInt();
                if(i<1){
                    System.out.println("錯誤");
                }else{
                    System.out.println("PASS");
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();

                System.out.println("輸入錯誤");

            }




        }



    }
}
