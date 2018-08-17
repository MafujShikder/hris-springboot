package com.hisptz.hris.Bundles.FieldBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.core.QueryStructure.QueryCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldQuery implements GraphQLQueryResolver {
    @Autowired
    protected FieldRepository fieldRepository;

    public FieldQuery(FieldRepository fieldRepository) {
        this.fieldRepository = fieldRepository;
    }

    public List<Field> fields(){
        return fieldRepository.findAll();
    }

    public Field getFieldById(Long id){
        return fieldRepository.findOne(id);
    }


    public List<Field> queryField(String where){
        List<Field> results = new ArrayList<>();
        List<QueryCriteria> queryCriteriaList = new ArrayList<>();

        String[] queries = where.split("&");
        for(String query: queries){
            String[] components = query.split(":");
            queryCriteriaList.add(new QueryCriteria(components[0],components[1],components[2]));
        }

        for (QueryCriteria queryCriteria : queryCriteriaList){
            System.out.println(queryCriteria);
            FieldSpecification spec =
                    new FieldSpecification(new QueryCriteria(queryCriteria.getKey(),queryCriteria.getOperation(),queryCriteria.getValue()));
            results.addAll(fieldRepository.findAll(spec));
        }


        return results;
    }

//    public List<Field> queryField(String where){
//
//       return fieldRepository.findAll();
//    }
}
