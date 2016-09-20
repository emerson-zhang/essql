package com.emerson;

import com.mongodb.Mongo;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.net.UnknownHostException;
import java.util.Map;

/**
 * Created by zhangyi on 9/19/16.
 */
public class Mainnnn {
    public static void main(String[] args) throws UnknownHostException {
        MongoOperations operations=new MongoTemplate(new Mongo("localhost"),"hello");

        operations.find(new Query(new Criteria("lastname").is("adsf").and("").gt("")), Map.class);
    }
}
