package com.hisptz.hris.Bundles.DashboardChartBundle;

import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelSpecification;
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

    public DashboardChart getDashboardChartById(Long id){
        return dashboardChartRepository.findOne(id);
    }

    public List<DashboardChart> DashboardCharts(String where, String sort){
        return query(where, spec, dashboardChartRepository, sort);
    }
}
