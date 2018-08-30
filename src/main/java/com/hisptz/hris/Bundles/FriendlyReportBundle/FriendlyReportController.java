package com.hisptz.hris.Bundles.FriendlyReportBundle;

import com.hisptz.hris.Bundles.RelationalFilter.RelationalFilter;
import com.hisptz.hris.core.Model.rest.ModelController;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Guest on 8/30/18.
 */
@RestController
@RequestMapping("/FriendlyReports")
public class FriendlyReportController extends ModelController<FriendlyReport>{

    @GetMapping()
    public Page<FriendlyReport> getUsers(@RequestParam(required = false) String where, @RequestParam(required = false) String sort){
        return makePage(friendlyReportQuery.FriendlyReport(where, sort));
    }
}
