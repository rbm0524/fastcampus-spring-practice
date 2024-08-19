package com.fastcampus.logic;

import java.util.ArrayList;
import java.util.List;

//버블정렬 알고리즘
public class BubbleSort <T extends Comparable<T>> {

    public List<T> sort(List<T> input) {
        List<T> output = new ArrayList<T>(input);

        for(int i = output.size() - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(output.get(j).compareTo(output.get(j + 1)) > 0) {
                    T temp = output.get(j);
                    output.set(j, output.get(j + 1));
                    output.set(j + 1, temp);
                }
            }
        }

        return output;
    }
}
