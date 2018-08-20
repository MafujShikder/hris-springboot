package com.hisptz.hris.core.Model;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.core.QueryStructure.QueryCriteria;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Guest on 8/20/18.
 */
public class ModelQuery<T extends Model> implements GraphQLQueryResolver {
    
   public List<QueryCriteria> spliter(String where) {

       List<QueryCriteria> queryCriteriaList = new ArrayList<>();
       String[] queries = where.split("&");  // get all component queries eg id:ilike:1
       for (String query : queries) {
           if (!query.trim().equalsIgnoreCase("")) {
               String[] components = query.split(":");   // get the key, operation and value of the query
               if (components.length == 3) {  // ensure that all the queries are complete
                   if (!(components[0].trim().equalsIgnoreCase("") || components[1].trim().equalsIgnoreCase("") || components[2].trim().equalsIgnoreCase(""))) { // ensure all query arguments are non-empty
                       queryCriteriaList.add(new QueryCriteria(components[0], components[1], components[2]));
                   }
               }
           }
       }
       return queryCriteriaList;
   }

   public List query(String where, ModelSpecification spec, ModelRepository repository){
       Set<T> tempResults = new HashSet<>(); // maintain only unique items
       List<T> results = new ArrayList<>();
       List<List<T>> temps = new ArrayList<>();
       List<QueryCriteria> queryCriteriaList = spliter(where);

       for (QueryCriteria queryCriteria : queryCriteriaList){
           System.out.println(queryCriteria);
           spec = new ModelSpecification(new QueryCriteria(queryCriteria.getKey(),queryCriteria.getOperation(),queryCriteria.getValue()));
           temps.add(repository.findAll(spec)); // add the results of each query into the a list of lists
       }

       for (List temp: temps){
           for (Object field: temp){
               tempResults.add((T) field); // ensure that only unique elements are returned
           }
       }

       results.addAll(tempResults);// Copy unique elements only
       return results;
   }
}
