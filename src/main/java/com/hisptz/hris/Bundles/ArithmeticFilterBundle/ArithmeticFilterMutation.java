package com.hisptz.hris.Bundles.ArithmeticFilterBundle;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.Bundles.FriendlyReportBundle.FriendlyReportRepository;
import com.hisptz.hris.core.Model.ModelMutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class ArithmeticFilterMutation extends ModelMutation<ArithmeticFilter>{

    public ArithmeticFilterMutation(ArithmeticFilterRepository arithmeticFilterRepository, FriendlyReportRepository friendlyReportRepository) {
        this.arithmeticFilterRepository = arithmeticFilterRepository;
        this.friendlyReportRepository = friendlyReportRepository;
    }

    public ArithmeticFilter newArithmeticFilter(String uid, String name, String description, String operator, String leftexpression, String rightexpression, Long friendlyReportId){
        ArithmeticFilter arithmeticFilter = new  ArithmeticFilter(uid, name, description, operator, leftexpression, rightexpression);

        if (friendlyReportId != null)
            arithmeticFilter.getFriendlyReports().add(friendlyReportRepository.findOne(friendlyReportId));

        arithmeticFilterRepository.save(arithmeticFilter);
        return arithmeticFilter;
    }

    public Boolean deleteArithmeticFilter(Long id){
        return deleteModel(id, arithmeticFilterRepository);
    }

    public ArithmeticFilter updateArithmeticFilter(Long id, String uid, String name, String description, String operator, String leftexpression, String rightexpression, Long friendlyReportId){
        ArithmeticFilter arithmeticFilter = arithmeticFilterRepository.findOne(id);

        if (uid != null)
            arithmeticFilter.setUid(uid);

        if (name != null)
            arithmeticFilter.setName(name);

        if (description != null)
            arithmeticFilter.setDescription(description);

        if (operator != null)
            arithmeticFilter.setOperator(operator);

        if (leftexpression != null)
            arithmeticFilter.setLeftexpression(leftexpression);

        if (rightexpression != null)
            arithmeticFilter.setRightexpression(rightexpression);

        if (friendlyReportId != null)
            arithmeticFilter.getFriendlyReports().add(friendlyReportRepository.findOne(friendlyReportId));

        return arithmeticFilter;
    }
}
