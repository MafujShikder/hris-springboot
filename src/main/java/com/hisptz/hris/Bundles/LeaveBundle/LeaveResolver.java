package com.hisptz.hris.Bundles.LeaveBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LeaveResolver {
    @Autowired
    LeaveRepository leaveRepository;

    public LeaveResolver(LeaveRepository leaveRepository) {
        this.leaveRepository = leaveRepository;
    }
}
