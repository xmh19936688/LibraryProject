package com.xmh.kjdbdemo;

import java.io.Serializable;

/**
 * Created by mengh on 2015/10/29 029.
 */
public class Bean implements Serializable{
    String id;
    String value;

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
    //endregion
}
