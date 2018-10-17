package com.hisptz.hris.Bundles.LeaveBundle;

import com.hisptz.hris.Bundles.LeaveTypeBundle.LeaveTypeRepository;
import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

@Component
public class LeaveMutation extends ModelMutation<Leave> {

    public LeaveMutation(LeaveRepository leaveRepository, LeaveTypeRepository leaveTypeRepository){
        this.leaveRepository = leaveRepository;
        this.leaveTypeRepository = leaveTypeRepository;
    }
}
