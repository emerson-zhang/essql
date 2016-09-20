package com.emerson.part;

/**
 * Created by zhangyi on 9/19/16.
 */
public class WherePart implements Part{

    private final Criteria criteria;

    public WherePart(Criteria criteria) {
        this.criteria = criteria;
    }


    public String translate() {
        throw new UnsupportedOperationException();
    }
}
