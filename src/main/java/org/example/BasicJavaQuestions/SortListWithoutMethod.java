package org.example.BasicJavaQuestions;

import java.util.Arrays;
import java.util.List;

public class SortListWithoutMethod {

    public static void main(String[] args) {
        int[] list = {-1,0,-2,-3,3, 5, 100, 8, 17, 19};
        System.out.println(Arrays.toString(SortListWithoutMethod.sortWithoutMethod(list)));
        System.out.println(SortListWithoutMethod.sortWithoutMethod(Arrays.asList(Arrays.stream(list).boxed().toArray(Integer[]::new))));
    }

    public static int[] sortWithoutMethod(int[] values){
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                int tempI = values[i];
                int tempJ = values[j];
                if (tempI > tempJ) {
                    values[i] = tempJ;
                    values[j] = tempI;
                }
            }
        }
        return values;
    }

    public static List<Integer> sortWithoutMethod(List<Integer> values){
        for(int i=0;i<values.size();i++){
            for (int j=i+1;j<values.size();j++){
                Integer tempI = values.get(i);
                Integer tempJ = values.get(j);
                if (tempI > tempJ){
                    values.add(i,tempJ);
                    values.add(j,tempI);
                }
            }
        }
        return values;
    }
}
