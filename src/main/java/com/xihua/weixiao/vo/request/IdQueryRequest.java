package com.xihua.weixiao.vo.request;

/**
 * @ClassName IdQueryRequest
 * @Auhtor ygh
 * @DATE 2019/8/3 18:42
 **/
public class IdQueryRequest extends IdRequest{
    private int current;
    private int size;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
