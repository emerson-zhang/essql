package com.emerson;

import com.emerson.part.Criteria;
import com.emerson.part.SelectPart;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;
import java.util.Map;

/**
 * Created by zhangyi on 9/19/16.
 */
public class ESQLTemplate {


    public <T> T query(SelectPart selectPart,Class<T> clazz){
        List<T> ts = this.queryForList(selectPart, clazz);
        if (ts ==null || ts.isEmpty()){
            throw new EmptyResultDataAccessException(1);
        }

        return ts.get(0);
    }

    public <T> List<T>  queryForList(SelectPart selectPart,Class<T> clazz){
        throw new UnsupportedOperationException("");
    }

    public static void main(String[] args) {
        Criteria gt = Criteria.where("id").is(5)
                .and("xx").gt(90);
        System.out.println(gt);
    }


}
