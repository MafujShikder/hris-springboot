package com.hisptz.hris.Bundles.UserBundle;

import com.hisptz.hris.core.Model.ModelRepository;
import com.hisptz.hris.core.Model.ModelResolver;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/7/18.
 */
@Component
public class UserResolver extends ModelResolver<User> {
    public UserResolver(ModelRepository<User> repository) { super(repository);}
}
