package com.hisptz.hris.Bundles.DashboardChartBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.core.Model.ModelQuery;
import com.hisptz.hris.core.Model.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/16/18.
 */
@Component
public class DashboardChartQuery extends ModelQuery<DashboardChart>{

    @Autowired
    private DashboardChartRepository dashboardChartRepository;

    private ModelSpecification<DashboardChart> spec;

    public DashboardChartQuery(DashboardChartRepository dashboardChartRepository) {
        this.dashboardChartRepository = dashboardChartRepository;
    }

    public List<DashboardChart> dashboardCharts(){
        return dashboardChartRepository.findAll();
    }

    public DashboardChart getDashboardChartById(Long id){
        return dashboardChartRepository.findOne(id);
    }

    public List<DashboardChart> queryDashboardCharts(String where){
        return query(where, spec, dashboardChartRepository);
    }
}
