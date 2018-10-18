package com.hisptz.hris.Bundles.ReportBundle;

import com.hisptz.hris.core.Model.common.ModelSpecification;
import com.hisptz.hris.core.Model.main.ModelQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReportQuery extends ModelQuery<Report> {
    @Autowired
    ReportRepository reportRepository;

    private ModelSpecification<Report> spec;

    public ReportQuery(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    public Report getReportById(Long id){
        return reportRepository.getOne(id);
    }

    public List<Report> Report(String where, String sort){
        return query(where, spec, reportRepository, sort);
    }
}
