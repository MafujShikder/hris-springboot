package com.hisptz.hris.Bundles.LeaveBundle;

import com.hisptz.hris.core.Model.common.ModelSpecification;
import com.hisptz.hris.core.Model.main.ModelQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LeaveQuery extends ModelQuery<Leave> {
    @Autowired
    LeaveRepository leaveRepository;

    private ModelSpecification<Leave> spec;

    public LeaveQuery(LeaveRepository leaveRepository) {
        this.leaveRepository = leaveRepository;
    }

    public Leave getLeaveById(Long id){
        return leaveRepository.getOne(id);
    }

    public List<Leave> Leave(String where, String sort){
        return query(where, spec, leaveRepository, sort);
    }
}
