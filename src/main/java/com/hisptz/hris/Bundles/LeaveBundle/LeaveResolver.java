package com.hisptz.hris.Bundles.LeaveBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hisptz.hris.Bundles.LeaveTypeBundle.LeaveTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LeaveResolver implements GraphQLResolver<Leave> {
    @Autowired
    LeaveRepository leaveRepository;

    @Autowired
    LeaveTypeRepository leaveTypeRepository;

    public LeaveResolver(LeaveRepository leaveRepository, LeaveTypeRepository leaveTypeRepository) {
        this.leaveRepository = leaveRepository;
        this.leaveTypeRepository = leaveTypeRepository;
    }
}
