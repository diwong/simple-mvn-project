package com.evolutionnext.model;

import java.util.Collections;
import java.util.List;

/**
 * Created by diwong on 9/11/15.
 */
public class CalcStats {

    private List<Integer> list;

    public CalcStats(List<Integer> integers) {
        this.list = integers;
    }

    public Integer getMinimum() {
        if (list == null || list.size() == 0)
            return null;

        return Collections.min(list);

        //int min = list.get(0);
        //for (Integer elem: list) {
        //    if (elem != null && elem < min) min = elem;
        //}
        //return min;
    }
}
