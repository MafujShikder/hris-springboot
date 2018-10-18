package com.hisptz.hris.Bundles.ReportBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportResolver implements GraphQLResolver<Report> {
    @Autowired
    ReportRepository reportRepository;

    public ReportResolver(ReportRepository reportRepository){
        this.reportRepository = reportRepository;
    }
}
