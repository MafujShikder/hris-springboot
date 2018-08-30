package com.hisptz.hris.Bundles.RelationalFilter;

import com.hisptz.hris.Bundles.UserBundle.User;
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
@RequestMapping("/RelationalFilters")
public class RelationalFilterController extends ModelController<RelationalFilter> {
    @GetMapping()
    public Page<RelationalFilter> getUsers(@RequestParam(required = false) String where, @RequestParam(required = false) String sort){
        return makePage(relationalFilterQuery.RelationalFilters(where, sort));
    }
}
