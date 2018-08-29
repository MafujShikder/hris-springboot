package com.hisptz.hris.Bundles.RecordBundle;

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
public class RecordController {
    @Autowired
    RecordQuery recordQuery;

    @GetMapping()
    public Page<Record> getRecords(@RequestParam(required = false) String where, @RequestParam(required = false) String sort){
        Page<Record> page = new PageImpl<Record>(recordQuery.Record(where, sort));
        return page;
    }


}
