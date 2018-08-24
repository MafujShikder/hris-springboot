package com.hisptz.hris.core.Model;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.core.QueryStructure.QueryCriteria;

import java.util.*;

/**
 * Created by Guest on 8/20/18.
 */
public class ModelQuery<T extends Model> implements GraphQLQueryResolver {
    
   public List<QueryCriteria> splitter(String where) {

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

//   public List query(String where, ModelSpecification spec, ModelRepository repository){
//       Set<T> tempResults = new HashSet<>(); // maintain only unique items
//       List<T> results = new ArrayList<>();
//       List<List<T>> temps = new ArrayList<>();
//       List<QueryCriteria> queryCriteriaList = splitter(where);
//
//       for (QueryCriteria queryCriteria : queryCriteriaList){
//           System.out.println(queryCriteria);
//           spec = new ModelSpecification(new QueryCriteria(queryCriteria.getKey(),queryCriteria.getOperation(),queryCriteria.getValue()));
//           temps.add(repository.findAll(spec)); // add the results of each query into the a list of lists
//       }
//
//       for (List temp: temps){
//           for (Object field: temp){
//               tempResults.add((T) field); // ensure that only unique elements are returned
//           }
//       }
//
//       results.addAll(tempResults);// Copy unique elements only
//       return results;
//   }

   public List query(String where, ModelSpecification spec, ModelRepository repository, String orderBy){
        Set<T> tempResults = new HashSet<>(); // maintain only unique items
        List<T> results = new ArrayList<>();
        List<List<T>> temps = new ArrayList<>();

        if (where == null || where.trim().equalsIgnoreCase("")) {
            results = repository.findAll();
        } else {
            List<QueryCriteria> queryCriteriaList = splitter(where);

            for (QueryCriteria queryCriteria : queryCriteriaList) {
                System.out.println(queryCriteria);
                spec = new ModelSpecification(new QueryCriteria(queryCriteria.getKey(), queryCriteria.getOperation(), queryCriteria.getValue()));
                temps.add(repository.findAll(spec)); // add the results of each query into the a list of lists
            }

            for (List temp : temps) {
                for (Object field : temp) {
                    tempResults.add((T) field); // ensure that only unique elements are returned
                }
            }

            results.addAll(tempResults); // Copy unique elements only
        }

        if (orderBy != null) {
            return sorting(results, orderBy);
        } else {
            return results;
        }

    }

    public List<T> sorting(List<T> results, String orderBy){
            if (orderBy.equalsIgnoreCase("asc")){
                results.sort(new Comparator<T>() {
                    @Override
                    public int compare(T o1, T o2) {
                        return compareT(o1, o2, orderBy);
                    }
                });
                return results;
            } else if (orderBy.equalsIgnoreCase("desc")){
                results.sort(new Comparator<T>() {
                    @Override
                    public int compare(T o1, T o2) {
                        return compareT(o1, o2, orderBy);
                    }
                });
                return results;
            } else {
                return results;
            }
    }


    public int compareT(T o1, T o2, String orderBy) {
        if (orderBy.equalsIgnoreCase("asc")) {
            if (o1.getId() < o2.getId()) {
                return -1;
            } else if (o1.getId() > o2.getId()) {
                return 1;
            }
        } else if (orderBy.equalsIgnoreCase("desc")) {
            if (o1.getId() > o2.getId()) {
                return -1;
            } else if (o1.getId() < o2.getId()) {
                return 1;
            }
        }
        return 0;
    }
}
