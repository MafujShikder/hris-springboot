
package com.hisptz.hris.Bundles.UserBundle;

import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class UserQuery extends ModelQuery<User>{
    @Autowired
    protected UserRepository userRepository;
    private ModelSpecification<User> spec;


    public UserQuery(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long id){
        return userRepository.findOne(id);
    }

    public List<User> Users(String where, String sort){
        return query(where, spec, userRepository, sort);
    }

}