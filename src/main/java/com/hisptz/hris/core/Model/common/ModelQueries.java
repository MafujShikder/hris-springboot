package com.hisptz.hris.core.Model.common;

import com.hisptz.hris.Bundles.ArithmeticFilterBundle.ArithmeticFilterQuery;
import com.hisptz.hris.Bundles.DashboardChartBundle.DashboardChartQuery;
import com.hisptz.hris.Bundles.DataTypeBundle.DataTypeQuery;
import com.hisptz.hris.Bundles.FieldBundle.FieldQuery;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroupQuery;
import com.hisptz.hris.Bundles.FieldGroupSetBundle.FieldGroupSetQuery;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOptionQuery;
import com.hisptz.hris.Bundles.FieldOptionGroupSetBundle.FieldOptionGroupSetQuery;
import com.hisptz.hris.Bundles.FieldOptionMergeBundle.FieldOptionMergeQuery;
import com.hisptz.hris.Bundles.FormBundle.FormQuery;
import com.hisptz.hris.Bundles.FormSectionBundle.FormSectionQuery;
import com.hisptz.hris.Bundles.FriendlyReportBundle.FriendlyReportQuery;
import com.hisptz.hris.Bundles.InputTypeBundle.InputTypeQuery;
import com.hisptz.hris.Bundles.OrganisationunitGroupsetBundle.OrganisationunitGroupsetQuery;
import com.hisptz.hris.Bundles.OrganisationunitLevelBundle.OrganisationunitLevelQuery;
import com.hisptz.hris.Bundles.RecordBundle.RecordQuery;
import com.hisptz.hris.Bundles.RecordValue.RecordValueQuery;
import com.hisptz.hris.Bundles.RelationalFilter.RelationalFilterQuery;
import com.hisptz.hris.Bundles.ResourceBundle.ResourceQuery;
import com.hisptz.hris.Bundles.TrainersBundle.TrainerQuery;
import com.hisptz.hris.Bundles.TrainingBundle.TrainingQuery;
import com.hisptz.hris.Bundles.UserBundle.UserQuery;
import org.springframework.beans.factory.annotation.Autowired;
 import com.hisptz.hris.Bundles.LeaveTypeBundle.LeaveTypeQuery;
//import com.hisptz.hris.Bundles.LeaveBundle.LeaveQuery;

/**
 * Created by Guest on 8/29/18.
 */
public class ModelQueries {
    @Autowired
    protected RecordQuery recordQuery;

    @Autowired
    protected UserQuery userQuery;

    @Autowired
    protected ResourceQuery resourceQuery;

    @Autowired
    protected RelationalFilterQuery relationalFilterQuery;

    @Autowired
    protected RecordValueQuery recordValueQuery;

    @Autowired
    protected InputTypeQuery inputTypeQuery;

    @Autowired
    protected FriendlyReportQuery friendlyReportQuery;

    @Autowired
    protected FormSectionQuery formSectionQuery;

    @Autowired
    protected FormQuery formQuery;

    @Autowired
    protected FieldOptionMergeQuery fieldOptionMergeQuery;

    @Autowired
    protected FieldGroupSetQuery fieldGroupSetQuery;

    @Autowired
    protected FieldOptionQuery fieldOptionQuery;

    @Autowired
    protected FieldGroupQuery fieldGroupQuery;

    @Autowired
    protected FieldOptionGroupSetQuery fieldOptionGroupSetQuery;

    @Autowired
    protected FieldQuery fieldQuery;

    @Autowired
    protected DataTypeQuery dataTypeQuery;

    @Autowired
    protected DashboardChartQuery dashboardChartQuery;

    @Autowired
    protected ArithmeticFilterQuery arithmeticFilterQuery;

    @Autowired
    protected OrganisationunitLevelQuery organisationunitLevelQuery;

    @Autowired
    protected OrganisationunitGroupsetQuery organisationunitGroupsetQuery;

    @Autowired
    protected TrainerQuery trainerQuery;

    @Autowired
    protected TrainingQuery trainingQuery;

     @Autowired
     protected LeaveTypeQuery leaveTypeQuery;

    // @Autowired
    // protected LeaveQuery leaveQuery;

}
