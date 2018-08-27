package com.hisptz.hris.Bundles.ArithmeticFilterBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.core.Model.ModelQuery;
import com.hisptz.hris.core.Model.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class ArithmeticFilterQuery extends ModelQuery<ArithmeticFilter> {
    @Autowired
    private ArithmeticFilterRepository arithmeticFilterRepository;

    private ModelSpecification<ArithmeticFilter> spec;

    public ArithmeticFilterQuery(ArithmeticFilterRepository arithmeticFilterRepository) {
        this.arithmeticFilterRepository = arithmeticFilterRepository;
    }

    public ArithmeticFilter getArithmeticFilterById(Long id){
        return arithmeticFilterRepository.findOne(id);
    }

    public List<ArithmeticFilter> Arithmeticfilter(String where, String sort){
        return query(where, spec, arithmeticFilterRepository, sort);
    }
}
