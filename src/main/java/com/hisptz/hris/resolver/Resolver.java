package com.hisptz.hris.resolver;

import com.hisptz.hris.Bundles.FieldBundle.FieldRepository;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroupRepository;
import com.hisptz.hris.Bundles.FieldGroupSetBundle.FieldGroupSetRepository;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOptionRepository;
import com.hisptz.hris.Bundles.FieldOptionGroup.FieldOptionGroupRepository;
import com.hisptz.hris.Bundles.FieldOptionGroupSetBundle.FieldOptionGroupSetRepository;
import com.hisptz.hris.Bundles.UserBundle.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Guest on 8/13/18.
 */
public class Resolver {
    @Autowired
    protected UserRepository userRepository;

    @Autowired
    protected FieldRepository fieldRepository;

    @Autowired
    protected FieldOptionRepository fieldOptionRepository;

    @Autowired
    protected FieldGroupRepository fieldGroupRepository;

    @Autowired
    protected FieldGroupSetRepository fieldGroupSetRepository;

    @Autowired
    protected FieldOptionGroupRepository fieldOptionGroupRepository;


    @Autowired
    protected FieldOptionGroupSetRepository fieldOptionGroupSetRepository;

    public Resolver(UserRepository userRepository, FieldRepository fieldRepository, FieldOptionRepository fieldOptionRepository, FieldGroupRepository fieldGroupRepository, FieldGroupSetRepository fieldGroupSetRepository, FieldOptionGroupRepository fieldOptionGroupRepository,FieldOptionGroupSetRepository fieldOptionGroupSetRepository) {
        this.userRepository = userRepository;
        this.fieldRepository = fieldRepository;
        this.fieldOptionRepository = fieldOptionRepository;
        this.fieldGroupRepository = fieldGroupRepository;
        this.fieldGroupSetRepository = fieldGroupSetRepository;
        this.fieldOptionGroupRepository = fieldOptionGroupRepository;
        this.fieldOptionGroupSetRepository = fieldOptionGroupSetRepository;
    }
}
