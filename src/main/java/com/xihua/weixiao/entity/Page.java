package com.xihua.weixiao.entity;

/**
 * @ClassName Page
 * @Auhtor ygh
 * @DATE 2019/7/31 22:55
 **/
public class Page {
    private int limit;
    private int total;
    private int start;
    private int end;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end =  end;
    }
}
