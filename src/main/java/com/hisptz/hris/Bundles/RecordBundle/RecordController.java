package com.hisptz.hris.Bundles.RecordBundle;

import com.hisptz.hris.core.Model.rest.ModelController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Guest on 8/29/18.
 */
@RestController
@RequestMapping("/Record")
public class RecordController extends ModelController<Record>{

    @GetMapping()
    public Page<Record> getRecords(@RequestParam(required = false) String where, @RequestParam(required = false) String sort){
        return makePage(recordQuery.Record(where, sort));
    }

}
