package org.example.BasicJavaQuestions;

import java.util.*;

public class DuplicateOccurance {

    public static DuplicateOccurance duplicateOccurance = new DuplicateOccurance();

    public static void main(String[] args) {
//        Map<Character, Integer> dupOccurance = duplicateOccurance.stringCharWithCaseDupOccurance("AaBbCCcDDdFfEEEeee");
//        Set<Map.Entry<Character, Integer>> entrySet = dupOccurance.entrySet();
//
//        for (Map.Entry<Character, Integer> entry : entrySet) {
//            System.out.printf("%s : %d %n ", entry.getKey(), entry.getValue());
//        }

        duplicateCharWithoutHashMap("Aravind Russell V");
    }

    public static void duplicateCharWithoutHashMap(String value){
        int count=0;
        char valueString[] = value.toCharArray();

        for (int i=0;i<valueString.length;i++){
            count = 1;
            for (int j=i+1;j<=valueString.length;i++){
                if (valueString[i]==valueString[j] && valueString[i] != ' '){
                    count++;
                    valueString[j] = '0';
                }
            }
//            if(count > 1 && valueString[i] != '0')
//                System.out.println(valueString[i]);
        }
        System.out.println(valueString);
    }

    public static List<Character> convertStringToCharList(String value) {

        List<Character> charList = new ArrayList<>();
        try {
            for (char ch : value.toCharArray()) {
                charList.add(ch);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return charList;
    }

    public Map<Character, Integer> stringCharDupOccurance(String dupCharString) {

        List<Character> stringOfCharList = convertStringToCharList(dupCharString);
        Map<Character, Integer> mapOccurance = new HashMap<>();

        for (Character num : stringOfCharList) {
            if (mapOccurance.containsKey(num)) {
                mapOccurance.put(num, mapOccurance.get(num) + 1);
            } else {
                mapOccurance.put(num, 1);
            }
        }
        return mapOccurance;
    }

    public Map<Character, Integer> stringCharWithCaseDupOccurance(String dupCharString) {

        List<Character> stringOfCharList = convertStringToCharList(dupCharString);
        Map<Character, Integer> mapOccurance = new HashMap<>();

        for (char num : stringOfCharList) {
            if (mapOccurance.containsKey(num) && Character.isUpperCase(num)) {
                mapOccurance.put(num, mapOccurance.get(num) + 1);
            } else if (mapOccurance.containsKey(num) && Character.isLowerCase(num)) {
                mapOccurance.put(num, mapOccurance.get(num) + 1);
            } else {
                mapOccurance.put(num, 1);
            }
        }
        return mapOccurance;
    }

    public void integerListDupOccurance() {

        List<Integer> integerList = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765);

        Map<Integer, Integer> mapOccurance = new HashMap<>();

        for (Integer num : integerList) {
            if (mapOccurance.containsKey(num)) {
                mapOccurance.put(num, mapOccurance.get(num) + 1);
            } else {
                mapOccurance.put(num, 1);
            }
        }

        System.out.println(mapOccurance);

        Set<Map.Entry<Integer, Integer>> entrySet = mapOccurance.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            System.out.printf("%s : %d %n ", entry.getKey(), entry.getValue());
        }
    }

    public void listFrequencyMethod() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("a");
        list.add("a");
        int countA = Collections.frequency(list, "a");
        int countB = Collections.frequency(list, "b");
        int countC = Collections.frequency(list, "c");
    }
}