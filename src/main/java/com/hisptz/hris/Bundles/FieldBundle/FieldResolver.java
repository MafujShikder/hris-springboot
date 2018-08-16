package com.hisptz.hris.Bundles.FieldBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroup;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroupRepository;
import com.hisptz.hris.Bundles.UserBundle.User;
import com.hisptz.hris.Bundles.UserBundle.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/10/18.
 */
@Component
public class FieldResolver implements GraphQLResolver<Field>{
        @Autowired
        private FieldRepository fieldRepository;

        @Autowired
        private FieldGroupRepository fieldGroupRepository;

        public FieldResolver(FieldRepository fieldRepository,FieldGroupRepository fieldGroupRepository ) {
            this.fieldRepository = fieldRepository;
            this.fieldGroupRepository = fieldGroupRepository;
        }

}
