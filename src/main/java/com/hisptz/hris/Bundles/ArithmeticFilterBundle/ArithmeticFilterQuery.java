package com.hisptz.hris.Bundles.ArithmeticFilterBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class ArithmeticFilterQuery implements GraphQLQueryResolver {
    @Autowired
    private ArithmeticFilterRepository arithmeticFilterRepository;

    public ArithmeticFilterQuery(ArithmeticFilterRepository arithmeticFilterRepository) {
        this.arithmeticFilterRepository = arithmeticFilterRepository;
    }

    public List<ArithmeticFilter> arithmeticFilters(){
       return arithmeticFilterRepository.findAll();
    }

    public ArithmeticFilter getArithmeticFilterById(Long id){
        return arithmeticFilterRepository.findOne(id);
    }
}
