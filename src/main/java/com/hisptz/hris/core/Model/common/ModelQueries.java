package com.hisptz.hris.core.Model.common;

import com.hisptz.hris.Bundles.ArithmeticFilterBundle.ArithmeticFilter;
import com.hisptz.hris.Bundles.ArithmeticFilterBundle.ArithmeticFilterQuery;
import com.hisptz.hris.Bundles.DashboardChartBundle.DashboardChart;
import com.hisptz.hris.Bundles.DashboardChartBundle.DashboardChartQuery;
import com.hisptz.hris.Bundles.DataTypeBundle.DataType;
import com.hisptz.hris.Bundles.DataTypeBundle.DataTypeQuery;
import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.Bundles.FieldBundle.FieldQuery;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroup;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroupQuery;
import com.hisptz.hris.Bundles.FieldGroupSetBundle.FieldGroupSet;
import com.hisptz.hris.Bundles.FieldGroupSetBundle.FieldGroupSetQuery;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOption;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOptionQuery;
import com.hisptz.hris.Bundles.FieldOptionGroupSetBundle.FieldOptionGroupSet;
import com.hisptz.hris.Bundles.FieldOptionGroupSetBundle.FieldOptionGroupSetQuery;
import com.hisptz.hris.Bundles.FieldOptionMergeBundle.FieldOptionMerge;
import com.hisptz.hris.Bundles.FieldOptionMergeBundle.FieldOptionMergeQuery;
import com.hisptz.hris.Bundles.FormBundle.FormQuery;
import com.hisptz.hris.Bundles.FormSectionBundle.FormSection;
import com.hisptz.hris.Bundles.FormSectionBundle.FormSectionQuery;
import com.hisptz.hris.Bundles.FriendlyReportBundle.FriendlyReportQuery;
import com.hisptz.hris.Bundles.InputTypeBundle.InputType;
import com.hisptz.hris.Bundles.InputTypeBundle.InputTypeQuery;
//import com.hisptz.hris.Bundles.LeaveBundle.LeaveQuery;
//import com.hisptz.hris.Bundles.LeaveTypeBundle.LeaveTypeQuery;
import com.hisptz.hris.Bundles.RecordBundle.RecordQuery;
import com.hisptz.hris.Bundles.RecordValue.RecordValue;
import com.hisptz.hris.Bundles.RecordValue.RecordValueQuery;
import com.hisptz.hris.Bundles.RelationalFilter.RelationalFilter;
import com.hisptz.hris.Bundles.RelationalFilter.RelationalFilterQuery;
import com.hisptz.hris.Bundles.ResourceBundle.ResourceQuery;
import com.hisptz.hris.Bundles.UserBundle.UserQuery;
import org.springframework.beans.factory.annotation.Autowired;

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
    protected  FieldGroupQuery fieldGroupQuery;

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

//    @Autowired
//    protected LeaveTypeQuery leaveTypeQuery;
//
//    @Autowired
//    protected LeaveQuery leaveQuery;

}
