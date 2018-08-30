package com.hisptz.hris.Bundles.UserBundle;

import com.hisptz.hris.Bundles.RecordBundle.Record;
import com.hisptz.hris.Bundles.RecordBundle.RecordQuery;
import com.hisptz.hris.core.Model.common.ModelQueries;
import com.hisptz.hris.core.Model.rest.ModelController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Guest on 8/30/18.
 */
@RestController
@RequestMapping("/Users")
public class UserController extends ModelController<User>{

    @GetMapping()
    public Page<User> getUsers(@RequestParam(required = false) String where, @RequestParam(required = false) String sort){
        return makePage(userQuery.Users(where, sort));
    }
}
