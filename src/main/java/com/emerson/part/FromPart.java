package com.emerson.part;

/**
 * Created by zhangyi on 9/19/16.
 */
public class FromPart implements Part {

    private final String from;

    public FromPart(String from) {
        this.from = from;
    }

    public String translate() {
        throw new UnsupportedOperationException();
    }
}
