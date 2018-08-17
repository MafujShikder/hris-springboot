package com.hisptz.hris.Bundles.FieldBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.core.QueryStructure.QueryCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        Set<Field> tempResults = new HashSet<>(); // maintain only unique items
        List<Field> results = new ArrayList<>();
        List<QueryCriteria> queryCriteriaList = new ArrayList<>();
        List<List<Field>> temps = new ArrayList<>();

        String[] queries = where.split("&");  // get all component queries eg id:ilike:1
        for(String query: queries){
            if (!query.trim().equalsIgnoreCase("")) {
                String[] components = query.split(":");   // get the key, operation and value of the query
                if (components.length == 3) {  // ensure that all the queries are complete
                    if (!(components[0].trim().equalsIgnoreCase("") || components[1].trim().equalsIgnoreCase("") || components[2].trim().equalsIgnoreCase(""))) { // ensure all query arguments are non-empty
                        queryCriteriaList.add(new QueryCriteria(components[0], components[1], components[2]));
                    }
                }
            }
        }

        for (QueryCriteria queryCriteria : queryCriteriaList){
            System.out.println(queryCriteria);
            FieldSpecification spec =
                    new FieldSpecification(new QueryCriteria(queryCriteria.getKey(),queryCriteria.getOperation(),queryCriteria.getValue()));
            temps.add(fieldRepository.findAll(spec)); // add the results of each query into the a list of lists
        }

        for (List temp: temps){
            for (Object field: temp){
                tempResults.add((Field) field); // ensure that only unique elements are returned
            }
        }

        results.addAll(tempResults);// Copy unique elements only
        return results;
    }

}
