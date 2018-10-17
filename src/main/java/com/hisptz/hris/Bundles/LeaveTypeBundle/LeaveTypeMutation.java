package com.hisptz.hris.Bundles.LeaveTypeBundle;

import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

@Component
public class LeaveTypeMutation extends ModelMutation<LeaveType> {
    public LeaveTypeMutation(LeaveTypeRepository leaveTypeRepository) {
        this.leaveTypeRepository = leaveTypeRepository;
    }

    public LeaveType newLeaveType(Integer fieldId, String name, Integer maximumDays, String limitApplicable,
            String description, String paymentApplicable) {
        LeaveType leaveType = new LeaveType(fieldId, name, maximumDays, limitApplicable, description,
                paymentApplicable);

        leaveTypeRepository.save(leaveType);
        return leaveType;
    }

    public Boolean deleteLeaveType(Long id) {
        return deleteModel(id, leaveTypeRepository);
    }

    public LeaveType updateLeaveType(Long id, Integer fieldId, String name, Integer maximumDays, String limitApplicable,
            String description, String paymentApplicable) {
        LeaveType leaveType = leaveTypeRepository.getOne(id);

        if (fieldId != null) {
            leaveType.setFieldId(fieldId);
        }

        if (name != null) {
            leaveType.setName(name);
        }

        if (maximumDays != null) {
            leaveType.setMaximumDays(maximumDays);
        }

        if (limitApplicable != null) {
            leaveType.setLimitApplicable(limitApplicable);
        }

        if (description != null) {
            leaveType.setDescription(description);
        }

        if (paymentApplicable != null) {
            leaveType.setPaymentApplicable(paymentApplicable);
        }

        return leaveType;
    }

}
