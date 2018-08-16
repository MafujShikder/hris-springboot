package com.hisptz.hris.Bundles.FieldOptionMergeBundle;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.Bundles.FieldBundle.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/16/18.
 */
@Component
public class FieldOptionMergeMutation implements GraphQLMutationResolver{
    @Autowired
    private FieldOptionMergeRepository fieldOptionMergeRepository;

    public FieldOptionMergeMutation(FieldOptionMergeRepository fieldOptionMergeRepository) {
        this.fieldOptionMergeRepository = fieldOptionMergeRepository;
    }

    public FieldOptionMerge newFieldOptionMerge(Integer fieldId, Integer mergedfieldoptionId, String uid, String removedfieldoptionvalue, String removedfieldoptionuid){
        return new FieldOptionMerge(fieldId, mergedfieldoptionId, uid,removedfieldoptionvalue,removedfieldoptionuid);
    }

    public Boolean deleteFieldOptionMerge(Long id){
        fieldOptionMergeRepository.delete(fieldOptionMergeRepository.findOne(id));
        return true;
    }
    public FieldOptionMerge updateFieldOptionMerge(Long id, Integer fieldId, Integer mergedfieldoptionId, String uid, String removedfieldoptionvalue, String removedfieldoptionuid){
        FieldOptionMerge fieldOptionMerge = fieldOptionMergeRepository.findOne(id);

        if (fieldId != null)
            fieldOptionMerge.setFieldId(fieldId);

        if (mergedfieldoptionId != null)
            fieldOptionMerge.setMergedfieldoptionId(mergedfieldoptionId);

        if (uid != null)
            fieldOptionMerge.setUid(uid);

        if (removedfieldoptionvalue != null)
            fieldOptionMerge.setRemovedfieldoptionvalue(removedfieldoptionvalue);

        if (removedfieldoptionuid != null)
            fieldOptionMerge.setRemovedfieldoptionuid(removedfieldoptionuid);

        fieldOptionMergeRepository.save(fieldOptionMerge);
        return fieldOptionMerge;
    }
//
//    newFieldOptionMerge(fieldId:String!,
//                        mergedfieldoptionId:String!,
//                        uid:String!,
//                        removedfieldoptionvalue:String!,
//                        removedfieldoptionuid:String!):FieldOptionMerge!
//
//    deleteFieldOptionMerge(id:ID!):String
//
//    updateFieldOptionMerge(id:ID!, fieldId:String,
//                           mergedfieldoptionId:String,
//                           uid:String,
//                           removedfieldoptionvalue:String,
//                           removedfieldoptionuid:String):FieldOptionMerge
}
