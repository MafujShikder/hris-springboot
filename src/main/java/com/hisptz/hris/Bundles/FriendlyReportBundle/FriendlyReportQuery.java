package com.hisptz.hris.Bundles.FriendlyReportBundle;

import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/16/18.
 */
@Component
public class FriendlyReportQuery extends ModelQuery<FriendlyReport>{
    @Autowired
    private FriendlyReportRepository friendlyReportRepository;

    private ModelSpecification<FriendlyReport> spec;

    public FriendlyReportQuery(FriendlyReportRepository friendlyReportRepository) {
        this.friendlyReportRepository = friendlyReportRepository;
    }


    public FriendlyReport getFriendlyReportById(Long id){
        return friendlyReportRepository.findOne(id);
    }

    public List<FriendlyReport> FriendlyReport(String where, String sort){
        return query(where, spec, friendlyReportRepository, sort);
    }

}
