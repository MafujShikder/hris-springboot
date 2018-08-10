package com.hisptz.hris.Bundles.FieldBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hisptz.hris.Bundles.UserBundle.User;
import com.hisptz.hris.Bundles.UserBundle.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/10/18.
 */
@Component
public class FieldResolver implements GraphQLResolver<Field>{
        @Autowired
        private FieldRepository fieldRepository;

        public FieldResolver(FieldRepository fieldRepository) {
            this.fieldRepository = fieldRepository;
        }

}
