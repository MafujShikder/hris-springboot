package com.hisptz.hris.Bundles.LeaveTypeBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LeaveTypeResolver implements GraphQLResolver<LeaveType> {
    @Autowired
    LeaveTypeRepository leaveTypeRepository;

    public LeaveTypeResolver(LeaveTypeRepository leaveTypeRepository) {
        this.leaveTypeRepository = leaveTypeRepository;
    }
}
