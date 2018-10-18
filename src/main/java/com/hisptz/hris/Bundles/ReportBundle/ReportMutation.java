package com.hisptz.hris.Bundles.ReportBundle;

import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

@Component
public class ReportMutation extends ModelMutation<Report> {
    public ReportMutation(ReportRepository reportRepository){
        this.reportRepository = reportRepository;
    }

    public Report newReport(String name, String createdBy, String uri, String parameters){
        Report report = new Report(name, createdBy, uri, parameters);

        reportRepository.save(report);
        return  report;
    }

    public Boolean deleteReport(Long id){
        deleteModel(id, reportRepository);
        return true;
    }

    public Report updateReport(Long id, String name, String createdBy, String uri, String parameters){
        Report report = reportRepository.getOne(id);

        if (name != null){
            report.setName(name);
        }

        if(createdBy != null){
            report.setCreatedBy(createdBy);
        }

        if(uri != null){
            report.setUri(uri);
        }

        if(parameters != null){
            report.setParameters(parameters);
        }

        return report;
    }
}
