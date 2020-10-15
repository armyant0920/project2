package Singleton;

public class Data1 {

    private int num;
    private String name;
    private static Data1 instance;

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    private Data1(){

        this.num=10;
        this.name="abc";


    }


    public static Data1 getInstance(){
        synchronized (Data1.class){
        if(instance==null) {
            System.out.println("create a new instance");
            instance = new Data1();
        }
            System.out.println("return instance");
        return  instance;

        }
    }

}
