package com.hisptz.hris.core.Model.rest;

import com.hisptz.hris.Bundles.FormSectionBundle.FormSection;
import com.hisptz.hris.Bundles.FriendlyReportBundle.FriendlyReport;
import com.hisptz.hris.Bundles.RecordBundle.Record;
import com.hisptz.hris.core.Model.common.ModelQueries;
import com.hisptz.hris.core.Model.main.Model;
import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 8/29/18.
 */
@Component
//@RestController
//@RequestMapping("/")
public class ModelController<T extends Model> extends ModelQueries {
    ModelQuery<T> modelQuery;

    public Page<T> makePage( List<T> objects){
        Page<T> page = new PageImpl<T>(objects);
        return page;
    }

   // @GetMapping()
    public Page<T> get(@RequestParam(required = false) String query){
        List<T> reports = new ArrayList<>();

        try {
            URL url = new URL("http://localhost:8080/graphql?query={"+ query +"}");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
        } catch (Exception e){

        }

        return makePage(reports);
    }
}
