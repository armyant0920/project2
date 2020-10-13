package Decode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test3 {


        public static void main(String[] args ) {
            Map map=new HashMap();
            map.put("KE",10);
            map.put("VIN",20);
            map.put("KEVIN",30);

            Set entrtSet=map.entrySet();
            for(Object o:entrtSet){
                Map.Entry entry=(Map.Entry)o;
                System.out.printf("entry.getKey=%s,getValue=%d\n",entry.getKey(),entry.getValue());
            }

            Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
            for(Map.Entry<String,Integer> entry:entrySet){
                System.out.println(entry);
            }
            Map map2=new HashMap();
            map2.put("AE",40);
            entrySet.add((Map.Entry<String, Integer>) map2.entrySet());


            for(Map.Entry<String,Integer> entry:entrySet){
                System.out.println(entry);
            }


        }


    }

