package Decode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestIterator {
    static class People {
        private String name;
        private int age;

        public People(String id, int age) {
            this.name = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


    public static void main(String[] args) {

        People p1 = new People("001", 20);
        People p2 = new People("002", 30);
        People p3 = new People("003", 45);
        //實作1:請實作一個泛型的Map中的key值為people的id，value為people物件，將上述三個people放入Map中
        Map<String, People> map = new HashMap<>();
        map.put(p1.getName(), p1);
        System.out.printf("加入People1: %b\n", map.containsKey(p1.getName()));
        map.put(p2.getName(), p2);
        System.out.printf("加入People2: %b\n", map.containsKey(p2.getName()));
        map.put(p3.getName(), p3);
        System.out.printf("加入People3: %b\n", map.containsKey(p3.getName()));

        //實作2:請用for迴圈或者iterator，計算Map中三人的平均年齡

        int total = 0;
    }

    /**
     * 用Iterator(迭代法)
     */

    private static int iterator方法(Map map) {
        int age = 0;

        Iterable iterable = map.values();//先建立可迭代的資料
        Iterator iterator = iterable.iterator();//
        while (iterator.hasNext()) {
            People people = (People) iterator.next();
            //System.out.println(people.getAge());
            age += people.getAge();
        }


        return age;
    }
}





