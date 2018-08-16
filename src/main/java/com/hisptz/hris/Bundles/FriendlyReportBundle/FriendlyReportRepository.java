package com.hisptz.hris.Bundles.FriendlyReportBundle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Guest on 8/16/18.
 */
@Repository
public interface FriendlyReportRepository extends JpaRepository<FriendlyReport, Long>{
}
