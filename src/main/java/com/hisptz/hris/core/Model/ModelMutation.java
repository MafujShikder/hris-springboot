package com.hisptz.hris.core.Model;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.Bundles.ArithmeticFilterBundle.ArithmeticFilterRepository;
import com.hisptz.hris.Bundles.DashboardChartBundle.DashboardChartRepository;
import com.hisptz.hris.Bundles.FieldBundle.FieldRepository;
import com.hisptz.hris.Bundles.FieldDataTypeBundle.FieldDataTypeRepository;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroupRepository;
import com.hisptz.hris.Bundles.FieldGroupSetBundle.FieldGroupSetRepository;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOptionRepository;
import com.hisptz.hris.Bundles.FieldOptionGroup.FieldOptionGroupRepository;
import com.hisptz.hris.Bundles.FieldOptionGroupSetBundle.FieldOptionGroupSetRepository;
import com.hisptz.hris.Bundles.FieldOptionMergeBundle.FieldOptionMergeRepository;
import com.hisptz.hris.Bundles.FormBundle.FormRepository;
import com.hisptz.hris.Bundles.FormSectionBundle.FormSectionRepository;
import com.hisptz.hris.Bundles.FriendlyReportBundle.FriendlyReportRepository;
import com.hisptz.hris.Bundles.InputTypeBundle.InputTypeRepository;
import com.hisptz.hris.Bundles.RelationalFilter.RelationalFilterRepository;
import com.hisptz.hris.Bundles.ResourceBundle.ResourceRepository;
import com.hisptz.hris.Bundles.UserBundle.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Guest on 8/20/18.
 */
public class ModelMutation<T extends Model> extends ModelRepositories implements GraphQLMutationResolver {

    public Boolean deleteModel(Long id, ModelRepository<T> repository){
        repository.delete(repository.findOne(id));
        return true;
    }
}
