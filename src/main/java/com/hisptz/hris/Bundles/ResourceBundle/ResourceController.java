package com.hisptz.hris.Bundles.ResourceBundle;

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
@RequestMapping("/Resources")
public class ResourceController extends ModelController<Resource>{

    @GetMapping()
    public Page<Resource> getResources(@RequestParam(required = false) String where, @RequestParam(required = false) String sort){
        return makePage(resourceQuery.Resources(where, sort));
    }
}
