package Singleton;

public class Test {


    public static void main(String[] args) {
        Data1 data=Data1.getInstance();
        System.out.println(data.getName());
       System.out.println(data.getNum());
        System.out.printf("hash:%s\n",data);

        Test2 test=new Test2();

        System.out.println(test.getData());




    }
}
