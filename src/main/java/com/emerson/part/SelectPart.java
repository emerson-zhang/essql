package com.emerson.part;

/**
 * Created by zhangyi on 9/19/16.
 */
public class SelectPart implements Part {

    private final String[] fields;

    public SelectPart(String... fields) {
        this.fields = fields;
    }

    public String translate() {
        throw new UnsupportedOperationException();
    }
}
