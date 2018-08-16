package com.hisptz.hris.Bundles.FriendlyReportBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/16/18.
 */
@Component
public class FriendlyReportQuery implements GraphQLQueryResolver{
    @Autowired
    private FriendlyReportRepository friendlyReportRepository;

    public FriendlyReportQuery(FriendlyReportRepository friendlyReportRepository) {
        this.friendlyReportRepository = friendlyReportRepository;
    }

    public List<FriendlyReport> friendlyReports(){
        return friendlyReportRepository.findAll();
    }

    public FriendlyReport getFriendlyReportById(Long id){
        return friendlyReportRepository.findOne(id);
    }

}
