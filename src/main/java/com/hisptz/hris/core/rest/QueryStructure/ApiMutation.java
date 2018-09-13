package com.hisptz.hris.core.rest.QueryStructure;

import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by Guest on 9/3/18.
 */
public class ApiMutation extends ApiOperation{
    private List<Object> values;
    private MutationType mutationType;

    public ApiMutation(String model, List<String> fields, List<Object> values, MutationType mutationType) {
        this.model = StringUtils.capitalize(model);
        this.fields = fields;
        this.values = values;
        this.mutationType = mutationType;
    }

    public ApiMutation(String model, MutationType mutationType) {
        this.model = StringUtils.capitalize(model);
        this.mutationType = mutationType;
    }

    public ApiMutation(String model, List<String> fields, MutationType mutationType) {
        this.model = StringUtils.capitalize(model);
        this.mutationType = mutationType;
        this.fields = fields;
    }

    public ApiMutation() {
    }

    public List<Object> getValues() {
        return values;
    }

    public void setValues(List<Object> values) {
        this.values = values;
    }

    public MutationType getMutationType() {
        return mutationType;
    }

    public void setMutationType(MutationType mutationType) {
        this.mutationType = mutationType;
    }

//    curl --header "Content-Type:application/json" --request POST
//    --data '{"query":"mutation{newDataType(name:"fieldOne, description:"asdgsdg"){name id description}}'
//    http://localhost:8080/graphql
//    '{"query":"mutation New{newDataType(name:\"fieldOne\"){id}}"}'

    @Override
    public String toString() {
        String thisString = "{\"query\":\"" + "mutation ";

        if (mutationType == MutationType.CREATE){
            thisString += "New{new"+ model +"(" ;
        }else if (mutationType == MutationType.UPDATE){
            thisString += "New{update"+ model +"(" ;
        }else if (mutationType == MutationType.DELETE){
            //'{"query":"mutation New{deleteDataType(id:2)}"}'
            thisString += "New{delete"+ model +"(" ;

            int idIndex = fields.indexOf("id");

            thisString +=  fields.get(idIndex) +":"+ values.get(idIndex);

            thisString += ")}\"}";
            return thisString;
        }

        // parameters and the values
        for (int i = 0; i< fields.size(); i++) {
            if (i < fields.size() -1 )
                thisString += fields.get(i) + ":\\\"" + values.get(i) + "\\\"" + ", ";
            else
                thisString += fields.get(i) + ":\\\"" + values.get(i) + "\\\"";

        }
        thisString += ")";

        // the fields to display
        thisString +=  "{";

        for (String field: fields) {
            thisString = thisString + field + " ";
        }

        thisString = thisString  +"}" +
               "}" + "\"}";

        return thisString;

    }
}
