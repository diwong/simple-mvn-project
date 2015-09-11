package com.evolutionnext.model;

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
        if (list.size() == 0)
            return null;

        return 5;
    }
}
