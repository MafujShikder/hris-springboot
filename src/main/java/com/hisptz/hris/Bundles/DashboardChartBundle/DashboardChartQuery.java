package com.hisptz.hris.Bundles.DashboardChartBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/16/18.
 */
@Component
public class DashboardChartQuery implements GraphQLQueryResolver{

    @Autowired
    private DashboardChartRepository dashboardChartRepository;

    public DashboardChartQuery(DashboardChartRepository dashboardChartRepository) {
        this.dashboardChartRepository = dashboardChartRepository;
    }

    public List<DashboardChart> dashboardCharts(){
        return dashboardChartRepository.findAll();
    }

    public DashboardChart getDashboardChartById(Long id){
        return dashboardChartRepository.findOne(id);
    }
}
