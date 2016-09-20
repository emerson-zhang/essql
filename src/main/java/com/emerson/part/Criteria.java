package com.emerson.part;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhangyi on 9/19/16.
 */
public class Criteria {

    private static final Object NOT_SET = new Object();
    private List<Criteria> criteriaChain ;
    private final LinkedHashMap<String,Object> criteria = new LinkedHashMap<String, Object>();
    //    private final List<Filed> fileds = new LinkedList<Filed>();

    private  Object value = NOT_SET;
    private final String key;

    public Criteria(String key){
        this.key = key;
        criteriaChain = new LinkedList<Criteria>();
        this.criteriaChain.add(this);
    }

    public Criteria(String key,List<Criteria> chain){
        this.key = key;
        this.criteriaChain=chain;
        this.criteriaChain.add(this);
    }

    public static Criteria where(String field){
        return new Criteria(field);
    }

    public Criteria is(Object value){
        this.value =value;
        return this;
    }

    public Criteria gt(Object value){
        this.criteria.put(">",value);
        return this;
    }

    public Criteria and(String field){
        return new Criteria(field,criteriaChain);
    }


}
