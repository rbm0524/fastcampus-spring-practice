package com.fastcampus.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//구현체를 통한 버블정렬
public class JavaSort <T extends Comparable<T>> {

    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<T>(list);

        Collections.sort(output);

        return output;
    }
}
