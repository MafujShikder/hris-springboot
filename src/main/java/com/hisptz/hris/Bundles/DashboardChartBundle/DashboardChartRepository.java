package com.hisptz.hris.Bundles.DashboardChartBundle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Guest on 8/16/18.
 */
@Repository
public interface DashboardChartRepository extends JpaRepository<DashboardChart, Long>{
}
