package com.emerson.part;

/**
 * Created by zhangyi on 9/19/16.
 */
public class Filed {

    private final String filedName;
    private String operation;

    public Filed(String filedName) {
        this.filedName = filedName;
    }

    public static Filed filed(String name){
        return new Filed(name);
    }

    public Filed get(Object value){
        this.operation=" >= "+value;//TODO 补充
        return this;
    }

    public Filed gt(Object value){
        this.operation=" > "+value;//TODO 补充
        return this;
    }
    public Filed eq(Object value){
        this.operation=" = "+value;//TODO 补充
        return this;
    }
    public Filed let(Object value){
        this.operation=" <= "+value;//TODO 补充
        return this;
    }
    public Filed lt(Object value){
        this.operation=" < "+value;//TODO 补充
        return this;
    }

    public Filed neq(Object value){
        this.operation=" != "+value;//TODO 补充
        return this;
    }


    public String translate(){
        throw new UnsupportedOperationException();//TODO
    }

}
