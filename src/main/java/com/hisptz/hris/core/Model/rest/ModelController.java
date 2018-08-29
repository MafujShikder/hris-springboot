package com.hisptz.hris.core.Model.rest;

import com.hisptz.hris.core.Model.main.Model;
import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Guest on 8/29/18.
 */
@RestController
public class ModelController<T extends Model> extends ModelRepositories {
    //@Autowired
    ModelQuery<T> modelQuery;

}
