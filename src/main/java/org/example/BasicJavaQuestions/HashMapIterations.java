package org.example.BasicJavaQuestions;

import java.util.*;

public class HashMapIterations {

    public static void main(String args[]){
//        Map<String, Integer> map = new LinkedHashMap<>();
//        map.put("One",1);
//        map.put("Two",2);
//        map.put("Three",3);
//        map.put("Four",4);
//        map.put("Five",5);
//        map.put("Six",6);
//        HashMapIterations.forLoopMap(map);

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("c");

        Set<String> set = new LinkedHashSet<>(list);

        System.out.println(list);
        System.out.println(set);

    }

    public static void whileLoopMap(Map<String, Integer> mapValue){
        Iterator<Map.Entry<String, Integer>> iterator = mapValue.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> new_map = iterator.next();
            System.out.println(new_map.getKey() + " = " + new_map.getValue());
        }
    }

    public static void forEachLoopMap(Map<String, Integer> mapValue){
        mapValue.forEach((key,value) -> System.out.println(key + " = " + value));
    }

    public static void forLoopMap(Map<String, Integer> mapValue){
        Set<String> mapSet = mapValue.keySet();
        String[] mapSetString = mapSet.toArray(new String[0]);
        for (int i=0;i<mapSet.size();i++){
            System.out.println(mapSetString[i] + " = " + mapValue.get(mapSetString[i]));
        }
    }
}
