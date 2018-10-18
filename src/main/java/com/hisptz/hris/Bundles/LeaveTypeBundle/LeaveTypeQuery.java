package com.hisptz.hris.Bundles.LeaveTypeBundle;

import com.hisptz.hris.core.Model.common.ModelSpecification;
import com.hisptz.hris.core.Model.main.ModelQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LeaveTypeQuery extends ModelQuery<LeaveType> {
    @Autowired
    LeaveTypeRepository leaveTypeRepository;

    private ModelSpecification<LeaveType> spec;

    public LeaveTypeQuery(LeaveTypeRepository leaveTypeRepository) {
        this.leaveTypeRepository = leaveTypeRepository;
    }

    public LeaveType getLeaveTypeById(Long id){
        return leaveTypeRepository.getOne(id);
    }

    public List<LeaveType> LeaveType(String where, String sort){
        return query(where, spec, leaveTypeRepository, sort);
    }
}
