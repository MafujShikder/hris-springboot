package com.hisptz.hris.Bundles.FriendlyReportBundle;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.Bundles.ArithmeticFilterBundle.ArithmeticFilterRepository;
import com.hisptz.hris.Bundles.RelationalFilter.RelationalFilterRepository;
import com.hisptz.hris.core.Model.ModelMutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/16/18.
 */
@Component
public class FriendlyReportMutation extends ModelMutation<FriendlyReport>{

    public FriendlyReportMutation(FriendlyReportRepository friendlyReportRepository, RelationalFilterRepository relationalFilterRepository, ArithmeticFilterRepository arithmeticFilterRepository) {
        this.friendlyReportRepository = friendlyReportRepository;
        this.relationalFilterRepository = relationalFilterRepository;
        this.arithmeticFilterRepository = arithmeticFilterRepository;
    }

    public FriendlyReport newFriendlyReport(Integer seriesId, String uid, String name, String description, Integer sort, Boolean ignoreskipinreport, Boolean usetargets, Boolean showdeficitsurplus, String type, String sql_statement, String javascript, String stylesheet, Long relationalFilterId, Long arithmeticFilterId) {
        FriendlyReport friendlyReport = new FriendlyReport(seriesId, uid, name, description, sort, ignoreskipinreport, usetargets, showdeficitsurplus, type, sql_statement, javascript, stylesheet);

        if (relationalFilterId != null)
            friendlyReport.getRelationalFilters().add(relationalFilterRepository.findOne(relationalFilterId));

        if (arithmeticFilterId != null)
            friendlyReport.getArithmeticFilters().add(arithmeticFilterRepository.findOne(arithmeticFilterId));

        friendlyReportRepository.save(friendlyReport);
        return friendlyReport;
    }

    public Boolean deleteFriendlyReport(Long id) {
        return deleteModel(id, friendlyReportRepository);
    }

    public FriendlyReport updateFriendlyReport(Long id, Integer seriesId, String uid, String name, String description, Integer sort, Boolean ignoreskipinreport, Boolean usetargets, Boolean showdeficitsurplus, String type, String sql_statement, String javascript, String stylesheet, Long relationalFilterId, Long arithmeticFilterId) {
        FriendlyReport friendlyReport = friendlyReportRepository.findOne(id);

        if (seriesId != null)
            friendlyReport.setSeriesId(seriesId);

        if (uid != null)
            friendlyReport.setUid(uid);

        if (name != null)
            friendlyReport.setName(name);

        if (description != null)
            friendlyReport.setDescription(description);

        if (ignoreskipinreport != null)
            friendlyReport.setIgnoreskipinreport(ignoreskipinreport);

        if (sort != null)
            friendlyReport.setSort(sort);

        if (usetargets != null)
            friendlyReport.setUsetargets(usetargets);

        if (showdeficitsurplus != null)
            friendlyReport.setShowdeficitsurplus(showdeficitsurplus);

        if (type != null)
            friendlyReport.setType(type);

        if (sql_statement != null)
            friendlyReport.setsql_statement(sql_statement);

        if (javascript != null)
            friendlyReport.setJavascript(javascript);

        if (stylesheet != null)
            friendlyReport.setStylesheet(stylesheet);

        if (relationalFilterId != null)
            friendlyReport.getRelationalFilters().add(relationalFilterRepository.findOne(relationalFilterId));

        if (arithmeticFilterId != null)
            friendlyReport.getArithmeticFilters().add(arithmeticFilterRepository.findOne(arithmeticFilterId));

        friendlyReportRepository.save(friendlyReport);
        return friendlyReport;
    }
}
