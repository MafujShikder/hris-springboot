package com.hisptz.hris.core.Model.common;

import com.hisptz.hris.Bundles.ArithmeticFilterBundle.ArithmeticFilterRepository;
import com.hisptz.hris.Bundles.DashboardChartBundle.DashboardChartRepository;
import com.hisptz.hris.Bundles.DataTypeBundle.DataTypeRepository;
import com.hisptz.hris.Bundles.FieldBundle.FieldRepository;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroupRepository;
import com.hisptz.hris.Bundles.FieldGroupSetBundle.FieldGroupSetRepository;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOptionRepository;
import com.hisptz.hris.Bundles.FieldOptionGroup.FieldOptionGroupRepository;
import com.hisptz.hris.Bundles.FieldOptionGroupSetBundle.FieldOptionGroupSetRepository;
import com.hisptz.hris.Bundles.FieldOptionMergeBundle.FieldOptionMergeRepository;
import com.hisptz.hris.Bundles.FormBundle.FormRepository;
import com.hisptz.hris.Bundles.FormSectionBundle.FormSectionRepository;
import com.hisptz.hris.Bundles.FriendlyReportBundle.FriendlyReportRepository;
import com.hisptz.hris.Bundles.InputTypeBundle.InputTypeRepository;
//import com.hisptz.hris.Bundles.LeaveBundle.LeaveRepository;
import com.hisptz.hris.Bundles.LeaveTypeBundle.LeaveTypeRepository;
import com.hisptz.hris.Bundles.OrganisationunitBundle.OrganisationunitRepository;
import com.hisptz.hris.Bundles.OrganisationunitCompletenessBundle.OrganisationunitCompletenessRepository;
import com.hisptz.hris.Bundles.OrganisationunitGroupBundle.OrganisationunitGroupRepository;
import com.hisptz.hris.Bundles.OrganisationunitGroupsetBundle.OrganisationunitGroupsetRepository;
import com.hisptz.hris.Bundles.OrganisationunitLevelBundle.OrganisationunitLevelRepository;
import com.hisptz.hris.Bundles.RecordBundle.RecordRepository;
import com.hisptz.hris.Bundles.RecordValue.RecordValueRepository;
import com.hisptz.hris.Bundles.RelationalFilter.RelationalFilterRepository;
import com.hisptz.hris.Bundles.ReportBundle.ReportRepository;
import com.hisptz.hris.Bundles.ResourceBundle.ResourceRepository;
import com.hisptz.hris.Bundles.TrainersBundle.TrainerRepository;
import com.hisptz.hris.Bundles.TrainingBundle.TrainingRepository;
import com.hisptz.hris.Bundles.TrainingInstanceBundle.TrainingInstanceRepository;
import com.hisptz.hris.Bundles.TrainingSponsorsBundle.TrainingSponsorsRepository;
import com.hisptz.hris.Bundles.TrainingVenuesBundle.TrainingVenueRepository;
import com.hisptz.hris.Bundles.UserBundle.UserRepository;
import com.hisptz.hris.Bundles.UserGroupBundle.UserGroupRepository;
import com.hisptz.hris.Bundles.UserSettingBundle.UserSettingRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Guest on 8/27/18.
 */
public class ModelRepositories {
    @Autowired
    protected UserRepository userRepository;

    @Autowired
    protected ResourceRepository resourceRepository;
    @Autowired
    protected RelationalFilterRepository relationalFilterRepository;

    @Autowired
    protected FieldOptionRepository fieldOptionRepository;

    @Autowired
    protected FriendlyReportRepository friendlyReportRepository;

    @Autowired
    protected InputTypeRepository inputTypeRepository;

    @Autowired
    protected ArithmeticFilterRepository arithmeticFilterRepository;

    @Autowired
    protected FormSectionRepository formSectionRepository;

    @Autowired
    protected FormRepository formRepository;

    @Autowired
    protected FieldOptionMergeRepository fieldOptionMergeRepository;

    @Autowired
    protected FieldOptionGroupSetRepository fieldOptionGroupSetRepository;

    @Autowired
    protected FieldOptionGroupRepository fieldOptionGroupRepository;

    @Autowired
    protected FieldRepository fieldRepository;

    @Autowired
    protected FieldGroupSetRepository fieldGroupSetRepository;

    @Autowired
    protected FieldGroupRepository fieldGroupRepository;

    @Autowired
    protected DataTypeRepository dataTypeRepository;

    @Autowired
    protected DashboardChartRepository dashboardChartRepository;

    @Autowired
    protected RecordRepository recordRepository;

    @Autowired
    protected RecordValueRepository recordValueRepository;

//    @Autowired
//    protected LeaveRepository leaveRepository;
//
    @Autowired
    protected LeaveTypeRepository leaveTypeRepository;

    @Autowired
    protected OrganisationunitRepository organisationunitRepository;

    @Autowired
    protected OrganisationunitCompletenessRepository organisationunitCompletenessRepository;

    @Autowired
    protected OrganisationunitGroupRepository organisationunitGroupRepository;

    @Autowired
    protected OrganisationunitGroupsetRepository organisationunitGroupsetRepository;

    @Autowired
    protected OrganisationunitLevelRepository organisationunitLevelRepository;

    @Autowired
    protected ReportRepository reportRepository;

    @Autowired
    protected TrainerRepository trainerRepository;

    @Autowired
    protected TrainingInstanceRepository trainingInstanceRepository;

    @Autowired
    protected TrainingSponsorsRepository trainingSponsorsRepository;

    @Autowired
    protected TrainingVenueRepository trainingVenueRepository;

    @Autowired
    protected TrainingRepository trainingRepository;

    @Autowired
    protected UserGroupRepository userGroupRepository;

    @Autowired
    protected UserSettingRepository userSettingRepository;

}
