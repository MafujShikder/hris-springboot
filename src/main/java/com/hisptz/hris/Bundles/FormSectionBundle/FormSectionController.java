package com.hisptz.hris.Bundles.FormSectionBundle;

import com.hisptz.hris.Bundles.FormBundle.Form;
import com.hisptz.hris.Bundles.FriendlyReportBundle.FriendlyReport;
import com.hisptz.hris.core.Model.rest.ModelController;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 8/30/18.
 */
@RestController
@RequestMapping("/FormSections")
public class FormSectionController extends ModelController<FormSection> {
    @GetMapping()
    public Page<FormSection> getFormSections(@RequestParam(required = false) String where, @RequestParam(required = false) String sort, @RequestParam(required = false) String query){
        List<FormSection> reports = new ArrayList<>();

        try {
            URL url = new URL("http://localhost:8080/graphql?query={"+ query +"}");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
        } catch (Exception e){

        }
            return makePage(reports);
    }
}
