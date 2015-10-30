package com.xmh.kjdbdemo;

import java.io.Serializable;

/**
 * Created by mengh on 2015/10/29 029.
 */
public class Bean implements Serializable{
    String id;
    String value;
    String next;
    int order;

    //region get&set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
    //endregion
}
