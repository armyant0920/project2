package Decode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test3 {


        public static void main(String[] args ) {
            Map map=new HashMap();
            map.put("KE",10);
            map.put("VIN",20);
            map.put("KEVIN",30);

            Set entrtSet=map.entrySet();
            System.out.println(map.entrySet().getClass());
            for(Object o:entrtSet){
                Map.Entry entry=(Map.Entry)o;
                System.out.printf("entry.getKey=%s,getValue=%d\n",entry.getKey(),entry.getValue());
            }
            System.out.println(entrtSet);
            System.out.println(entrtSet.getClass());
            Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
            for(Map.Entry<String,Integer> entry:entrySet){
                System.out.println(entry);
            }
            Map map2=new HashMap();

            map2.put("AE",40);

            Set set=map2.entrySet();

//            Map.Entry e= (Map.Entry) map2.entrySet();
            for(Object o:set){
                Map.Entry ee=(Map.Entry)o;


                System.out.printf("%s,%d\n",ee.getKey(),ee.getValue());
            }

            map.putAll(map2);
            System.out.println("=============");
            Iterator<Map.Entry<String,Integer>> it =map.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry<String,Integer> entry=it.next();
                System.out.println(entry);
            }



         /*   for(Map.Entry<String,Integer> entry:set){
                System.out.println(set);

            }*/








        }


    }

