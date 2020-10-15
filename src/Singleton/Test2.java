package Singleton;

public class Test2 {
    Data1 data;

    public Data1 getData() {
        return data;
    }

    public Test2(){

        data=Data1.getInstance();
    }
}
