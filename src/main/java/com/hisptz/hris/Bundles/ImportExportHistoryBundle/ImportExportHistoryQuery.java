package com.hisptz.hris.Bundles.ImportExportHistoryBundle;

import com.hisptz.hris.core.Model.common.ModelSpecification;
import com.hisptz.hris.core.Model.main.ModelQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ImportExportHistoryQuery extends ModelQuery<ImportExportHistory> {
    @Autowired
    ImportExportHistoryRepository importExportHistoryRepository;

    private ModelSpecification<ImportExportHistory> spec;

    public ImportExportHistoryQuery(ImportExportHistoryRepository importExportHistoryRepository) {
        this.importExportHistoryRepository = importExportHistoryRepository;
    }

    public ImportExportHistory getImportExportHistoryById(Long id){
        return importExportHistoryRepository.getOne(id);
    }

    public List<ImportExportHistory> ImportExportHistory(String where, String sort){
        return query(where, spec, importExportHistoryRepository, sort);
    }
}
