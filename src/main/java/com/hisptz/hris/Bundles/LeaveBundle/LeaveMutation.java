/**
 * NOTES
 * things to work on:
 * 1.add LeaveType on the newLeave function
 * 2.add LeaveType on the updateLeave function
 */

package com.hisptz.hris.Bundles.LeaveBundle;

import com.hisptz.hris.Bundles.LeaveTypeBundle.LeaveTypeRepository;
import com.hisptz.hris.core.Model.main.ModelMutation;
import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class LeaveMutation extends ModelMutation<Leave> {

    public LeaveMutation(LeaveRepository leaveRepository, LeaveTypeRepository leaveTypeRepository) {
        this.leaveRepository = leaveRepository;
        //this.leaveTypeRepository = leaveTypeRepository;
    }

    public Leave newLeave(Integer fieldId, String userName, Date startDate, Date endDate, Integer duration,
            Integer amount, String leaveBenefitApplicable, String leaveBenefitStatus, String phone, String address,
            String email, String leaveDestination, String reason) {

        Leave leave = new Leave(fieldId, userName, startDate, endDate, duration, amount, leaveBenefitApplicable,
                leaveBenefitStatus, phone, address, email, leaveDestination, reason);

//        if(leaveType != null){
//            leave.getLeaveType().add(leaveTypeRepository.getOne(leaveType));
//        }

        leaveRepository.save(leave);
        return leave;

    }

    public Boolean deleteLeave(Long id) {
        return deleteModel(id, leaveRepository);
    }

    public Leave updateLeave(Long id, Integer fieldId, String userName, Date startDate, Date endDate, Integer duration,
            Integer amount, String leaveBenefitApplicable, String leaveBenefitStatus, String phone, String address,
            String email, String leaveDestination, String reason) {
        Leave leave = leaveRepository.getOne(id);

        if (fieldId != null) {
            leave.setFieldId(fieldId);
        }

        if (userName != null) {
            leave.setUserName(userName);
        }

        if (startDate != null) {
            leave.setStartDate(startDate);
        }

        if (endDate != null) {
            leave.setEndDate(endDate);
        }

        if (duration != null) {
            leave.setDuration(duration);
        }

        if (amount != null) {
            leave.setAmount(amount);
        }

        if (leaveBenefitApplicable != null) {
            leave.setLeaveBenefitApplicable(leaveBenefitApplicable);
        }

        if (leaveBenefitStatus != null) {
            leave.setLeaveBenefitStatus(leaveBenefitStatus);
        }

        if (phone != null) {
            leave.setPhone(phone);
        }

        if (address != null) {
            leave.setAddress(address);
        }

        if (email != null) {
            leave.setEmail(email);
        }

        if (leaveDestination != null) {
            leave.setLeaveDestination(leaveDestination);
        }

        if (reason != null) {
            leave.setReason(reason);
        }

//        if(leaveType != null){
//            leave.getLeaveType().add(leaveTypeRepository.getOne(leaveType));
//        }

        return leave;
    }

}
